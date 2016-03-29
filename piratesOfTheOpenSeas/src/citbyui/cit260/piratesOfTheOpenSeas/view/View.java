/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = PiratesOfTheOpenSeas.getInFile();
    protected final PrintWriter console = PiratesOfTheOpenSeas.getOutFile();
       
    public View(){
    }
    
    public View(String message) {
        this.displayMessage = message;
       
    }
    
    @Override
        public void display() {
        boolean done = false; //set flag to not done
        do{
            //prompt for and get players name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q"))//user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(value);
            
        } while (!done);
       
    }
        
    @Override
        public String getInput() {
             
       //selection = keyboard.nextLine();// get infile for keyboard
       String selection = null;// value to be returned
       boolean valid = false;//initialize to not valid
      try { 
       while(!valid){//loop while an invalid value is entered
            this.console.println("\n" + this.displayMessage);
           
           
           selection = this.keyboard.readLine();//get next line typed on keyboard
           selection = selection.trim();//trim off leading and trailing blanks
           
           if (selection.length() < 1){//value is blank
               ErrorView.display(this.getClass().getName(),
                       "\nYou must enter a value.");
               continue;
           }
           break; //end the loop
    }
      }catch (Exception e) {
          ErrorView.display(this.getClass().getName(),
                  "Error reading input: " + e.getMessage());
      }
       return selection;//return the value entered
    } 
        public int getInteger() {
            int returnValue = -999;
            String selection = null;// value to be returned
            boolean valid = false;//initialize to not valid
            
            while(!valid){//loop while an invalid value is entered
                try { 
                    selection = this.keyboard.readLine();//get next line typed on keyboard
                    selection = selection.trim();//trim off leading and trailing blanks

                    if (selection.length() < 1){//value is blank
                        ErrorView.display(this.getClass().getName(),
                                "\nYou must enter a number.");
                        continue;
                    }
                   
               
                }catch (Exception e) {
                    ErrorView.display(this.getClass().getName(),
                         "Error reading input: " + e.getMessage());
                }
                try {
                    returnValue = Integer.parseInt(selection);
                    valid = true;
                }
                catch (Exception e) {
                    ErrorView.display(this.getClass().getName(),
                         "Error reading input, not an integer: " + e.getMessage());
                    //continue;
                }
            }
                return returnValue;
        }
       
}
