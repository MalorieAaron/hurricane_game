/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Game;
import model.Item;

/**
 *
 * @author Maxine
 */
public class FoodAisleView extends View {

    public FoodAisleView() {
        super("Food Aisle. Choose from: \n"
                + "T - Tuna: $" + Item.TUNA.getItemCost() + " | " + Item.TUNA.getSurvivalPoints() + " Survival Points\n"
                + "P - Protein Bar: $" + Item.PROTEIN_BAR.getItemCost() + " | " + Item.PROTEIN_BAR.getSurvivalPoints() + " Survival Points\n"
                + "L - Beans: $" + Item.BEANS.getItemCost() + " | " + Item.BEANS.getSurvivalPoints() + " Survival Points\n"
                + "W - Water: $" + Item.WATER.getItemCost() + " | " + Item.WATER.getSurvivalPoints() + " Survival Points\n"
                + "B - Bread: $" + Item.BREAD.getItemCost() + " | " + Item.BREAD.getSurvivalPoints() + " Survival Points\n"
                + "C - Crackers: $" + Item.CRACKERS.getItemCost() + " | " + Item.CRACKERS.getSurvivalPoints() + " Survival Points\n"
                + "G - Granola Bars: $" + Item.GRANOLA_BARS.getItemCost() + " | " + Item.GRANOLA_BARS.getSurvivalPoints() + " Survival Points\n"
                + "V - Vegetables: $" + Item.VEGETABLES.getItemCost() + " | " + Item.VEGETABLES.getSurvivalPoints() + " Survival Points\n"
                + "F - Fruit: $" + Item.FRUIT.getItemCost() + " | " + Item.FRUIT.getSurvivalPoints() + " Survival Points\n"
                + "H - Chocolate: $" + Item.CHOCOLATE.getItemCost() + " | " + Item.CHOCOLATE.getSurvivalPoints() + " Survival Points\n"
                    + "O - Cookies: $" + Item.COOKIES.getItemCost() + " | " + Item.COOKIES.getSurvivalPoints() + " Survival Points\n"
                + "A - Candy: $" + Item.CANDY.getItemCost() + " | " + Item.CANDY.getSurvivalPoints() + " Survival Points\n"
                + "X - Return to previous menu\n");

    }

    @Override
    public boolean doAction(char input) {

        int currentMoney = Game.getInstance().getPlayer().getMoney();
        int currentSP = Game.getInstance().getPlayer().getCurrentSurvivalPoints();

        switch (input) {
            case 'T':
                System.out.println("You bought tuna.");

                String itemName = Item.TUNA.getItemName();
                int itemCost = Item.TUNA.getItemCost();
                int itemSP = Item.TUNA.getSurvivalPoints();

                int newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                int newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();

                break;
            case 'P':
                System.out.println("You bought a protein bar.");
                itemName = Item.PROTEIN_BAR.getItemName();
                itemCost = Item.PROTEIN_BAR.getItemCost();
                itemSP = Item.PROTEIN_BAR.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
            case 'L':
                System.out.println("You bought beans.");
                itemName = Item.BEANS.getItemName();
                itemCost = Item.BEANS.getItemCost();
                itemSP = Item.BEANS.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
            case 'W':
                System.out.println("You bought water.");
                itemName = Item.WATER.getItemName();
                itemCost = Item.WATER.getItemCost();
                itemSP = Item.WATER.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
                
            case 'B':
                System.out.println("You bought bread.");
                itemName = Item.BREAD.getItemName();

                itemCost = Item.BREAD.getItemCost();
                itemSP = Item.BREAD.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
            case 'C':
                System.out.println("You bought crackers.");
                itemName = Item.CRACKERS.getItemName();
                itemCost = Item.CRACKERS.getItemCost();
                itemSP = Item.CRACKERS.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;

            case 'G':
                System.out.println("You bought granola bars");
                itemName = Item.GRANOLA_BARS.getItemName();
                itemCost = Item.GRANOLA_BARS.getItemCost();
                itemSP = Item.GRANOLA_BARS.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;

            case 'V':
                System.out.println("You bought vegetables.");
                itemName = Item.VEGETABLES.getItemName();
                itemCost = Item.VEGETABLES.getItemCost();
                itemSP = Item.VEGETABLES.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;

            case 'F':
                System.out.println("You bought fruit.");
                itemName = Item.FRUIT.getItemName();
                itemCost = Item.FRUIT.getItemCost();
                itemSP = Item.FRUIT.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;

            case 'H':
                System.out.println("You bought chocolate.");
                itemName = Item.CHOCOLATE.getItemName();
                itemCost = Item.CHOCOLATE.getItemCost();
                itemSP = Item.CHOCOLATE.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;

            case 'O':
                System.out.println("You bought cookies.");
                itemName = Item.COOKIES.getItemName();
                itemCost = Item.COOKIES.getItemCost();
                itemSP = Item.COOKIES.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;

            case 'A':
                System.out.println("You bought candy.");
                itemName = Item.CANDY.getItemName();
                itemCost = Item.CANDY.getItemCost();
                itemSP = Item.CANDY.getSurvivalPoints();

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
                System.out.println("Please enter a valid input.");

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
