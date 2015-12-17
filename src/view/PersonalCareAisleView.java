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
public class PersonalCareAisleView extends View {

    public PersonalCareAisleView() {
        super("Peronal Care. Choose from:\n"
                + "H - Hygiene Kit: $" + Item.HYGIENE_KIT.getItemCost() + " | " + Item.HYGIENE_KIT.getSurvivalPoints() + " Survival Points\n"
                + "T - Toilet Paper: $" + Item.TOILET_PAPER.getItemCost() + " | " + Item.TOILET_PAPER.getSurvivalPoints() + " Survival Points\n"
                + "M - Medicine: $" + Item.MEDICINE.getItemCost() + " | " + Item.MEDICINE.getSurvivalPoints() + " Survival Points\n"
                + "X - Return to previous menu");
    }

    @Override
    public boolean doAction(char input) {

        int currentMoney = Game.getInstance().getPlayer().getMoney();
        int currentSP = Game.getInstance().getPlayer().getCurrentSurvivalPoints();
        
        switch (input) {
            case 'H':
                System.out.println("You selected a hygiene kit.");
                 System.out.println("You bought shoes.");
                String itemName = Item.HYGIENE_KIT.getItemName();
                int itemCost = Item.HYGIENE_KIT.getItemCost();
                int itemSP = Item.HYGIENE_KIT.getSurvivalPoints();

                int newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                int newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
                
            case 'T':
                System.out.println("You bought a toilet paper.");
                itemName = Item.TOILET_PAPER.getItemName();
                itemCost = Item.TOILET_PAPER.getItemCost();
                itemSP = Item.TOILET_PAPER.getSurvivalPoints();

                newMoney = currentMoney - itemCost;

                Game.getInstance().getPlayer().setMoney(newMoney);

                newSP = currentSP + itemSP;
                Game.getInstance().getPlayer().setCurrentSurvivalPoints(newSP);

                displayMoney();
                displaySP();
                break;
                
            case 'M':
                System.out.println("You bought a medicine.");
                itemName = Item.MEDICINE.getItemName();
                itemCost = Item.MEDICINE.getItemCost();
                itemSP = Item.MEDICINE.getSurvivalPoints();

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

