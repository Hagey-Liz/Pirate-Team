/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Roderick
 */
public class Ship implements Serializable{
    
    // class instance variables
    private String description;
    private double crew;
    private double cannons;
    private double speed;
    private double maxCapacity;
    private ArrayList <Barrel> barrels;

    public Ship() {
        barrels = new ArrayList<Barrel>();
    }
    
    public boolean addBarrel(Barrel barrel) {
        if (getCurrentCargoWeight() + barrel.getWeight() < maxCapacity){
            barrels.add(barrel);   
            return true;
        }
            return false;
    } 
    
    public double getCurrentCargoWeight(){
        
        double currentCargoWeight = (crew * 180) + (cannons * 100);
            for (Barrel barrel : barrels) {
            currentCargoWeight += barrel.getWeight();
        }
        
        return currentCargoWeight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCrew() {
        return crew;
    }

    public void setCrew(double crew) {
        this.crew = crew;
    }

    public double getCannons() {
        return cannons;
    }

    public void setCannons(double cannons) {
        this.cannons = cannons;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(double maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.description);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.crew) ^ (Double.doubleToLongBits(this.crew) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.cannons) ^ (Double.doubleToLongBits(this.cannons) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.speed) ^ (Double.doubleToLongBits(this.speed) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.maxCapacity) ^ (Double.doubleToLongBits(this.maxCapacity) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Ship{" + "description=" + description + ", crew=" + crew + ", cannons=" + cannons + ", speed=" + speed + ", maxCapacity=" + maxCapacity + '}';
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
        final Ship other = (Ship) obj;
        if (Double.doubleToLongBits(this.crew) != Double.doubleToLongBits(other.crew)) {
            return false;
        }
        if (Double.doubleToLongBits(this.cannons) != Double.doubleToLongBits(other.cannons)) {
            return false;
        }
        if (Double.doubleToLongBits(this.speed) != Double.doubleToLongBits(other.speed)) {
            return false;
        }
        if (Double.doubleToLongBits(this.maxCapacity) != Double.doubleToLongBits(other.maxCapacity)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        return true;
    }

    
    
    
    
    
    
}
