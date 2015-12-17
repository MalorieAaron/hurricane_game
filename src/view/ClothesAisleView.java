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
public class ClothesAisleView extends View {

    public ClothesAisleView() {
        super("Clothes Aisle. Choose from:\n"
                + "J - Jacket: $" + Item.JACKET.getItemCost() + " | " + Item.JACKET.getSurvivalPoints() + " Survival Points\n"
                + "S - Sweatshirt: $" + Item.SWEATSHIRT.getItemCost() + " | " + Item.SWEATSHIRT.getSurvivalPoints() + " Survival Points\n"
                + "Z - Shoes: $" + Item.SHOES.getItemCost() + " | " + Item.SHOES.getSurvivalPoints() + " Survival Points\n"
                + "X - Exit this aisle");
    }

    @Override
    public boolean doAction(char input) {
        
        int currentMoney = Game.getInstance().getPlayer().getMoney();
        int currentSP = Game.getInstance().getPlayer().getCurrentSurvivalPoints();
        
        switch (input) {
            case 'J':
                String itemName = Item.JACKET.getItemName();
                int itemCost = Item.JACKET.getItemCost();
                int itemSP = Item.JACKET.getSurvivalPoints();

                int newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                int newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
                
            case 'S':
                 System.out.println("You bought a Sweat Shirt.");
                itemName = Item.SWEATSHIRT.getItemName();
                itemCost = Item.SWEATSHIRT.getItemCost();
                itemSP = Item.SWEATSHIRT.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
                
            case 'Z':
                 System.out.println("You bought shoes.");
                itemName = Item.SHOES.getItemName();
                itemCost = Item.SHOES.getItemCost();
                itemSP = Item.SHOES.getSurvivalPoints();

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
                System.out.println("Pleae enter a valid input.");
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
