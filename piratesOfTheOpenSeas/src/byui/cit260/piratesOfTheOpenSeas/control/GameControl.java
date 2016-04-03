/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

import byui.cit260.piratesOfTheOpenSeas.model.Game;
import byui.cit260.piratesOfTheOpenSeas.model.InventoryItem;
import byui.cit260.piratesOfTheOpenSeas.model.Location;
import byui.cit260.piratesOfTheOpenSeas.model.Map;
import byui.cit260.piratesOfTheOpenSeas.model.Player;
import byui.cit260.piratesOfTheOpenSeas.model.Scene;
import byui.cit260.piratesOfTheOpenSeas.model.Ship;
import byui.cit260.piratesOfTheOpenSeas.model.Weapons;
import citbyui.cit260.piratesOfTheOpenSeas.exceptions.GameControlException;
import citbyui.cit260.piratesOfTheOpenSeas.view.GameMenuView;
import citbyui.cit260.piratesOfTheOpenSeas.view.MainMenuView;
import citbyui.cit260.piratesOfTheOpenSeas.view.View;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import piratesoftheopenseas.PiratesOfTheOpenSeas;
import java.io.PrintWriter;

/**
 *
 * @author Liz
 */
public class GameControl extends View {
   
    private static int NUMBER_OF_SHIPS = 2;
    private static int NUMBER_OF_INVENTORY_ITEMS = 5;
    private static int NUMBER_OF_WEAPONS = 4;

    public static void saveGame(Game game, String filePath)
        throws GameControlException {
        
        try (FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        }
        catch (Exception e) {
            throw  new GameControlException(e.getMessage());
        }
    }
    

    public static void getSavedGame(String filePath) 
                        throws GameControlException {
        Game game = null;
        
        try(FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input  = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
        }
        catch(Exception e) {
            throw new GameControlException(e.getMessage());
        }
        PiratesOfTheOpenSeas.setCurrentGame(game);
    }
    
    
    protected final PrintWriter console = PiratesOfTheOpenSeas.getOutFile();
    
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
        
        InventoryItem[] inventoryList = createInventoryList();
        game.setInventory(inventoryList);
        
        //Ship[] shipList = GameControl.createShipList();//create ship list
        //game.setShip(shipList);//save ship in game
        
        Map map = MapControl.createMap();//create and initialize new map
        game.setMap(map);//save map in game
        
        
        //move actors to starting position in the map
        MapControl.movePlayerToStartingLocation();
        
    }

    public static InventoryItem[] getSortedInventoryList() {
    System.out.println("*** get sorted inventory list ***");
    return null;
    }

    @Override
    public boolean doAction(String value) {
        return true;
    }
    
    public enum SceneType {
        start,
        tavern,
        supplyStation,
        friendlyPort,
        enemyPort,
        openSea,
        mutiny,
        seaStorm,
        friendlyIsland,
        desertedIsland,
        beach,
        fight,
        finish;
    }

    public static Scene[] createScenes() {
        
        Game game = PiratesOfTheOpenSeas.getCurrentGame();
        
        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\nYou are relaxing in your local tavern when you overhear "
                +"someone talking about a lost treasure You quietly listen "
                +"and secretly plan to go find the treasure");
        startingScene.setMapSymbol("ST");
        startingScene.setBlocked(false);
        startingScene.setTravelTime(240);
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene beach = new Scene();
        beach.setDescription(
                "\nBeach scene");
        beach.setMapSymbol("BE");
        beach.setBlocked(false);
        beach.setTravelTime(240);
        scenes[SceneType.beach.ordinal()] = beach;
        
        Scene enemyPort = new Scene();
        enemyPort.setDescription(
                "\nThis is an enemy port, you need to leave quickly or you will die");
        enemyPort.setMapSymbol("EP");
        enemyPort.setBlocked(false);
        enemyPort.setTravelTime(240);
        scenes[SceneType.enemyPort.ordinal()] = enemyPort;
        
        Scene desertedIsland = new Scene();
        desertedIsland.setDescription(
                "\nYou have landed on a deserted Island.  Now is a good time to let your men"
                        + "rest for a little while and restock your water supply.");
        desertedIsland.setMapSymbol("DI");
        desertedIsland.setBlocked(false);
        desertedIsland.setTravelTime(240);
        scenes[SceneType.desertedIsland.ordinal()] = desertedIsland;
        
        
        Scene tavern = new Scene();
        tavern.setDescription(
                "\nYou found a local tavern where your crew can relax and rest");
        tavern.setMapSymbol("TV");
        tavern.setBlocked(false);
        tavern.setTravelTime(240);
        scenes[SceneType.tavern.ordinal()] = tavern;
        
        Scene fight = new Scene();
        fight.setDescription(
                "\nFight Scene");
        fight.setMapSymbol("FT");
        fight.setBlocked(false);
        fight.setTravelTime(240);
        scenes[SceneType.fight.ordinal()] = fight;
        
        Scene friendlyIsland = new Scene();
        friendlyIsland.setDescription(
                "\nYou have landed on an island with friendly natives.  You can "
                        + "re-stock your ship if you need.");
        friendlyIsland.setMapSymbol("FI");
        friendlyIsland.setBlocked(false);
        friendlyIsland.setTravelTime(240);
        scenes[SceneType.friendlyIsland.ordinal()] = friendlyIsland;
        
        Scene friendlyPort = new Scene();
        friendlyPort.setDescription(
                "\nThis is a friendly port and good place to restock your ship.");
        friendlyPort.setMapSymbol("FP");
        friendlyPort.setBlocked(false);
        friendlyPort.setTravelTime(240);
        scenes[SceneType.friendlyPort.ordinal()] = friendlyPort;
        
        Scene openSea = new Scene();
        openSea.setDescription(
                "\nOpen Sea");
        openSea.setMapSymbol("OS");
        openSea.setBlocked(false);
        openSea.setTravelTime(240);
        scenes[SceneType.openSea.ordinal()] = openSea;
        
        Scene seaStorm = new Scene();
        seaStorm.setDescription(
                "\nYou are in a terrible storm, you must put your anchor down and "
                        + "wait it out.");
        seaStorm.setMapSymbol("SM");
        seaStorm.setBlocked(false);
        seaStorm.setTravelTime(240);
        scenes[SceneType.seaStorm.ordinal()] = seaStorm;
        
        Scene supplyStation = new Scene();
        supplyStation.setDescription(
                "\nSupply Station");
        supplyStation.setMapSymbol("SS");
        supplyStation.setBlocked(false);
        supplyStation.setTravelTime(240);
        scenes[SceneType.supplyStation.ordinal()] = supplyStation;
        
        Scene mutiny = new Scene();
        mutiny.setDescription(
                "\nYour men have begun a mutiny and you have been thrown overboard! Game over");
        mutiny.setMapSymbol("MU");
        mutiny.setBlocked(false);
        mutiny.setTravelTime(240);
        scenes[SceneType.mutiny.ordinal()] = mutiny;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\nCongratulations! You found the treasure!");
        finishScene.setMapSymbol("FN");
        finishScene.setBlocked(false);
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[SceneType.finish.ordinal()] = finishScene;
        
        return scenes;
    }

    public static void assignScenesToLocations(Map map, Scene[] scenes) {
       Location[] [] locations = map.getLocations();
       
       //start point
       locations[0][0].setScene(scenes[SceneType.start.ordinal()]);
       locations[0][0].setVisited(false);
       locations[0][1].setScene(scenes[SceneType.tavern.ordinal()]);
       locations[0][1].setVisited(false);
       locations[0][2].setScene(scenes[SceneType.friendlyPort.ordinal()]);
       locations[0][2].setVisited(false);
       locations[0][3].setScene(scenes[SceneType.friendlyPort.ordinal()]);
       locations[0][3].setVisited(false);
       locations[0][4].setScene(scenes[SceneType.friendlyPort.ordinal()]);
       locations[0][4].setVisited(false);
       locations[1][0].setScene(scenes[SceneType.openSea.ordinal()]);
       locations[1][0].setVisited(false);
       locations[1][1].setScene(scenes[SceneType.openSea.ordinal()]);
       locations[1][1].setVisited(false);
       locations[1][2].setScene(scenes[SceneType.seaStorm.ordinal()]);
       locations[1][2].setVisited(false);
       locations[1][3].setScene(scenes[SceneType.seaStorm.ordinal()]);
       locations[1][3].setVisited(false);
       locations[1][4].setScene(scenes[SceneType.seaStorm.ordinal()]);
       locations[1][4].setVisited(false);
       locations[2][0].setScene(scenes[SceneType.beach.ordinal()]);
       locations[2][0].setVisited(false);
       locations[2][1].setScene(scenes[SceneType.supplyStation.ordinal()]);
       locations[2][1].setVisited(false);
       locations[2][2].setScene(scenes[SceneType.fight.ordinal()]);
       locations[2][2].setVisited(false);
       locations[2][3].setScene(scenes[SceneType.openSea.ordinal()]);
       locations[2][3].setVisited(false);
       locations[2][4].setScene(scenes[SceneType.fight.ordinal()]);
       locations[2][4].setVisited(false);
       locations[3][0].setScene(scenes[SceneType.supplyStation.ordinal()]);
       locations[3][0].setVisited(false);
       locations[3][1].setScene(scenes[SceneType.beach.ordinal()]);
       locations[3][1].setVisited(false);
       locations[3][2].setScene(scenes[SceneType.friendlyIsland.ordinal()]);
       locations[3][2].setVisited(false);
       locations[3][3].setScene(scenes[SceneType.mutiny.ordinal()]);
       locations[3][3].setVisited(false);
       locations[3][4].setScene(scenes[SceneType.finish.ordinal()]);
       locations[3][4].setVisited(false);
       locations[4][0].setScene(scenes[SceneType.supplyStation.ordinal()]);
       locations[4][0].setVisited(false);
       locations[4][1].setScene(scenes[SceneType.fight.ordinal()]);
       locations[4][1].setVisited(false);
       locations[4][2].setScene(scenes[SceneType.desertedIsland.ordinal()]);
       locations[4][2].setVisited(false);
       locations[4][3].setScene(scenes[SceneType.openSea.ordinal()]);
       locations[4][3].setVisited(false);
       locations[4][4].setScene(scenes[SceneType.enemyPort.ordinal()]);
       locations[4][4].setVisited(false);
       
    }
    
    public enum Ships {
        small,
        large;
    }

    private static Ship[] createShipList() {
       
        Ship[] ship = new Ship[NUMBER_OF_SHIPS];
        
        Ship small = new Ship();
        small.setDescription("Small");
        small.setCrew(8);
        small.setCannons(12);
        small.setCannonBalls(25);
        small.setMaxCapacity(6000);
        small.setSpeed(30);
        ship[Ships.small.ordinal()] = small;
        
        Ship large = new Ship();
        large.setDescription("Large");
        large.setCrew(19);
        large.setCannons(20);
        large.setCannonBalls(40);
        large.setMaxCapacity(8000);
        large.setSpeed(20);
        ship[Ships.large.ordinal()] = large;
        
        return ship;
    }
    
   
    
    public enum Item {
        food,
        water,
        rum,
        oil,
        weapons;
    }

    public static InventoryItem[] createInventoryList() {
        
       
        //create array(list) of inventory items
        InventoryItem[] inventory = new InventoryItem[NUMBER_OF_INVENTORY_ITEMS];
        
        InventoryItem food = new InventoryItem();
        food.setDescription("food\t");
        food.setQuantityInStock(0);
        food.setRequiredAmount(200);
        System.out.println("\t");
        inventory[Item.food.ordinal()] = food;
        
        InventoryItem water = new InventoryItem();
        water.setDescription("water\t");
        water.setQuantityInStock(0);
        water.setRequiredAmount(400);
        System.out.println("\t");
        inventory[Item.water.ordinal()] = water;
        
        InventoryItem rum = new InventoryItem();
        rum.setDescription("rum\t");
        rum.setQuantityInStock(0);
        rum.setRequiredAmount(0);
        System.out.println("\t");
        inventory[Item.rum.ordinal()] = rum;
        
        InventoryItem oil = new InventoryItem();
        oil.setDescription("oil\t");
        oil.setQuantityInStock(0);
        oil.setRequiredAmount(300);
        System.out.println("\t");
        inventory[Item.oil.ordinal()] = oil;
        
        return inventory;
    }
    public  void fight() {
        Game game = PiratesOfTheOpenSeas.getCurrentGame();
        Ship ship = game.getShip();
        
       int cannons = 0;
      
        this.console.println("Enter the number of cannon balls you would like to "
                + "use against the enemy. ");
          cannons  = this.getInteger();
          if (cannons < 5) {
              this.console.println("You lost");
               MainMenuView mainMenuView = new MainMenuView();
               mainMenuView.display();
          }
          else { 
              double currentCannonBalls = ship.getCannonBalls();
              double depleteCannonBalls = currentCannonBalls - cannons;
              ship.setCannonBalls(depleteCannonBalls);
              this.console.println("\nYou have fired " + cannons + " cannon balls. You have "
                                 + "\n" + depleteCannonBalls + " cannon balls remaining.");
              this.console.println("\nYou defeated your enemies, you can move to a new location\n");
        
        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.moveLocation();
        }
        
    }
   
    private static Map createMap() {
        //create the map
        Map map = new Map(5, 5);
        
        //create the scenes for the game
        Scene[] scenes = createScenes();
        
        //assign scenes to locations
        assignScenesToLocations(map, scenes);
        
        return map;
    }
        
}
    

