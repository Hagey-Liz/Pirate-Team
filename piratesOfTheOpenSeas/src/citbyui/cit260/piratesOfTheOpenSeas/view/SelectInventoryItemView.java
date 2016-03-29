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
                +"\nQ - Quit"
                +"\n-------------------------------------------");
    }
    

   @Override 
  public boolean doAction(String value) {
        value = value.toUpperCase(); //convert choice to upper case
        try {
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
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** try again");
}
        }catch (Exception e) {
            ErrorView.display(this.getClass().getName(),
                    "Error" + e.getMessage());
        }
        return false;
    }

    private void drinkingWater() {
        BarrelWeightView barrelWeight = new BarrelWeightView();
        barrelWeight.getBarrelWeight();
    } 

    private void stockRum() {
        BarrelWeightView barrelWeight = new BarrelWeightView();
        barrelWeight.getBarrelWeight();
    }

    private void stockOil() {
        BarrelWeightView barrelWeight = new BarrelWeightView();
        barrelWeight.getBarrelWeight();
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
