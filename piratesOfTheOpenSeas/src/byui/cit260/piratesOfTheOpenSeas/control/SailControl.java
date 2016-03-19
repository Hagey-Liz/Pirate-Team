/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

import citbyui.cit260.piratesOfTheOpenSeas.exceptions.SailControlExceptions;

/**
 *
 * @author Liz
 */
public class SailControl {
   
    public double boardShip(String ship, double numPeople) throws SailControlExceptions{
        
        if (ship == "small") {
          if (numPeople < 2 || numPeople > 9) {  
              throw new SailControlExceptions("Invalid selection, number should "
              + "be between 2 and 9 inclusive.");
            }  
        }
        else if (ship == "large") {
            if (numPeople > 19 || numPeople < 8) {
                throw new SailControlExceptions("Invalid selection, number should "
                + "be between 8 and 19 invlusive.");
            }
        }
        
        // 1 is the captain of the ship 
        double crew = 1 + numPeople;
        return crew;
    }
}
