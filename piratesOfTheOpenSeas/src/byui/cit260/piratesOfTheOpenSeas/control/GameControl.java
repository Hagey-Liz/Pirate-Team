/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

import byui.cit260.piratesOfTheOpenSeas.model.Player;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        PiratesOfTheOpenSeas.setPlayer(player); // save the player.
        
        return player;
    }
        
}
    

