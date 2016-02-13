/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

/**
 *
 * @author Roland
 */
public class InventoryControl {
    
    public double calcBarrelVolume(double height, double diameter) {
        
        if (height < 12 || height > 48) { // height is out of range?
            return -1;
        }
        
        if (diameter < 12 || diameter > 36) { // diameter is out of range?
            return -1;
        }
        
        double radius = diameter / 2;
        double volume = (Math.PI * Math.pow(radius, 2) * height) / 1728;
        
        return volume;
    }
    
    public double calcFoodWanted(double noOfPeople, double poundsPerDay, double noOfDays) {
        
        if (noOfPeople < 3 || noOfPeople > 50) { //too many or too few people
            return -1;
        }
            
        if (poundsPerDay < 1 || poundsPerDay > 10) {
            return -1;
        }
        
        if (noOfDays <1 || noOfDays >50) {
            return -1;
        }
            
        double food = noOfPeople * poundsPerDay * noOfDays;
        
        return food;
            
    }
    
}
