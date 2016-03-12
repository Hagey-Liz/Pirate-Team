/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.GameControl;
import byui.cit260.piratesOfTheOpenSeas.model.Game;
import byui.cit260.piratesOfTheOpenSeas.model.InventoryItem;
import byui.cit260.piratesOfTheOpenSeas.model.Location;
import byui.cit260.piratesOfTheOpenSeas.model.Map;
import citbyui.cit260.piratesOfTheOpenSeas.view.ShipMenuView;
import piratesoftheopenseas.PiratesOfTheOpenSeas;



/**
 *
 * @author Liz
 */
public class GameMenuView extends View{
    
    public GameMenuView(){
            super("\n"
                +"\n--------------------------------------------"
                +"\n|Game Menu                                 |"
                +"\n--------------------------------------------"
                +"\nV - View map"
                +"\nI - View list of items in inventory"
                +"\nA - View list of actors"
                +"\nL - View contents of locaton"
                +"\nM - Move to new locaton"
                +"\nE - Estimate resources needed"
                +"\nB - Decide size of Barrel"
                +"\nF - Fight"
                +"\nP - Pack ship"
                +"\nH - Help"
                +"\nQ - Quit"
                +"\n-------------------------------------------");
    }
    
  
    @Override   
    public boolean doAction(String value){
       value = value.toUpperCase(); //convert choice to upper case

        switch (value){
            case "V": 
                Game currentGame = PiratesOfTheOpenSeas.getCurrentGame();
                this.displayMap(currentGame.getMap());
                break;
            case "I": //display Inventory
                this.displayInventory();
                break;
            case "A": //display the actor list
                this.displayActor();
                break;
            case "L":
                this.displayContents();
                break;
            case "M": //travel to new locaton
                this.moveLocation();
                break;
            case "E": 
                this.estimateResources();
                break;
            case "B": 
                this.barrelSize();
                break;
            case "F":
                this.displayFight();
                break;
            case "P":
                this.packShip();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid selection *** try again");
}
        return false;
    }
    


    public void dislayMenu() {
        
        ShipMenuView shipMenuView = new ShipMenuView();
        
        shipMenuView.display();
        //System.out.println("\n*** displayMenu stub function called ***");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void displayMap(Map map) {
        
        String menu = ""
                +"\n*****************************************************"
                +"\n*****  View Map *****"
                +"\n*****************************************************";
                
                System.out.println(menu);
                
        for(int row = 0; row < map.getLocations().length; row++) {
            
            for (Location location : map.getLocations()[row]) {
            System.out.println("|*****|");
        }
        System.out.println("");// go to next line of row
        
        for(int column = 0; column< map.getLocations()[row].length; column++){
            System.out.println("|" + row + "," + column +"|");
        }
        System.out.println("");// go to next line of row
        
       for (Location location : map.getLocations()[row]) {
            System.out.println("|*@@@*|");
        } 
      Game currentGame = PiratesOfTheOpenSeas.getCurrentGame();
       System.out.println("");
            for (Location location : map.getLocations()[row]) {
                
                if(location == currentGame.getCurrentLocation()) {
                    System.out.print("|*@@@*|");
                } else if (location.isVisited() == true) {
                    System.out.print("|*###*|");
                } else {
                    System.out.print("|*!!!*|");
                }
                
            }
    }
    }

    private void displayInventory() {
     InventoryItem[] inventory = GameControl.getSortedInventoryList();
     
     System.out.println("\nList of Inventory Items");
     System.out.println("Description" + "\t" + "Required" + "\t" + "In Stock");
     
     for (InventoryItem inventoryItem : inventory) {
         
         System.out.println(inventoryItem.getDescription() + "\t" + 
                            inventoryItem.getRequiredAmount() + "\t" +
                            inventoryItem.getQuantityInStock());
     }
    }

    private void displayActor() {
     System.out.println("*** Display Actor ***");   
    }

    private void displayContents() {
     System.out.println("*** Display Content ***");    
    }

    private void moveLocation() {
     System.out.println("*** Move Location ***");    
    }

    private void estimateResources() {
     System.out.println("*** Estimate Resources ***");    
    }

    private void barrelSize() {
         System.out.println("*** Barrel Size ***");
    }

    private void displayFight() {
         System.out.println("*** Fight ***");
    }

    private void packShip() {
    System.out.println("*** Pack Ship ***");
    }
    
}
