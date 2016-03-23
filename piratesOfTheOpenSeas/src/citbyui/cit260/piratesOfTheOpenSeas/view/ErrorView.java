/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

import java.io.PrintWriter;
import piratesoftheopenseas.PiratesOfTheOpenSeas;

/**
 *
 * @author Liz
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = PiratesOfTheOpenSeas.getOutFile();
    private static final PrintWriter logFile = PiratesOfTheOpenSeas.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println(
            "-------------------------------------------------"
            +"\n- ERROR - " + errorMessage
            +"\n----------------------------------------------");
        
        //log error
        logFile.println(className + " _ " + errorMessage);
    }
    
}
