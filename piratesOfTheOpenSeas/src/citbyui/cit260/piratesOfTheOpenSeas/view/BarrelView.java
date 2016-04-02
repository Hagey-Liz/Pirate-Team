/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.InventoryControl;
import citbyui.cit260.piratesOfTheOpenSeas.exceptions.InventoryControlException;
import java.io.BufferedReader;
import java.io.PrintWriter;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Roderick
 */
public class BarrelView extends View{
    
    private String promptMessageHeight;
    private String promptMessageDiameter;
    
    protected final BufferedReader keyboard = PiratesOfTheOpenSeas.getInFile();
    protected final PrintWriter console = PiratesOfTheOpenSeas.getOutFile();
    
    public BarrelView() {
    }
    
    public double getBarrelVolume(){
        
        this.promptMessageHeight="Enter the height of the barrel you want. "
            + " To cancel enter -1";
        this.promptMessageDiameter="Enter the diameter of the barrel you want. "
             + " To cancel enter -1";
        
          // get infile for keyboard
       
       double barrelVol = 0;// value to be returned
       boolean finished = false;//initialize to not valid
       //barrelVol = this.keyboard.read();
      try {       
       while(!finished){//loop while an invalid value is entered
           this.console.println("\n" + this.promptMessageHeight);
           double height = this.getInteger();
           if(height == -1) {
               finished = true;
               this.console.println("You canceled");
               continue;
           }
               
           this.console.println("\n" + this.promptMessageDiameter);
           double diameter = this.getInteger();
           if(diameter == -1) {
               finished = true;
               this.console.println("You canceled");
               continue;
           }
       
           
               
           try {
                barrelVol = (double) InventoryControl.calcBarrelVolume(height, diameter);
            } catch (InventoryControlException me) {
                this.console.println(me.getMessage());
            }
           
        }
      }catch (Exception e) {
          this.console.println("Error" + e.getMessage());
      }
       
        return barrelVol;//return the value entered
    }

    @Override
    public boolean doAction(String value) {
        return true;
    }
}