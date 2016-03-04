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
public class SelectInventoryItemView  extends View {
    
  public SelectInventoryItemView() {
            super("\n"
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
                +"\n-------------------------------------------");
    }
    

   @Override 
  public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case

        switch (value){
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
