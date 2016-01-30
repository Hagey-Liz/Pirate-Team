/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirate;

import byui.cit260.piratesOfTheOpenSeas.model.Actor;
import byui.cit260.piratesOfTheOpenSeas.model.IslandSceneType;
import byui.cit260.piratesOfTheOpenSeas.model.OpenSeaSceneType;
import byui.cit260.piratesOfTheOpenSeas.model.SeaPortSceneType;

/**
 *
 * @author Liz
 */
public class Pirate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Actor actorOne = new Actor();
      
      actorOne.setDescription("Great cannon shooter");
      actorOne.setName("Shooter");
      actorOne.setType("Pirate");
      
      String actorInfo = actorOne.toString();
      System.out.println(actorInfo);
      
      OpenSeaSceneType openSea = new OpenSeaSceneType();
      
      openSea.setDescription("Choppy high waves");
      openSea.setTravelTime("Slow - 1 knot per hour");
      openSea.setWeather("Hurricane");
      openSea.setBlocked("You need to go around");
      
      String openSeaInfo = openSea.toString();
      System.out.println(openSeaInfo);
      
      OpenSeaSceneType openSeaTwo = new OpenSeaSceneType();
      
      openSeaTwo.setDescription("Calm Sea");
      openSeaTwo.setTravelTime("Fast - 30 knots per hour");
      openSeaTwo.setWeather("Clear skies");
      openSeaTwo.setBlocked("Clear to move straight ahead");
      
      String openSeaInfoTwo = openSeaTwo.toString();
      System.out.println(openSeaInfoTwo);
      
      SeaPortSceneType seaPortOne = new SeaPortSceneType();
      
      seaPortOne.setDescription("Friendly, good supplies");
      seaPortOne.setTimeLost("One day");
      seaPortOne.setNoOfItems(10);
      seaPortOne.setBlocked("This port is not blocked");
      
      String seaPortOneInfo = seaPortOne.toString();
      System.out.println(seaPortOneInfo);
    
      IslandSceneType islandOne = new IslandSceneType();
      
      islandOne.setDescription("Unfriendly Natives, good supplies.");
      islandOne.setTravelTime("Two days");
      islandOne.setBlocked("Not blocked");
      
      String islandOneInfo = islandOne.toString();
      System.out.println(islandOneInfo);
      
      
    }
    
        
}
