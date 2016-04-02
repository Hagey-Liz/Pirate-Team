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
                +"\nC - How to select a ship"
                +"\nL - How to stock resources on your ship"
                +"\nF - How to fight the enemy"
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
                this.selectShip();
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
         this.console.println("*** The objective of the game is to find the hidden "
                 + "\ntreasure while avoiding capture, or worse, from your enemy. "
                 + "\nThe journey will be long and dangerous.  You will "
                 + "\nhave to risk life or death if you want to find the treasure "
                 + "\nof all treasures. ***");
    }

    private void howToNavigate() {
        this.console.println("*** You will given a range of coordinates to choose from. "
                + "\neach coordinate will represent a different scene i.e. island, "
                + "\nport, open sea etc... You should start at coordinates 0, 0 ***");
    }

    private void selectShip() {
         this.console.println("*** You will be prompted to choose either a small or large ship. "
                 + "\nIf you chose a small ship your weight limit will be 6000 lbs.,"
                 + "\n you will gave a crew of 8 and have 12 cannons and 25 cannon balls."
                 + "\n If you chose a large ship you will have a crew of 19, 10 cannons, "
                 + "\n40 cannon balls and your weight limit will be 8000 lbs. ***");
    }

    private void displayEnemyTactics() {
         this.console.println("*** You will be given the option to run or fight "
                 + "\n If you choose to fight you will need to choose how many "
                 + "\ncannon balls you want to use. If you do not choose enough you "
                 + "\nloose the game.  If you choose enough then you will win the "
                 + "\nbattle and be able to move to a new location.  If the new"
                 + "\n location is a fight scene you may not have enough left to win,"
                 + "\n but if you are able to re-stock you may still win.***");
    }

    private void displayMap() {
         this.console.println("*** You will be prompted to enter the coordinates of where you would"
                 + "\n like to move next.  The map will have *  * to show your current locaton "
                 + "\nand will have >  < to show that you have already visited that location. ***");
    }

    private void stockShip() {
        this.console.println("*** When you click select resources You will be prompted to enter "
                + "\nthe size of the barrel you would like to use. You will then be "
                + "\ntold the weight and able to choose if you want to add it to your ship. "
                + "\nYou will need to make sure that you do not exceed the maximum "
                + "\nweight allowed for the ship you chose.***");
    }
}
