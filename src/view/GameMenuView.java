/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Exception.MapException;
import control.GameControl;
import control.MapControl;
import model.Game;
import model.Location;
import model.MainMap;
import model.StoreAislesCamping;
import model.Item;

/**
 *
 * @author Maxine
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("Game Menu:\n"
                + "M - Map of town\n"
                + "S - Show current location\n"
//                + "C - Complete list of items in game\n"
//                + "I - Inventory list\n"
                + "L - Move to a new location\n"
                + "D - Delivery Center Menu\n"
                + "A - Money Accounts\n"
                + "P - Survival Points Earned\n"
                + "T - Time before hurricane\n"
                + "H - Help Menu\n"
                + "X - Exit to Main Menu\n");
    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'M':
                displayMap();
                break;
//            case 'C':
//                showAllItems();
//            case 'I':
//                inventoryList();
//                break;
            case 'L':
                moveToNewLocation();
                break;
            case 'D':
                showDeliveryCenterMenu();
                break;
            case 'A':
                showMoneyRemaining();
            case 'P':
                survivalPointsEarned();
                break;
            case 'T':
                timeRemaining();
                break;
            case 'H':
                showHelpMenu();
                break;
//            case 'Y':
////                printCampingItemReport();
//                break;
            case 'S':
                showCurrentLocation();
                break;
//            case 'R':
//                showStores();
//                break;
//            case 'B':
//                showHouse();
//                break;
            case 'X':
                return false;
            default:
                System.out.println("Please select a valid input.");
                break;
        }
        return true;

    }

    /**
     * ****************************************************************************
     */
    private void displayMap() {
        MainMap m = Game.getInstance().getMap();
        System.out.println(m.toString());
    }

    /**
     * ****************************************************************************
     */
    private void suppliesList() {
        // this can just be a list that they can view  with the associated survival points and cost
        System.out.println("NOT IMPLEMENTED YET");
    }

    /**
     * ****************************************************************************
     */
    private void inventoryList() {
        System.out.println("NOT IMPLEMENTED YET");
    }

    /**
     * ****************************************************************************
     */
    private void survivalPointsEarned() {

        int currentSP = Game.getInstance().getPlayer().getCurrentSurvivalPoints();
        System.out.println("You currently have: "
                + "" + currentSP + " Survival Points");

        int neededSP = Game.getInstance().getNeededSurvivalPoints();
        int remainingSP = neededSP - currentSP;
        Game.getInstance().getPlayer().setRemainingSurvivalPoints(remainingSP);
        System.out.println("You need to collect: "
                + "" + remainingSP + " more Survival Points in order to survive");
    }

    /**
     * ****************************************************************************
     */
    private void showCurrentLocation() {

        Location currentLocation = Game.getInstance().getPlayer().getLocation();
        System.out.println("You are at: (" + currentLocation.getRow() + ", " + currentLocation.getCol() + ")");
        if (currentLocation.getName() != null) {
            System.out.println("Which is the " + currentLocation.getName().getName());
        }
    }

    /**
     * ****************************************************************************
     */
    private void moveToNewLocation() {
        System.out.println("Every time you move location, 1 hour will be duducted from your remaining time until the Hurricane.");
        System.out.println("Please input coordinates (e.g.  3,4)");
        System.out.println("Location Quick List:");
        System.out.println("H = House: 1,0");
        System.out.println("D = Delivery Center: 1,1");
        System.out.println("M = Mega Store: 4,4");
        System.out.println("C = Camping Store: 0,3");

        try {
            String input = keyboard.readLine();

            String[] coordinates = input.split(",");

            int row = Integer.parseInt(coordinates[0]);
            int col = Integer.parseInt(coordinates[1]);

            MapControl mc = new MapControl();

            mc.movePlayer(Game.getInstance().getPlayer(), Game.getInstance().getMap(), row, col);
            
//            if()

        } catch (MapException me) {
            System.out.println(me.getMessage());
        } catch (Exception e) {
            System.out.println("I couldn't read your input try again");
        }
    }

    /**
     * ****************************************************************************
     */
    private void showMoneyRemaining() {
        System.out.println("You begin the game with $500 to purchase items\n"
                + "you need to prepare for the hurricane.\n");
    }

    /**
     * ****************************************************************************
     */
    private void timeRemaining() {
        int t = Game.getInstance().getPlayer().getTimeRemaining();
        System.out.println("You have " + t + " hours remaining");
    }

    /**
     * ****************************************************************************
     */
    private void showHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    /**
     * ****************************************************************************
     */
    public void printCampingItemReport(StoreAislesCamping printCampingReport) {
//        StoreAislesCamping printCampingReport = new StoreAislesCamping();
//        printCampingReport.display();

    }

    private static void showAllItems() {
        System.out.println("These are all the items available for purchase with\n"
                + " their names, cost, and surival points.\n");
        
        GameControl allItemsList = new GameControl();
        Item[] allItems = GameControl.getAllItems();

    }

    private void showDeliveryCenterMenu() {
        DeliveryCenterView deliveryMenu = new DeliveryCenterView();
        deliveryMenu.display();
    }

    private void showStores() {
        StoreView stores = new StoreView();
        stores.display();
    }

    private void showHouse() {
        HouseView house = new HouseView();
        house.display();
    }
}
