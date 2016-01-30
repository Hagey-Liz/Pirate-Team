
package byui.cit260.piratesOfTheOpenSeas.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author RJ
 */
public class Game implements Serializable{

        //class instance variables
    private double totalTime;
    private double numPeople;
    
    
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

