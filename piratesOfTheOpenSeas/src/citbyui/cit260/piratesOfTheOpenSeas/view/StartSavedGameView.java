/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

/**
 *
 * @author Roland
 */
public class StartSavedGameView extends View{
    
    public StartSavedGameView(){
        super("\n"
                +"\n--------------------------------------------"
                +"\n|Continue Saved Game Menu                                 |"
                +"\n--------------------------------------------"    
                +"\nC - Continue Saved Game"
                +"\nQ - Quit game - return to Main Menu"
                +"\n-------------------------------------------");   
    
    }
    
   @Override   
    public boolean doAction(String value){
       value = value.toUpperCase(); //convert choice to upper case

        switch (value){
            
            case "C": //save the current game
                this.startExistingGame();
                break;
        
            default:
                System.out.println("\n*** Invalid selection *** try again");
}
        return false;
    
} 

    private void startExistingGame() {
        System.out.println("\nWelcome back.");
    }

    
}
    

