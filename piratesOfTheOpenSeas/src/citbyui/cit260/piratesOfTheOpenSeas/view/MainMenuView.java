/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.GameControl;
import byui.cit260.piratesOfTheOpenSeas.model.GameMenuView;
import java.util.Scanner;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Roderick
 */
public class MainMenuView extends View {
    
    public MainMenuView(){
            super("\n"
                +"\n--------------------------------------------"
                +"\n|Main Menu                                 |"
                +"\n--------------------------------------------"
                +"\nN - Start new game"
                +"\nG - Get and start saved game"
                +"\nH - Get help on how to play the game"
                +"\nS - Save game"
                +"\nQ - Quit"
                +"\n-------------------------------------------");
    }
    
  
    @Override   
    public boolean doAction(String value){
       value = value.toUpperCase(); //convert choice to upper case

        switch (value){
            case "N": //create and start new game
                this.startNewGame();
                break;
            case "G": //get and start an existing game
                this.startExistingGame();
                break;
            case "H": //display the help menu
                this.displayHelpMenu();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            default:
                System.out.println("\n*** Invalid selection *** try again");
}
        return false;
    
}

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(PiratesOfTheOpenSeas.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.dislayMenu();
    }

    private void startExistingGame() {
        StartSavedGameView startExistingGame = new StartSavedGameView();
        startExistingGame.display();
     
      
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        SaveGameView saveGame = new SaveGameView();
        saveGame.display();
    }
}