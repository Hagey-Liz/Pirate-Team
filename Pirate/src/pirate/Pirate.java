/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pirate;

import byui.cit260.piratesOfTheOpenSeas.model.Actor;

/**
 *
 * @author Liz
 */
public class Pirate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Actor actorOne = new Actor();
      
      actorOne.setDescription("Great cannon shooter");
      actorOne.setName("Shooter");
      actorOne.setType("Pirate");
      
      String actorInfo = actorOne.toString();
      System.out.println(actorInfo);
      
    }
    
}
