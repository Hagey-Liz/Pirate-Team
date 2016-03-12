/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.model;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author Roderick
 */
public class Location implements Serializable{
    
    //class instance variables
    private double row;
    private double column;
    private boolean visited;
    private double numberRemaining;
    private Scene scene;
    private ArrayList<Actor> actors;

    public Location() {
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
    }
    
    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public double getNumberRemaining() {
        return numberRemaining;
    }

    public void setNumberRemaining(double numberRemaining) {
        this.numberRemaining = numberRemaining;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
 
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.numberRemaining) ^ (Double.doubleToLongBits(this.numberRemaining) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + ", numberRemaining=" + numberRemaining + '}';
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
     
        if (Double.doubleToLongBits(this.numberRemaining) != Double.doubleToLongBits(other.numberRemaining)) {
            return false;
        }
        return true;
    }
 
    
    
}
    
    
    
    