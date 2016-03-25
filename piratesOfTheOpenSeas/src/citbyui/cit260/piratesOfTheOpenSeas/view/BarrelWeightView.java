/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.InventoryControl;
import static byui.cit260.piratesOfTheOpenSeas.control.InventoryControl.DENSITY;
import byui.cit260.piratesOfTheOpenSeas.model.Barrel;
import byui.cit260.piratesOfTheOpenSeas.model.Game;
import citbyui.cit260.piratesOfTheOpenSeas.exceptions.InventoryControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */
public class BarrelWeightView {
    
    private String promptMessageHeight;
    private String promptMessageDiameter;
    private double barrelWeight;
    
    protected final BufferedReader keyboard = PiratesOfTheOpenSeas.getInFile();
    protected final PrintWriter console = PiratesOfTheOpenSeas.getOutFile();
    
    public BarrelWeightView() {
    }
    
    public double getBarrelWeight(){
        
        this.promptMessageHeight="Enter the height of the barrel you want. It"
                + "should be at least 12 inches tall but not taller than 48 inches. "
            + " To cancel enter -1";
        this.promptMessageDiameter="Enter the diameter of the barrel you want. The"
                + "smallest it can be is 12 inches and the largest it can be is 36 inches. "
             + " To cancel enter -1";
        
       double barrelVol = 0;// value to be returned
       boolean finished = false;//initialize to not valid
      try { 
       while(!finished){//loop while an invalid value is entered
           this.console.println("\n" + this.promptMessageHeight);
           double height = keyboard.read();
           if(height == -1) {
               finished = true;
               this.console.println("You canceled");
               continue;
           }
               
           this.console.println("\n" + this.promptMessageDiameter);
           double diameter = keyboard.read();
           if(diameter == -1) {
               finished = true;
               this.console.println("You canceled");
               continue;
           }
           
               
            try {
                barrelVol = InventoryControl.calcBarrelVolume(height, diameter);
            } catch (InventoryControlException me) {
                this.console.println(me.getMessage());
            }
            /*if (barrelVol == -1){
              this.console.println("Invalid entries, please try again");
            }
            else {
                finished = true;
                this.console.println("The volume of the barrel is " + barrelVol);
            }*/
           
            try {
                barrelWeight = InventoryControl.calcBarrelWeight(height, diameter, DENSITY);
            } catch (InventoryControlException me) {
                this.console.println(me.getMessage());
            }
              if (barrelWeight == -1){
                  ErrorView.display(this.getClass().getName(), 
                          "Invalid entries, please try again");
              }  
              else {
                  finished = true;
                  this.console.println("The weight of the barrel is " + barrelWeight + " pounds. "
                          + "Do you want to put this on your ship? (enter yes or no)");
                   //Scanner keyboard2 = new Scanner(System.in);
                  String response = this.keyboard.readLine();
                  if ("yes".equals(response.toLowerCase())){
                      Barrel barrel = new Barrel();
                      barrel.setWeight(barrelWeight);
                      barrel.setDiameter(diameter);
                      barrel.setHeight(height);
                      barrel.setVolume(barrelVol);
                      Game game = PiratesOfTheOpenSeas.getCurrentGame();
                      if (game.getShip().addBarrel(barrel))
                          this.console.println("You successfully added the barrel to your ship");
                      else
                          this.console.println("Could not add the barrel because it is too heavy for this ship");
                      }
                  
             }
      
        }
      }
      catch (Exception e){
          ErrorView.display(this.getClass().getName(),
                  "Error reading input:" + e.getMessage());
      }
        return barrelVol;//return the value entered
    }
    
}
