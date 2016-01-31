/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratesoftheopenseas;

import byui.cit260.piratesOfTheOpenSeas.model.InventoryItem;
import byui.cit260.piratesOfTheOpenSeas.model.Location;
import byui.cit260.piratesOfTheOpenSeas.model.Player;
import byui.cit260.piratesOfTheOpenSeas.model.Ship;

/**
 *
 * @author Roland
 */
public class PiratesOfTheOpenSeas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        InventoryItem inventoryOne = new InventoryItem();
        InventoryItem inventoryTwo = new InventoryItem();
        Location locationOne = new Location();
        Ship shipOne = new Ship();
        
        playerOne.setName("Roland Pecku");
        playerOne.setHighScore(14.00);
        
        inventoryOne.setInventoryType("Cannons");
        inventoryOne.setQuantityInStock(15);
        inventoryOne.setRequiredAmount(10);
        
        inventoryTwo.setInventoryType("Guns");
        inventoryTwo.setQuantityInStock(40.0);
        inventoryTwo.setRequiredAmount(10.0);
        
        locationOne.setRow(12.0);
        locationOne.setColumn(5.0);
        locationOne.setVisited(2);
        locationOne.setNumberRemaining(3);
        
        shipOne.setDescription(" BabyJet, small and very fast");
        shipOne.setCrew(7);
        shipOne.setCannons(5);
        shipOne.setSpeed(3.5);
        shipOne.setMaxCapacity(1000);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        String inventoryCannons = inventoryOne.toString();
        System.out.println(inventoryCannons);
        
        String inventoryGuns = inventoryTwo.toString();
        System.out.println(inventoryGuns);
        
        String locate = locationOne.toString();
        System.out.println(locate);
        
        String shipInfo = shipOne.toString();
        System.out.println(shipInfo);
    }
    
}
