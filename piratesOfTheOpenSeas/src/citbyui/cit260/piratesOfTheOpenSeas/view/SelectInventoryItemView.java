/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import byui.cit260.piratesOfTheOpenSeas.model.Game;
import byui.cit260.piratesOfTheOpenSeas.model.InventoryItem;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */
public class SelectInventoryItemView  extends View {
    Game game = PiratesOfTheOpenSeas.getCurrentGame();
    InventoryItem [] inventory = game.getInventory();
    String barrelItem = null;
    
    public SelectInventoryItemView() {
            super("\n"
                +"\n--------------------------------------------"
                +"\n|Resources                                 |"
                +"\n--------------------------------------------"
                +"\nD - drinking water"
                +"\nR - Rum"
                +"\nO - Oil"
                +"\nF - Food"
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
        barrelItem = "water";
        BarrelWeightView barrelWeight = new BarrelWeightView();
        barrelWeight.getBarrelWeight(barrelItem);
        
    } 

    private void stockRum() {
        barrelItem = "rum";
        BarrelWeightView barrelWeight = new BarrelWeightView();
        barrelWeight.getBarrelWeight(barrelItem);
    }

    private void stockOil() {
        barrelItem = "oil";
        BarrelWeightView barrelWeight = new BarrelWeightView();
        barrelWeight.getBarrelWeight(barrelItem);
    }

  
    private void stockFood() {
        barrelItem = "food";
        BarrelWeightView barrelWeight = new BarrelWeightView();
        barrelWeight.getBarrelWeight(barrelItem);
         
    }

    private void stockBarrel() {
        BarrelView barrelView = new BarrelView();
        barrelView.getBarrelVolume();
    }
  
}
