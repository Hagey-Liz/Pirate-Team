
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratesoftheopenseas;


import byui.cit260.piratesOfTheOpenSeas.model.Game;
import byui.cit260.piratesOfTheOpenSeas.model.Player;

import citbyui.cit260.piratesOfTheOpenSeas.view.StartProgramView;

/**
 *
 * @author Roderick
 */
public class PiratesOfTheOpenSeas {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PiratesOfTheOpenSeas.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PiratesOfTheOpenSeas.player = player;
    }
    
    public static void main(String[] args){
    
        
     StartProgramView startProgramView = new StartProgramView();
        startProgramView.displayStartProgramView();
    }

    
    
}

