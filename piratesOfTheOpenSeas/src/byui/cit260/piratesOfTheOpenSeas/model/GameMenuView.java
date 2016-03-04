/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.model;

import citbyui.cit260.piratesOfTheOpenSeas.view.ShipMenuView;



/**
 *
 * @author Liz
 */
public class GameMenuView {

    public void dislayMenu() {
        
        ShipMenuView shipMenuView = new ShipMenuView();
        
        shipMenuView.display();
        //System.out.println("\n*** displayMenu stub function called ***");
    }
    
}
