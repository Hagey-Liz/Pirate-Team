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
public class SelectInventoryItemView {
    
    private String resource;
    private String promptMessage="Select a resource for your journey: ";

    public SelectInventoryItemView() {
        this.resource = "\n"
                +"\n--------------------------------------------"
                +"\n|Resources                                 |"
                +"\n--------------------------------------------"
                +"\nD - drinking water"
                +"\nR - Rum"
                +"\nO - Oil"
                +"\nF - Food"
                +"\nW - Weapons"
                +"\nB - Barrel"
                +"\nE - Exit"
                +"\n-------------------------------------------";
    }
    
    public void displaySelectInventoryItemView() {
        boolean done = false; //set flag to not done
        do{
            //prompt for and get players choice
            String resourceOption = this.getResourceOption();
            if (resourceOption.toUpperCase().equals("E"))//user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(resourceOption);
            
        } while (!done);
       
    }

    private String getResourceOption() {
        Scanner keyboard = new Scanner(System.in);// get infile for keyboard
       String value = "";// value to be returned
       boolean valid = false;//initialize to not valid
       
       while(!valid){//loop while an invalid value is entered
           System.out.println("\n" + this.resource);
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
    
  private boolean doAction(String resourceOption) {
        resourceOption = resourceOption.toUpperCase(); //convert choice to upper case

        switch (resourceOption){
            case "D": 
                this.drinkingWater();
                break;
            case "R": //Get rum
                this.stockRum();
                break;
            case "O": //Get oil
                this.stockOil();
                break;
            case "F": //Get food by the pound
                this.stockFood();
                break;
            case "W": //Get Weapons
                this.stockWeapons();
                break;
            case "B": // Get Barrel
                this.stockBarrel();
                break;
            default:
                System.out.println("\n*** Invalid selection *** try again");
}
        return false;
    }

    private void drinkingWater() {
        System.out.println("*** drinkingWater function called ***");
    }

    private void stockRum() {
        System.out.println("*** stockRum function called ***");
    }

    private void stockOil() {
        System.out.println("*** stockOil function called ***");
    }

  
    private void stockWeapons() {
        System.out.println("*** stockWeapons function called ***");
    }

    private void stockFood() {
       StockFoodView stockFood = new StockFoodView();
       stockFood.getFoodNeeded();
         
    }

    private void stockBarrel() {
        BarrelView barrelView = new BarrelView();
        barrelView.getBarrelVolume();
    }
  
}
