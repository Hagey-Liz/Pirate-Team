/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.GameControl;
import byui.cit260.piratesOfTheOpenSeas.model.Actor;
import byui.cit260.piratesOfTheOpenSeas.model.Game;
import byui.cit260.piratesOfTheOpenSeas.model.InventoryItem;
import byui.cit260.piratesOfTheOpenSeas.model.Location;
import byui.cit260.piratesOfTheOpenSeas.model.Map;
import citbyui.cit260.piratesOfTheOpenSeas.view.ShipMenuView;
import java.io.PrintWriter;
import piratesoftheopenseas.PiratesOfTheOpenSeas;



/**
 *
 * @author Liz
 */
public class GameMenuView extends View{
    
   private static final PrintWriter errorFile = PiratesOfTheOpenSeas.getOutFile();
   private static final PrintWriter logFile = PiratesOfTheOpenSeas.getLogFile();
    
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
                +"\nS - Select resources needed"
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
       try {
        switch (value){
            case "V": 
                //Game currentGame = PiratesOfTheOpenSeas.getCurrentGame();
                this.displayMap();
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
            case "S": 
                this.selectResources();
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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** try again");
}
       } catch (Exception e) {
           ErrorView.display(this.getClass().getName(),
                   "Error" + e.getMessage());
       }
        return false;
    }
    
    public void dislayMenu() {
        
        ShipMenuView shipMenuView = new ShipMenuView();
        
        shipMenuView.display();
        super.display();
        //System.out.println("\n*** displayMenu stub function called ***");
    }

    private void displayHelpMenu() {
       HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }
    
    
    public  void displayMap() {
         String leftIndicator;
         String rightIndicator;
         
         Game game = PiratesOfTheOpenSeas.getCurrentGame(); // retreive the game
         Map map = game.getMap(); // retreive the map from game
         Location[][] locations = map.getLocations(); // retreive the locations from map
       try {  
         this.console.print("   |");
         for( int column = 0; column < locations[0].length; column++){
             this.console.print("  " + column + " |"); // print col numbers to side of map
         }
         this.console.println();
         for( int row = 0; row < locations.length; row++){
             this.console.print(row + "  "); // print row numbers to side of map
             for( int column = 0; column < locations[row].length; column++){
                 leftIndicator = " ";
                 rightIndicator = " ";
                 if(locations[row][column].isVisited()){
                     leftIndicator = ">"; // can be stars or whatever these are indicators showing visited
                     rightIndicator = "<"; // same as above
                 }
                 // TODO : use if else ladder to check to see if this location is current location and set proper indicators
                 this.console.print("|"); // start map with a |
                 if(locations[row][column].getScene() == null)
                     this.console.print(leftIndicator + "??" + rightIndicator);
                 else
                     this.console.print(leftIndicator + locations[row][column].getScene().getMapSymbol() + rightIndicator);
             }
             
             this.console.println("|");
         }
       }catch (Exception e) {
           System.out.println("Error");
       }
       
    }

    private void displayInventory() {
     //InventoryItem[] inventory = GameControl.getSortedInventoryList();
     InventoryItem[] inventory = PiratesOfTheOpenSeas.getCurrentGame().getInventory();
     this.console.println("\nList of Inventory Items");
     this.console.println("Description" + "\t" + "Required" + "\t" + "In Stock");
     
     for (InventoryItem inventoryItem : inventory) {
         
         this.console.println(inventoryItem.getDescription() + "\t" + 
                            inventoryItem.getRequiredAmount() + "\t" +
                            inventoryItem.getQuantityInStock());
     }
    }

    private void displayActor() {
        Actor actor = Actor.CaptainHawkeye;
        
    }

    private void displayContents() {
     System.out.println("*** Display Content ***");    
    }

    private void moveLocation() {
     System.out.println("*** Move Location ***");    
    }

    private void selectResources() {
        SelectInventoryItemView selectInventoryItemView = new SelectInventoryItemView();
        selectInventoryItemView.display();
     //System.out.println("*** Estimate Resources ***");    
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
