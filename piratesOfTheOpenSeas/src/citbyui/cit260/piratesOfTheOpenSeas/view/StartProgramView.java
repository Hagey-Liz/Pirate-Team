/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.GameControl;
import byui.cit260.piratesOfTheOpenSeas.model.Player;
import java.io.BufferedReader;
import java.io.PrintWriter;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */
public class StartProgramView extends View{
   
    
    public StartProgramView(){
         super(  "\n***************************************************************"
        +"\n*                                                             *"
        +"\n This is a game of Pirates of the Open Seas.  In this game you *"
        +"\n will choose to be either a pirate or Navy Captain.           *"
        +"\n If you choose to be a Pirate then your goal is to locate the *"
        +"\n treasure that is hidden on a island.                         *"
        +"\n If you choose to be the Navy Captain then your goal is to    *"
        +"\n capture the pirates and find the treasure for your country.  *"
        +"\n You will need to choose either a small or large ship along   *"
        +"\n a number of people  in your crew.  You will need to plan food*"
        +"\n water and weapons for your journey.  You may have to go      *"
        +"\n storms and will need to stop at ports or islands along the   *"
        +"\n way to restock supplies.  You will choose whether to fight or*"
        +"\n run when facing the enemy.                                   *"
        +"\n                                                              *"
        +"\n Good Luck and have fun in this adventure!                    *"
        +"\n***************************************************************"
                 +"\nPlease enter your name:"
     );
      
    }

    @Override
    public boolean doAction(String playersName) {
       //if the length of the playersName < 2 then
       //display "Invalid name: The name must be > 1 character"
       //return false
       if(playersName.length() < 2){
         ErrorView.display(this.getClass().getName(),
                 "\nInvalid players name:"
               + "The name must be greater than one character in length");
         return false; 
       }
       // create Player with specified name
       // if unsuccessful then
       //     display "Invalid name: The name is too short"
       //     return false
       
       //call createPlayer() control function
       Player player = GameControl.createPlayer(playersName);
       //Player player;
              
       if (player == null) {//if unsuccessful
          ErrorView.display(this.getClass().getName(),
                  "\nError creating the player");
         return false;
        }
       
       this.displayNextView(player);
       
       return true;
    }
   
    private void displayNextView(Player player) {
      this.console.println("\n================================"
      + "\n Welcome to the game " + player.getName()
      + "\n We hope you have a lot of fun!"
      + "\n================================================="
      );  
      
      // Create MainMenuView object
      MainMenuView mainMenuView = new MainMenuView();
              
      // Display the main menu view
      mainMenuView.display();
    }

    
}              
