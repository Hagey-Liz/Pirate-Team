
package byui.cit260.piratesOfTheOpenSeas.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author RJ Phelps
 */
public class Game implements Serializable{

        //class instance variables
    private double totalTime;
    private double numPeople;

    private InventoryItem[] inventory;
    private Ship[] ship;
    private Player player;
    private String[]actor;
    private Map map;
    
    
public Game(){
}    

public double getTotalTime(){
    return totalTime;
}

public void setTotalTime(double totalTime){
    this.totalTime = totalTime;
}

public double getNumPeople(){
    return numPeople;
}

public void setNumPeople(double numPeople){
    this.numPeople = numPeople;
}

public InventoryItem[] getInventory() {
    return inventory;
}

public void setInventory(InventoryItem[] inventory) {
     this.inventory = inventory;
}

public Ship[] getShip() {
    return ship;
}

public void setShip(Ship[] ship) {
    this.ship = ship;
}

public Player getPlayer() {
    return player;
}

public void setPlayer(Player player) {
    this.player = player;
}

public String[] getActor() {
    return actor;
}

public void setActor(String[] actor) {
    this.actor = actor;
}

public Map getMap() {
    return map;
}

public void setMap(Map map) {
    this.map = map;
}

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.totalTime) ^ (Double.doubleToLongBits(this.totalTime) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.numPeople) ^ (Double.doubleToLongBits(this.numPeople) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.totalTime) != Double.doubleToLongBits(other.totalTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.numPeople) != Double.doubleToLongBits(other.numPeople)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "totalTime=" + totalTime + ", numPeople=" + numPeople + '}';
    }





}

