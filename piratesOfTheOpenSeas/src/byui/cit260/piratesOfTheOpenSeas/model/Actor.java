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
public enum Actor implements Serializable{
    
    CaptainHawkeye("He is the captain of the pirate ship"),
    CaptainPhillip("He is the captain of the Navy ship"),
    SeamanOne("He is the first mate"),
    SeamanTwo("He is the second mate");
  
    //class instance variables
    private final String description;
    private final String type;
   
    Actor(String description) {
        this.description = description;
        type = new String();
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }
    

 }
