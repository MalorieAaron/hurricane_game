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
                + "T - Tuna\n"
                + "P - Protein Bar\n"
                + "L - Beans\n"
                + "W - Water\n"
                + "B - Bread\n"
                + "C - Crackers\n"
                + "G - Granola Bars\n"
                + "V - Vegetables\n"
                + "F - Fruit\n"
                + "H - Chocolate\n"
                + "O - Cookies\n"
                + "A - Candy\n"
                + "X - Return to previous menu\n");

    }

    @Override
    public boolean doAction(char input) {

        switch (input) {
            case 'T':
                System.out.println("You bought tuna.");
                Item item = Item.TUNA;
                STRING itemName = Item.TUNA.getItemName();
   
                System.out.println("TEST!!!!!" + item);
                
                int itemCost = Item.TUNA.getItemCost();
                int itemSP = Item.TUNA.getSurvivalPoints();
                
                subMoney();
                AddItem();
                
                break;
            case 'P':
                System.out.println("You bought a protein bar.");
                
                item = Item.PROTEIN_BAR;
                itemName = Item.PROTEIN_BAR.getItemName();
                itemCost = Item.PROTEIN_BAR.getItemCost();
                itemSP = Item.PROTEIN_BAR.getSurvivalPoints();
                
                subMoney();
                AddItem();
                break;
            case 'L':
                System.out.println("You bought beans.");
                item = Item.BEANS;
                itemName = Item.BEANS.getItemName();
                itemCost = Item.BEANS.getItemCost();
                itemSP = Item.BEANS.getSurvivalPoints();
                
                subMoney();
                AddItem();
                break;
            case 'W':
                System.out.println("You bought water.");
                item = Item.WATER;
                itemName = Item.WATER.getItemName();
                itemCost = Item.WATER.getItemCost();
                itemSP = Item.WATER.getSurvivalPoints();
                
                subMoney();
                AddItem();
                break;
            case 'B':
                System.out.println("You bought bread.");
                item = Item.BREAD;
                itemName = Item.BREAD.getItemName();
               
                itemCost = Item.BREAD.getItemCost();
                itemSP = Item.BREAD.getSurvivalPoints();
                
                subMoney();
                AddItem();
                
                break;
            case 'C':
                System.out.println("You bought crackers.");
                item = Item.CRACKERS;
                itemName = Item.CRACKERS.getItemName();
                itemCost = Item.CRACKERS.getItemCost();
                itemSP = Item.CRACKERS.getSurvivalPoints();
                
                subMoney();
                AddItem();
                break;
            case 'G':
                System.out.println("You bought granola bars");
                item = Item.GRANOLA_BARS;
                itemName = Item.GRANOLA_BARS.getItemName();
                itemCost = Item.GRANOLA_BARS.getItemCost();
                itemSP = Item.GRANOLA_BARS.getSurvivalPoints();
                
                subMoney();
                AddItem();
                break;
            case 'V':
                System.out.println("You bought vegetables.");
                item = Item.VEGETABLES;
                itemName = Item.VEGETABLES.getItemName();
                itemCost = Item.VEGETABLES.getItemCost();
                itemSP = Item.VEGETABLES.getSurvivalPoints();
                
                subMoney();
                AddItem();
                break;
            case 'F':
                System.out.println("You bought fruit.");
                item = Item.FRUIT;
                itemName = Item.FRUIT.getItemName();
                itemCost = Item.FRUIT.getItemCost();
                itemSP = Item.FRUIT.getSurvivalPoints();
                
                subMoney();
                AddItem();
                break;
            case 'H':
                System.out.println("You bought chocolate.");
                item = Item.CHOCOLATE;
                itemName = Item.CHOCOLATE.getItemName();
                itemCost = Item.CHOCOLATE.getItemCost();
                itemSP = Item.CHOCOLATE.getSurvivalPoints();
                
                subMoney();
                AddItem();
                break;
            case 'O':
                System.out.println("You bought cookies.");
                item = Item.COOKIES;
                itemName = Item.COOKIES.getItemName();
                itemCost = Item.COOKIES.getItemCost();
                itemSP = Item.COOKIES.getSurvivalPoints();
                
                subMoney();
                AddItem();
                break;
            case 'A':
                System.out.println("You bought candy.");
                item = Item.CANDY;
                
                itemName = Item.CANDY.getItemName();
                itemCost = Item.CANDY.getItemCost();
                itemSP = Item.CANDY.getSurvivalPoints();
                
                subMoney();
                AddItem();
                break;
            case 'X':
                return false;
            default:
                System.out.println("Please enter a valid input.");

        }
        
        return true;

    }

    private void subMoney() {
       
        
    }

    private void AddItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
