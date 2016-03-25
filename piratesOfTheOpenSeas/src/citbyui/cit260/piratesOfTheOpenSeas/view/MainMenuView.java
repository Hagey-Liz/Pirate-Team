/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.GameControl;
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
                +"\nV - View game menu"
                +"\nS - Save game"
                +"\nQ - Quit"
                +"\n-------------------------------------------");
    }
    
  
    @Override   
    public boolean doAction(String value){
       value = value.toUpperCase(); //convert choice to upper case
       try {
        switch (value){
            case "N": //create and start new game
                this.startNewGame();
                break;
            case "G": //get and start an existing game
                this.startSavedGame();
                break;
            case "V": //get and start an existing game
                this.displayGameMenu();
                break;
            case "H": //display the help menu
                this.displayHelpMenu();
                break;
            case "S": //save the current game
                this.saveGame();
                break;
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** try again");
}
       } catch (Exception e) {
           ErrorView.display(this.getClass().getName(),
                   "Error" + e.getMessage());
       }
        return false;
    
}

    private void startNewGame() {
        //create a new game
        GameControl.createNewGame(PiratesOfTheOpenSeas.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.dislayMenu();
    }

    private void startSavedGame() {
        this.console.println("Enter the file path for file where"
                + " the game is to be saved.");
        
        String filePath = this.getInput();
        
        try {
            //start saved game
            GameControl.getSavedGame(filePath);
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
     //display the game menu
     GameMenuView gameMenu = new GameMenuView();
     gameMenu.dislayMenu();
      
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        
        this.console.println("\nEnter the file path for file where"
                + "the bame is to be saved");
        String filePath = this.getInput();
        
        try{
            //save teh game to the specified file
            GameControl.saveGame(PiratesOfTheOpenSeas.getCurrentGame(),filePath);
            
        } catch (Exception ex) {
            ErrorView.display("MainMenuView",ex.getMessage());
        }
        SaveGameView saveGame = new SaveGameView();
        saveGame.display();
    }

    private void displayGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}