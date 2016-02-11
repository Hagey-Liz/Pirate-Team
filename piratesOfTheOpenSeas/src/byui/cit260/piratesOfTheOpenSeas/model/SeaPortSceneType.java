/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Liz
 */
public class SeaPortSceneType implements Serializable{
  
    //class instance variables
    private String description;
    private double noOfItems;
    private double timeLost;
    private boolean blocked;

    public SeaPortSceneType() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getNoOfItems() {
        return noOfItems;
    }

    public void setNoOfItems(double noOfItems) {
        this.noOfItems = noOfItems;
    }

    public double getTimeLost() {
        return timeLost;
    }

    public void setTimeLost(double timeLost) {
        this.timeLost = timeLost;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.description);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.noOfItems) ^ (Double.doubleToLongBits(this.noOfItems) >>> 32));
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.timeLost) ^ (Double.doubleToLongBits(this.timeLost) >>> 32));
        hash = 11 * hash + (this.blocked ? 1 : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "SeaPortSceneType{" + "description=" + description + ", noOfItems=" + noOfItems + ", timeLost=" + timeLost + ", blocked=" + blocked + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SeaPortSceneType other = (SeaPortSceneType) obj;
        if (Double.doubleToLongBits(this.noOfItems) != Double.doubleToLongBits(other.noOfItems)) {
            return false;
        }
        if (Double.doubleToLongBits(this.timeLost) != Double.doubleToLongBits(other.timeLost)) {
            return false;
        }
        if (this.blocked != other.blocked) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

 
    
}
