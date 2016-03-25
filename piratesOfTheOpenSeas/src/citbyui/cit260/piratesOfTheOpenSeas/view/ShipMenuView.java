/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.model.Game;
import byui.cit260.piratesOfTheOpenSeas.model.Ship;
import java.util.Scanner;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

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
        try {
        switch (value){
            case "S": // Get Small Ship
                this.smallShip();
                return true;
                
            case "L": //Get Large Ship
                this.largeShip();
                return true;
              
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** try again");
}
        }catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error" + e.getMessage());
        }
        return false;
    }

    private void smallShip() {
       // this.console.println("*** You have selected a Small ship for your voyage."
        //+"\nThe adventure is about to begin ***");
        Game game = PiratesOfTheOpenSeas.getCurrentGame();
        
        Ship ship = new Ship();
        ship.setCannons(5);
        ship.setCrew(8);
        ship.setMaxCapacity(2000);
        ship.setDescription("Small Ship");
        ship.setSpeed(30);
        game.setShip(ship);
    }

    private void largeShip() {
        //this.console.println("*** You have selected a Large ship for your voyage."
       // +"\nThe adventure is about to begin ***");
       Game game = PiratesOfTheOpenSeas.getCurrentGame();
        
        Ship ship = new Ship();
        ship.setCannons(10);
        ship.setCrew(19);
        ship.setMaxCapacity(3000);
        ship.setDescription("Large Ship");
        ship.setSpeed(20);
        game.setShip(ship);
    }

    
  
}
