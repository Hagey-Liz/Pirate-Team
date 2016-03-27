
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piratesoftheopenseas;


import byui.cit260.piratesOfTheOpenSeas.model.Game;
import byui.cit260.piratesOfTheOpenSeas.model.Player;

import citbyui.cit260.piratesOfTheOpenSeas.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Roderick
 */
public class PiratesOfTheOpenSeas {
    
    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        PiratesOfTheOpenSeas.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        PiratesOfTheOpenSeas.player = player;
    }
    
    public static void main(String[] args){
    
     
     try {
         PiratesOfTheOpenSeas.inFile=
                 new BufferedReader(new InputStreamReader(System.in));
         
         PiratesOfTheOpenSeas.outFile = new PrintWriter(System.out, true);
         
         //open log file
         String filePath = "log.txt";
         PiratesOfTheOpenSeas.logFile = new PrintWriter(filePath);
         StartProgramView startProgramView = new StartProgramView();
         startProgramView.display();
        
    } catch(Throwable e) {
        System.out.println("Exception: " + e.toString() +
                            "\nCause: " + e.getCause() +
                            "\nMessage: " + e.getMessage());
        e.printStackTrace();;
        //startProgramView.displayStartProgramView();
    }
     finally {
         try {
             if (PiratesOfTheOpenSeas.inFile != null)
                 PiratesOfTheOpenSeas.inFile.close();
             
             if (PiratesOfTheOpenSeas.outFile != null)
                 PiratesOfTheOpenSeas.outFile.close();
             
             if (PiratesOfTheOpenSeas.logFile != null)
                 PiratesOfTheOpenSeas.logFile.close();
         } catch (IOException ex) {
             System.out.println("Error closing files");
             return;
         }
         
     }

    } 

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        PiratesOfTheOpenSeas.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        PiratesOfTheOpenSeas.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        PiratesOfTheOpenSeas.logFile = logFile;
    }
    
    
}

