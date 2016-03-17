/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

import citbyui.cit260.piratesOfTheOpenSeas.exceptions.InventoryControlException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Roland
 */
public class InventoryControl {
    
    public final static double DENSITY = 0.036;
    public static double calcBarrelVolume(double height, double diameter) throws InventoryControlException {
        
        if (height < 12 || height > 48) { // height is out of range?
            throw new InventoryControlException("Height is out of range");
        }
        
        if (diameter < 12 || diameter > 36) { // diameter is out of range?
            throw new InventoryControlException("Diameter is out of range");
        }
        
        double radius = diameter / 2;
        double volume = (Math.PI * Math.pow(radius, 2) * height);
        
        return volume;
    }
    
    /*
    *
    * author @ Liz
    */
    
    public static int calcFoodWanted(int noOfPeople, int poundsPerDay, int noOfDays) throws InventoryControlException {
        
        if (noOfPeople < 3 || noOfPeople > 50) { //too many or too few people
            throw new InventoryControlException("Too many or too few people were chosen");
        }
            
        if (poundsPerDay < 1 || poundsPerDay > 10) {
           throw new InventoryControlException("Too many or too few pounds");
        }
        
        if (noOfDays <1 || noOfDays >50) {
            throw new InventoryControlException("Too many or too few days");
        }
            
        int food = noOfPeople * poundsPerDay * noOfDays;
        
        return food;
            
    }
    
    public static double calcBarrelWeight(double height, double diameter, double DENSITY) throws InventoryControlException {
        
        if (height < 12 || height > 48) { // height is out of range?
           throw new InventoryControlException("Height is out of range");
        }
        
        if (diameter < 12 || diameter > 36) { // diameter is out of range?
            throw new InventoryControlException("Diameter is out of range");
        }
        
        double radius = diameter / 2;
        double volume = (Math.PI * Math.pow(radius, 2) * height);
        double weight = Math.round(volume * DENSITY * 100) / 100;
        
        return weight;
    }
   

   

     public void displayInventoryControl() {
        System.out.println("** Display Inventory Control **");
    }
    

    
    
    
}
