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
public class OpenSeaSceneType implements Serializable{
    
    //class instance variables
    private String description;
    private String weather;
    private String blocked;
    private String travelTime;

    public OpenSeaSceneType() {
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.description);
        hash = 17 * hash + Objects.hashCode(this.weather);
        hash = 17 * hash + Objects.hashCode(this.blocked);
        hash = 17 * hash + Objects.hashCode(this.travelTime);
        return hash;
    }

    @Override
    public String toString() {
        return "OpenSeaSceneType{" + "description=" + description + ", weather=" + weather + ", blocked=" + blocked + ", travelTime=" + travelTime + '}';
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
        final OpenSeaSceneType other = (OpenSeaSceneType) obj;
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.weather, other.weather)) {
            return false;
        }
        if (!Objects.equals(this.blocked, other.blocked)) {
            return false;
        }
        if (!Objects.equals(this.travelTime, other.travelTime)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
