/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.model;

import java.io.Serializable;

/**
 *
 * @author Roderick
 */
public class Barrel implements Serializable{
    
    // class instance variables
    private double diameter;
    private double height;
    private double volume;
    private double maxWeight;

    public Barrel() {
    }
    
    

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.diameter) ^ (Double.doubleToLongBits(this.diameter) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.height) ^ (Double.doubleToLongBits(this.height) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.volume) ^ (Double.doubleToLongBits(this.volume) >>> 32));
        hash = 59 * hash + (int) (Double.doubleToLongBits(this.maxWeight) ^ (Double.doubleToLongBits(this.maxWeight) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Barrel{" + "diameter=" + diameter + ", height=" + height + ", volume=" + volume + ", maxWeight=" + maxWeight + '}';
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
        final Barrel other = (Barrel) obj;
        if (Double.doubleToLongBits(this.diameter) != Double.doubleToLongBits(other.diameter)) {
            return false;
        }
        if (Double.doubleToLongBits(this.height) != Double.doubleToLongBits(other.height)) {
            return false;
        }
        if (Double.doubleToLongBits(this.volume) != Double.doubleToLongBits(other.volume)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxWeight) != Double.doubleToLongBits(other.maxWeight)) {
            return false;
        }
        return true;
    }
    
    
}
