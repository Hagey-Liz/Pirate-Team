/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import java.util.Scanner;

/**
 *
 * @author Roderick
 */
public class ShipMenuView {
    private String shipMenu;
    private String promptMessage="Select a ship for your journey: ";

    public ShipMenuView() {
        this.shipMenu = "\n"
                +"\n--------------------------------------------"
                +"\n|Ships                                 |"
                +"\n--------------------------------------------"
                +"\nS - Small ship"
                +"\nL - Large ship"
                +"\nE - Exit"
                +"\n-------------------------------------------";
    }
    
    public void displayShipMenuView() {
        boolean done = false; //set flag to not done
        do{
            //prompt for and get players choice
            String shipMenuOption = this.getshipMenuOption();
            if (shipMenuOption.toUpperCase().equals("E"))//user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(shipMenuOption);
            
        } while (!done);
       
    }

    private String getshipMenuOption() {
        Scanner keyboard = new Scanner(System.in);// get infile for keyboard
       String value = "";// value to be returned
       boolean valid = false;//initialize to not valid
       
       while(!valid){//loop while an invalid value is entered
           System.out.println("\n" + this.shipMenu);
           System.out.println("\n" + this.promptMessage);
           
           value = keyboard.nextLine();//get next line typed on keyboard
           value = value.trim();//trim off leading and trailing blanks
           
           if (value.length() < 1){//value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           break; //end the loop
    }
       return value;//return the value entered
    }
    
  public boolean doAction(String shipMenuOption) {
        shipMenuOption = shipMenuOption.toUpperCase(); //convert choice to upper case

        switch (shipMenuOption){
            case "S": // Get Small Ship
                this.smallShip();
                break;
            case "L": //Get Large Ship
                this.largeShip();
                break;
            default:
                System.out.println("\n*** Invalid selection *** try again");
}
        return false;
    }

    private void smallShip() {
        System.out.println("*** You have selected a Small ship for your voyage."
        +"\nThe adventure is about to begin ***");
   SelectInventoryItemView selectInventoryItemView = new SelectInventoryItemView();
   selectInventoryItemView.displaySelectInventoryItemView();
    }

    private void largeShip() {
        System.out.println("*** You have selected a Large ship for your voyage."
        +"\nThe adventure is about to begin ***");
 SelectInventoryItemView selectInventoryItemView = new SelectInventoryItemView();
   selectInventoryItemView.displaySelectInventoryItemView();
    }

    
  
}
