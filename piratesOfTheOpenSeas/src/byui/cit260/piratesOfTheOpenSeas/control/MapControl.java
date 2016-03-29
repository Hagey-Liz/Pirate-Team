/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

import byui.cit260.piratesOfTheOpenSeas.model.Actor;
import byui.cit260.piratesOfTheOpenSeas.model.Map;
import byui.cit260.piratesOfTheOpenSeas.model.Scene;
import com.sun.rowset.internal.Row;
import java.awt.Point;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */
public class MapControl {

    public static Map createMap() {
        //create the map
        Map map = new Map(5, 5);
        
        //create a list of the different scenes in the game
        Scene[] scenes = GameControl.createScenes();
        
        //assign the different scenes to locations in the map
       GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    public static void movePlayerToStartingLocation() {
        movePlayerToLocation(0,0);
       /* Actor[] actors = new Actor.values();
        
        for (Actor actor : actors) {
            Point coordinates = actor.getCoordinates();
            int returnValue = MapControl.moveActorToLocation(actor, coordinates);
            if (returnValue < 0) {
                return returnValue;
            }
        }
        return 0*/
    }
        
        
     
    public static int movePlayerToLocation(int newRow, int newColumn) {
        
        Map map = PiratesOfTheOpenSeas.getCurrentGame().getMap();
       
        
        if (newRow < 0 || newRow >= map.getRowCount() ||
            newColumn < 0 || newColumn >= map.getColumnCount()) {
            return -1;
       }
        
        map.setCurrentLocation( map.getLocations()[newRow][newColumn]);
        return 0;
    }
    
}
