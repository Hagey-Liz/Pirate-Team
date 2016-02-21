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
    private String promptMessage;

    public HelpMenuView() {
        this.helpMenu = "\n"
                +"\n--------------------------------------------"
                +"\n|Help Menu                                 |"
                +"\n--------------------------------------------"
                +"\nB - What is the objective of the game?"
                +"\nN - How to navigate"
                +"\nC - How to select a crew"
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
         System.out.println("*** displayGameObjective function called ***");
    }

    private void howToNavigate() {
        System.out.println("*** howToNavigate function called ***");
    }

    private void selectCrew() {
         System.out.println("*** selectCrew function called ***");
    }

    private void displayEnemyTactics() {
         System.out.println("*** displayEnemyTactics function called ***");
    }

    private void displayMap() {
         System.out.println("*** displayMap function called ***");
    }
}
