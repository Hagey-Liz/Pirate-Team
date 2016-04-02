/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.GameControl;
import byui.cit260.piratesOfTheOpenSeas.model.Barrel;
import byui.cit260.piratesOfTheOpenSeas.model.Weapons;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Liz
 */
public class StockWeaponsView extends View  {
    private String promptMessage;
    
    public StockWeaponsView() {
        super("\n"
                +"\n--------------------------------------------"
                +"\n|Weapons List                              |"
                +"\n--------------------------------------------"
                +"\nC - Cannon Balls"
                +"\nG - Guns"
                +"\nP - Spears"
                +"\nS - Swords"  
                +"\nQ - Quit"
                +"\n-------------------------------------------");
    }
    
    /*public int getWeapons() {
        
        int weapons = 0;
        String response = null;
        
        this.promptMessage="Please enter the number of weapons you would like.";
        
         try {
                response = this.keyboard.readLine();
            } catch (IOException ex) {
                Logger.getLogger(StockWeaponsView.class.getName()).log(Level.SEVERE, null, ex);
            }
                  if ("yes".equals(response.toLowerCase())){
                      Weapons cannonBalls = new Weapons();
                      cannonBalls.setDescription("Cannon Balls");
                      cannonBalls.setQuantityInStock("50")
                      weapon[Weapons.cannonBalls.ordinal()] = cannonBalls;
        
                      Weapons guns = new Weapons();
                      guns.setDescription("Guns");
                      guns.setQuantityInStock("20")
                      weapon[GameControl.Weapons.guns.ordinal()] = guns;

                      Weapons spears = new Weapons();
                      spears.setDescription("Spears");
                      spears.setQuantityInStock("20")
                      weapon[GameControl.Weapons.spears.ordinal()] = spears;

                      Weapons swords = new Weapons();
                      swords.setDescription("Cannon Balls");
                      swords.setQuantityInStock("50")
                      weapon[GameControl.Weapons.swords.ordinal()] = swords;
                      int addedWeight = shipCurrentWeight + barrelWeight;
                      
                      if (shipCurrentWeight > shipMaxWeight) {
                          this.console.println("Could not add the barrel because it is too heavy for this ship"); 
                      }else {
                         
                            game.getShip().addBarrel(barrel);
                            this.console.println("You successfully added the barrel to your ship");
                      }
                  
        return weapons;
    }*/

    @Override
    public boolean doAction(String value) {
            return true;    
    }

   

}
