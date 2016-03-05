/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.piratesOfTheOpenSeas.view;

/**
 *
 * @author Liz
 */
public class SaveGameView extends View{
    
    public SaveGameView(){
            super("\n"
                +"\nS - Save game"
                +"\nQ - quit game - returns to main menu");
    
    }
    
   @Override   
    public boolean doAction(String value){
       value = value.toUpperCase(); //convert choice to upper case

        switch (value){
            
            case "S": //save the current game
                this.saveGame();
                break;
        
            default:
                System.out.println("\n*** Invalid selection *** try again");
}
        return false;
    
} 

    private void saveGame() {
        System.out.println("\nYour game will be saved.");
    }

    
}
