/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.GameControl;
import byui.cit260.piratesOfTheOpenSeas.control.GameControl.Item;
import byui.cit260.piratesOfTheOpenSeas.control.InventoryControl;
import static byui.cit260.piratesOfTheOpenSeas.control.InventoryControl.DENSITY;
import byui.cit260.piratesOfTheOpenSeas.model.Barrel;
import byui.cit260.piratesOfTheOpenSeas.model.Game;
import byui.cit260.piratesOfTheOpenSeas.model.InventoryItem;
import byui.cit260.piratesOfTheOpenSeas.model.Ship;
import citbyui.cit260.piratesOfTheOpenSeas.exceptions.InventoryControlException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */
public class BarrelWeightView extends View {
    
    private String promptMessageHeight;
    private String promptMessageDiameter;
    private int barrelWeight;
    
    Game game = PiratesOfTheOpenSeas.getCurrentGame();
    Ship ship = game.getShip();
    InventoryItem [] inventory = game.getInventory();
    double shipMaxWeight = ship.getMaxCapacity();
    double shipCurrentWeight = ship.getCurrentCargoWeight();
    
    
    protected final BufferedReader keyboard = PiratesOfTheOpenSeas.getInFile();
    protected final PrintWriter console = PiratesOfTheOpenSeas.getOutFile();
    
    public BarrelWeightView() {
    }
    
    public double getBarrelWeight(String barrelItem){
        
        double height  = 0;
        double diameter = 0;
        String response = null;
        double currentFood = inventory[Item.food.ordinal()].getQuantityInStock();
        double currentWater = inventory[Item.water.ordinal()].getQuantityInStock();
        double currentRum = inventory[Item.rum.ordinal()].getQuantityInStock();
        double currentOil = inventory[Item.oil.ordinal()].getQuantityInStock();
        double addItemWater = 0;
        double addItemRum = 0;
        double addItemOil = 0;
        double addItemFood = 0;
        
        
        this.promptMessageHeight="Enter the height of the barrel you want. It "
                + "should be at least 12 inches tall but not taller than 48 inches. "
            + " To cancel enter -1";
        this.promptMessageDiameter="Enter the diameter of the barrel you want. The "
                + "smallest it can be is 12 inches and the largest it can be is 36 inches. "
             + " To cancel enter -1";
        
       double barrelVol = 0;// value to be returned
       boolean finished = false;//initialize to not valid
      try { 
       while(!finished){//loop while an invalid value is entered
           this.console.println("\n" + this.promptMessageHeight);
           height = this.getInteger();
           if(height == -1) {
               finished = true;
               this.console.println("You canceled");
               continue;
           }
               
           this.console.println("\n" + this.promptMessageDiameter);
           diameter = this.getInteger();
           if(diameter == -1) {
               finished = true;
               this.console.println("You canceled");
               continue;
           }
           break;    
       }
           }catch (Exception e){
          ErrorView.display(this.getClass().getName(),
                  "Error reading input:" + e.getMessage());
           
                   }     
            try {
                barrelVol = (int) InventoryControl.calcBarrelVolume(height, diameter);
            } catch (InventoryControlException me) {
                this.console.println(me.getMessage());
            }
          
            try {
                barrelWeight = (int) InventoryControl.calcBarrelWeight(height, diameter, DENSITY);
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
              } 
            try {
                response = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(BarrelWeightView.class.getName()).log(Level.SEVERE, null, ex);
            }
                  if ("yes".equals(response.toLowerCase())){
                      Barrel barrel = new Barrel();
                      barrel.setWeight(barrelWeight);
                      barrel.setDiameter(diameter);
                      barrel.setHeight(height);
                      barrel.setVolume(barrelVol);
                      double addedWeight = shipCurrentWeight + barrelWeight;
                      
                      if (shipCurrentWeight > shipMaxWeight) {
                          this.console.println("Could not add the barrel because it is too heavy for this ship"); 
                      }else {
                         
                            game.getShip().addBarrel(barrel);
                            this.console.println("You successfully added the barrel to your ship");
                      }
                      addItemFood = currentFood + barrelWeight;
                      addItemWater = currentWater + barrelWeight;
                      addItemRum = currentRum + barrelWeight;
                      addItemOil = currentOil + barrelWeight;
                  if (barrelItem.equals("food")) {
                     inventory[Item.food.ordinal()].setQuantityInStock(addItemFood); 
                  }else if (barrelItem.equals("water")) {
                     inventory[Item.water.ordinal()].setQuantityInStock(addItemWater); 
                  }else if (barrelItem.equals("rum")){
                      inventory[Item.rum.ordinal()].setQuantityInStock(addItemRum); 
                  }else{
                     inventory[Item.oil.ordinal()].setQuantityInStock(addItemOil); 
                  }
                  
             }
                   return barrelVol;//return the value entered
        }
      
     public boolean doAction(String value) {
         return true;
     }
      }
      
      
        
    

    
    

