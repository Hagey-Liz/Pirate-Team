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
import java.util.Scanner;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */
public class BarrelWeightView {
    
    private String promptMessageHeight;
    private String promptMessageDiameter;
    private double barrelWeight;
    
    public BarrelWeightView() {
    }
    
    public double getBarrelWeight(){
        
        this.promptMessageHeight="Enter the height of the barrel you want. It"
                + "should be at least 12 inches tall but not taller than 48 inches. "
            + " To cancel enter -1";
        this.promptMessageDiameter="Enter the diameter of the barrel you want. The"
                + "smallest it can be is 12 inches and the largest it can be is 36 inches. "
             + " To cancel enter -1";
        
          Scanner keyboard = new Scanner(System.in);// get infile for keyboard
       double barrelVol = 0;// value to be returned
       boolean finished = false;//initialize to not valid
       
       while(!finished){//loop while an invalid value is entered
           System.out.println("\n" + this.promptMessageHeight);
           double height = keyboard.nextDouble();
           if(height == -1) {
               finished = true;
               System.out.println("You canceled");
               continue;
           }
               
           System.out.println("\n" + this.promptMessageDiameter);
           double diameter = keyboard.nextDouble();
           if(diameter == -1) {
               finished = true;
               System.out.println("You canceled");
               continue;
           }
           
               
           barrelVol = InventoryControl.calcBarrelVolume(height, diameter);
            if (barrelVol == -1){
                System.out.println("Invalid entries, please try again");
            }
            else {
                finished = true;
                System.out.println("The volume of the barrel is " + barrelVol);
            }
           
            barrelWeight = InventoryControl.calcBarrelWeight(height, diameter, DENSITY);
              if (barrelWeight == -1){
                  System.out.println("Ivalid entries, please try again");
              }  
              else {
                  finished = true;
                  System.out.println("The weight of the barrel is " + barrelWeight + " pounds. "
                          + "Do you want to put this on your ship? (enter yes or no)");
                   Scanner keyboard2 = new Scanner(System.in);
                  String response = keyboard2.nextLine();
                  if ("yes".equals(response.toLowerCase())){
                      Barrel barrel = new Barrel();
                      barrel.setWeight(barrelWeight);
                      barrel.setDiameter(diameter);
                      barrel.setHeight(height);
                      barrel.setVolume(barrelVol);
                      Game game = PiratesOfTheOpenSeas.getCurrentGame();
                      if (game.getShip().addBarrel(barrel))
                          System.out.println("You successfully added the barrel to your ship");
                      else
                          System.out.println("Could not add the barrel because it is too heavy for this ship");
                      }
                  
              }
      
        }
        return barrelVol;//return the value entered
    }
    
}
