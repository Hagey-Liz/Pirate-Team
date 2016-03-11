/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

import byui.cit260.piratesOfTheOpenSeas.model.Game;
import byui.cit260.piratesOfTheOpenSeas.model.InventoryItem;
import byui.cit260.piratesOfTheOpenSeas.model.Map;
import byui.cit260.piratesOfTheOpenSeas.model.Player;
import byui.cit260.piratesOfTheOpenSeas.model.Ship;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */
public class GameControl {

    public static Player createPlayer(String name) {
        
        if (name == null) {
            return null;
        }
        
        Player player = new Player();
        player.setName(name);
        
        PiratesOfTheOpenSeas.setPlayer(player); // save the player.
        
        return player;
    }

    public static void createNewGame(Player player) {
        
        Game game = new Game();//create new game
        PiratesOfTheOpenSeas.setCurrentGame(game);//save in PiratesOfTheOpenSeas
        
        game.setPlayer(player);//save player in game
        
        InventoryItem[] inventoryList = GameControl.createInventoryList();
        game.setInventory(inventoryList);
        
        Ship[] shipList = GameControl.createShipList();//create ship list
        game.setShip(shipList);//save ship in game
        
        Map map = MapControl.createMap();//create and initialize new map
        game.setMap(map);//save map in game
        
        //move actors to starting position in the map
        MapControl.moveActorsToStartingLocation(map);
        
    }

    private static Ship[] createShipList() {
        System.out.println("***called creatShipList() in GameControl ***");
        return null;
    }

    public static InventoryItem[] createInventoryList() {
        
        //create array(list) of inventory items
        InventoryItem[] inventory = new InventoryItem[5];
        
        InventoryItem food = new InventoryItem();
        food.setDescription("food");
        food.setQuantityInStock(0);
        food.setRequiredAmount(0);
        inventory[0] = food;
        
        InventoryItem water = new InventoryItem();
        water.setDescription("water");
        water.setQuantityInStock(0);
        water.setRequiredAmount(0);
        inventory[0] = water;
        
        InventoryItem rum = new InventoryItem();
        rum.setDescription("rum");
        rum.setQuantityInStock(0);
        rum.setRequiredAmount(0);
        inventory[0] = rum;
        
        InventoryItem oil = new InventoryItem();
        oil.setDescription("oil");
        oil.setQuantityInStock(0);
        oil.setRequiredAmount(0);
        inventory[0] = oil;
        
        InventoryItem weapons = new InventoryItem();
        weapons.setDescription("weapons");
        weapons.setQuantityInStock(0);
        weapons.setRequiredAmount(0);
        inventory[0] = weapons;
        
        return inventory;
    }
        
}
    

