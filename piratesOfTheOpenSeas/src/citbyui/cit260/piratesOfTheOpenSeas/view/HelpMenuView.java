/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import java.util.Scanner;

/**
 *
 * @author Liz
 */
public class HelpMenuView {
        
    private String helpMenu;
    private String promptMessage="Select an option: ";

    public HelpMenuView() {
        this.helpMenu = "\n"
                +"\n--------------------------------------------"
                +"\n|Help Menu                                 |"
                +"\n--------------------------------------------"
                +"\nB - What is the objective of the game?"
                +"\nN - How to navigate"
                +"\nC - How to select a crew"
                +"\nL - How to stock your ship"
                +"\nF - How a pirate can attack, negotiate or run from other pirates, navy or merchants"
                +"\nM - How to use the map"
                +"\nQ - Quit"
                +"\n-------------------------------------------";
    }
    
   
    void displayHelpMenuView() {
        boolean done = false; //set flag to not done
        do{
            //prompt for and get players name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q"))//user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
            
        } while (!done);
       
    }

       private String getMenuOption() {
             
       Scanner keyboard = new Scanner(System.in);// get infile for keyboard
       String value = "";// value to be returned
       boolean valid = false;//initialize to not valid
       
       while(!valid){//loop while an invalid value is entered
           System.out.println("\n" + this.helpMenu);
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
       
    public boolean doAction(String choice){
       choice = choice.toUpperCase(); //convert choice to upper case

        switch (choice){
            case "B": //create and start new game
                this.displayGameObjective();
                break;
            case "N": //get and start an existing game
                this.howToNavigate();
                break;
            case "C": //display the help menu
                this.selectCrew();
                break;
            case "L": //how to stock the ship
                this.stockShip();
                break;
            case "F": //save the current game
                this.displayEnemyTactics();
                break;
            case "M": //save the current game
                this.displayMap();
                break;
            default:
                System.out.println("\n*** Invalid selection *** try again");
}
        return false;
    
}

    private void displayGameObjective() {
         System.out.println("*** The objective of the game is to find the hidden"
                 + "\ntreasure while avoiding capture, or worse, from your enemy. "
                 + "\nThe journey will be long and dangerous.  You will "
                 + "\nhave to risk life or death if you want to find the treasure "
                 + "\nof all treasures. ***");
    }

    private void howToNavigate() {
        System.out.println("*** You will given a range of coordinates to choose from."
                + "\neach coordinate will represent a different scene i.e. island,"
                + "\nport, open sea etc...  ***");
    }

    private void selectCrew() {
         System.out.println("*** If you chose a small ship you may have between "
                 + "\n2 - 9 crew members to choose from.  If you chose a large"
                 + "\nship you may have 8 - 19 crew members. ***");
    }

    private void displayEnemyTactics() {
         System.out.println("*** You will be given the option to run, fight or "
                 + "\nnegotiate.  If you choose to fight you will be given a range "
                 + "\nof numbers to choose from that will determine whether they "
                 + "\nwill win or lose the fight. If you choose to negotiate you will "
                 + "\nchoose a number between 1 and 10, 1 = not willing to sacrifice "
                 + "\nanything, and 10 = giving everything. If the enemy rejects the "
                 + "\nnegotiated offer 3 times then you will have to choose whether "
                 + "\nto run or fight.  If you choose to run "
                 + "\nyou will be given the option to enter new coordinates.***");
    }

    private void displayMap() {
         System.out.println("*** There will be clues in the map that will help"
                 + "\nto navigate to where you need to go. ***");
    }

    private void stockShip() {
        System.out.println("*** You will be prompted to enter the number of pounds"
                + "\nof food you would like to get per person per day.  You will "
                + "\nbe able to choose your weapons and the size of barrels you want"
                + "\nfor water and rum. Obviously you will not be able to have"
                + "\nas much if you chose the smaller ship.***");
    }
}