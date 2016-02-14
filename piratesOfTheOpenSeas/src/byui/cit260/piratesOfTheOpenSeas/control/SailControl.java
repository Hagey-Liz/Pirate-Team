/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

/**
 *
 * @author Liz
 */
public class SailControl {
   
    public double boardShip(String ship, double numPeople) {
        
        if (ship == "small") {
          if (numPeople > 9) {  
              return -1;
            }  
        }
        else if (ship == "large") {
            if (numPeople > 19) {
                return -1;
            }
        }
        
        // 1 is the captain of the ship 
        double crew = 1 + numPeople;
        return crew;
    }
}
