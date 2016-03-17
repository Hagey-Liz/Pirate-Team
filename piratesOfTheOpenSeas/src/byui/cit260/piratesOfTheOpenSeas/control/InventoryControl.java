/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Roland
 */
public class InventoryControl {
    
    public final static double DENSITY = 0.036;
    public static double calcBarrelVolume(double height, double diameter) {
        
        if (height < 12 || height > 48) { // height is out of range?
            return -1;
        }
        
        if (diameter < 12 || diameter > 36) { // diameter is out of range?
            return -1;
        }
        
        double radius = diameter / 2;
        double volume = (Math.PI * Math.pow(radius, 2) * height);
        
        return volume;
    }
    
    /*
    *
    * author @ Liz
    */
    
    public static int calcFoodWanted(int noOfPeople, int poundsPerDay, int noOfDays) {
        
        if (noOfPeople < 3 || noOfPeople > 50) { //too many or too few people
            return -1;
        }
            
        if (poundsPerDay < 1 || poundsPerDay > 10) {
            return -1;
        }
        
        if (noOfDays <1 || noOfDays >50) {
            return -1;
        }
            
        int food = noOfPeople * poundsPerDay * noOfDays;
        
        return food;
            
    }
    
    public static double calcBarrelWeight(double height, double diameter, double DENSITY) {
        
        if (height < 12 || height > 48) { // height is out of range?
            return -1;
        }
        
        if (diameter < 12 || diameter > 36) { // diameter is out of range?
            return -1;
        }
        
        double radius = diameter / 2;
        double volume = (Math.PI * Math.pow(radius, 2) * height);
        double weight = volume * DENSITY;
        
        return weight;
    }
   

   

     public void displayInventoryControl() {
        System.out.println("** Display Inventory Control **");
    }
    

    
    
    
}
