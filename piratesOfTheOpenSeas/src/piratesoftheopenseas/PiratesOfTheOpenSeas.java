/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratesoftheopenseas;

import byui.cit260.piratesOfTheOpenSeas.model.Player;

/**
 *
 * @author Roderick
 */
public class PiratesOfTheOpenSeas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Roland Pecku");
        playerOne.setHighScore(14.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
    }
    
}
