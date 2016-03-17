/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

import byui.cit260.piratesOfTheOpenSeas.model.Map;
import byui.cit260.piratesOfTheOpenSeas.model.Scene;
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

    public static void moveActorsToLocation(Map map) {
     System.out.println("Move actors to Location");
    }
        
        /*Map map = PiratesOfTheOpenSeas.getCurrentGamei().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        
        if (newRow < 0 || newRow >= map.getRowCount() ||
                newColumn < 0 || new Column >= map.getColumnCount()) {
            return -1;
        }
        return 0;
    }*/
    
}
