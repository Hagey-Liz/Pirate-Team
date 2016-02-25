/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.InventoryControl;
import java.util.Scanner;

/**
 *
 * @author Roderick
 */
public class BarrelView {
    
    private String promptMessageHeight;
    private String promptMessageDiameter;
    
    public BarrelView() {
    }
    
    public double getBarrelVolume(){
        
        this.promptMessageHeight="Enter the height of the barrel you want. "
            + " To cancel enter -1";
        this.promptMessageDiameter="Enter the diameter of the barrel you want. "
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
      
        }
        return barrelVol;//return the value entered
    }
}