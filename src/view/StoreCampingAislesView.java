/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**********************
 * The aisle views should display a list of items in that aisle.  So we will have to write a 
 * statement that checks which aisle they are in and then gets a list of the items in that 
 * aisle to display to the user and it's associated selection letter.
 **********************/

package view;

import model.Game;
import model.Item;

/**
 *
 * @author Maxine
 */
public class StoreCampingAislesView extends View {
    
    public StoreCampingAislesView() {
        super ("Camping Store Aisles:\n"
                + "T - Tent: $" + Item.TENT.getItemCost() + " | " + Item.TENT.getSurvivalPoints() + " Survival Points\n"
                + "A - Tarp: $" + Item.TARP.getItemCost() + " | " + Item.TARP.getSurvivalPoints() + " Survival Points\n"
                + "F - Fuel: $" + Item.FUEL.getItemCost() + " | " + Item.FUEL.getSurvivalPoints() + " Survival Points\n"
                + "C - Camp Stove: $" + Item.CAMP_STOVE.getItemCost() + " | " + Item.CAMP_STOVE.getSurvivalPoints() + " Survival Points\n"
                + "X - Return to Game Menu");
    }
    
    @Override
    public boolean doAction(char input) {
    
        int currentMoney = Game.getInstance().getPlayer().getMoney();
        int currentSP = Game.getInstance().getPlayer().getCurrentSurvivalPoints();
        
        switch(input) {
            case 'T':
                System.out.println("You bought a tent.");
                String itemName = Item.TENT.getItemName();
                int itemCost = Item.TENT.getItemCost();
                int itemSP = Item.TENT.getSurvivalPoints();

                int newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                int newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
            case 'A':
                 System.out.println("You bought a Tarp.");
                itemName = Item.TARP.getItemName();
                itemCost = Item.TARP.getItemCost();
                itemSP = Item.TARP.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
                
            case 'F':
                 System.out.println("You bought fuel.");
                itemName = Item.FUEL.getItemName();
                itemCost = Item.FUEL.getItemCost();
                itemSP = Item.FUEL.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
            case 'C':
                System.out.println("You bought a camp stove.");
                itemName = Item.CAMP_STOVE.getItemName();
                itemCost = Item.CAMP_STOVE.getItemCost();
                itemSP = Item.CAMP_STOVE.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid input");
                break;
        }
        return true;
    }    

    
      private void displayMoney() {
        
        System.out.println("You now have $" + Game.getInstance().getPlayer().getMoney() + " in your money account.");

    
    }

    private void displaySP() {
        System.out.println("You now have " + Game.getInstance().getPlayer().getCurrentSurvivalPoints() + " Survival Points!");
    
    }
    

   }
