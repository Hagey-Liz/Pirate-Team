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
public class ShipMenuView extends View{
    
    public ShipMenuView() {
            super("\n"
                +"\n--------------------------------------------"
                +"\n|Ships                                 |"
                +"\n--------------------------------------------"
                +"\nS - Small ship"
                +"\nL - Large ship"
                +"\nQ - Quit"
                +"\n-------------------------------------------");
    }
 
  @Override  
  public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case

        switch (value){
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
   selectInventoryItemView.display();
    }

    private void largeShip() {
        System.out.println("*** You have selected a Large ship for your voyage."
        +"\nThe adventure is about to begin ***");
 SelectInventoryItemView selectInventoryItemView = new SelectInventoryItemView();
   selectInventoryItemView.display();
    }

    
  
}
