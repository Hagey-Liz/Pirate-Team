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
public class HelpMenuView extends View{
        
   public HelpMenuView() {
            super("\n"
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
                +"\n-------------------------------------------");
    }
    
   
 @Override
    public boolean doAction(String value){
       value = value.toUpperCase(); //convert choice to upper case
       try {
        switch (value){
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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** try again");
}
       } catch (Exception e) {
           ErrorView.display(this.getClass().getName(),
                   "Error" + e.getMessage());
       }
        return false;
    
}

    private void displayGameObjective() {
         this.console.println("*** The objective of the game is to find the hidden"
                 + "\ntreasure while avoiding capture, or worse, from your enemy. "
                 + "\nThe journey will be long and dangerous.  You will "
                 + "\nhave to risk life or death if you want to find the treasure "
                 + "\nof all treasures. ***");
    }

    private void howToNavigate() {
        this.console.println("*** You will given a range of coordinates to choose from."
                + "\neach coordinate will represent a different scene i.e. island,"
                + "\nport, open sea etc...  ***");
    }

    private void selectCrew() {
         this.console.println("*** If you chose a small ship you may have between "
                 + "\n2 - 9 crew members to choose from.  If you chose a large"
                 + "\nship you may have 8 - 19 crew members. ***");
    }

    private void displayEnemyTactics() {
         this.console.println("*** You will be given the option to run, fight or "
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
         this.console.println("*** There will be clues in the map that will help"
                 + "\nto navigate to where you need to go. ***");
    }

    private void stockShip() {
        this.console.println("*** You will be prompted to enter the number of pounds"
                + "\nof food you would like to get per person per day.  You will "
                + "\nbe able to choose your weapons and the size of barrels you want"
                + "\nfor water and rum. Obviously you will not be able to have"
                + "\nas much if you chose the smaller ship.***");
    }
}
