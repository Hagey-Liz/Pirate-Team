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
    
    public static double calcBarrelVolume(double height, double diameter) {
        
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

    public void displayInventoryControl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    double calcFoodWanted(double noOfPeople, double poundsPerDay, double noOfDays) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
