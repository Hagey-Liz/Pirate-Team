/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.control.GameControl;
import byui.cit260.piratesOfTheOpenSeas.model.Player;
import java.util.Scanner;

/**
 *
 * @author Liz
 */
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
         
        this.promptMessage="\nPlease enter your name:";
        //display the banner when view is created
        this.displayBanner();
        
    }

    public void displayBanner() {
     System.out.println(
         "\n***************************************************************"
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
     );
    }


    public void displayStartProgramView() {
        
        boolean done = false;//set flag to not done
        do{
            //prompt for and get players name
            String playersName = this.getPlayersName();
            if(playersName.toUpperCase().equals("Q"))//user wants to quit
                return;//exit the game
            
            //do the requested action display the next view
            done = this.doAction(playersName);
        } while (!done);
    
    }

    private String getPlayersName() {
       /*
        WHILE valid value has not been entered
            DISPLAY promptMessage
            GET the value entered from keyboard
            Trim front and trailing blanks off of the name
        
            IF the length of the value is blank THEN
                DISPLAY "Invalid value: The value can not be blank"
                CONTINUE
            ENDIF
        
            BREAK
        ENDWHILE
        RETURN name
        */
       
       Scanner keyboard = new Scanner(System.in);// get infile for keyboard
       String value = "";// value to be returned
       boolean valid = false;//initialize to not valid
       
       while(!valid){//loop while an invalid value is entered
           System.out.println("\n" + this.promptMessage);
           
           value = keyboard.nextLine();//get next line typed on keyboard
           value = value.trim();//trim off leading and trailing blanks
           
           if (value.length() < 1){//value is blank
               System.out.println("\nInvalid value: value can not be blank");
               continue;
           }
           break; //end the loop
    }
       return value;//return the value entered
    }

    private boolean doAction(String playersName) {
       //if the length of the playersName < 2 then
       //display "Invalid name: The name must be > 1 character"
       //return false
       if(playersName.length() < 2){
          System.out.println("\nInvalid players name:"
               + "The name must be greater than one character in length");
         return false; 
       }
       // create Player with specified name
       // if unsuccessful then
       //     display "Invalid name: The name is too short"
       //     return false
       
       //call createPlayer() control function
       Player player = GameControl.createPlayer(playersName);
       
       if (player == null) {//if unsuccessful
         System.out.println("\nError creating the player");
         return false;
        }
       
       this.displayNextView(player);
       
       return true;
    }
   
    private void displayNextView(Player player) {
      System.out.println("\n================================"
      + "\n Welcome to the game " + player.getName()
      + "\n We hope you have a lot of fun!"
      + "\n================================================="
      );  
      
      // Create MainMenuView object
      MainMenuView mainMenuView = new MainMenuView();
              
      // Display the main menu view
      mainMenuView.displayMainMenuView();
    }

    
}              
