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
                +"\n--------------------------------------------"
                +"\n|Save Menu                                 |"
                +"\n--------------------------------------------"    
                +"\nS - Save game"
                +"\nQ - quit game - returns to main menu"
                +"\n-------------------------------------------");   
    
    }
    
   @Override   
    public boolean doAction(String value){
       value = value.toUpperCase(); //convert choice to upper case
       try {
        switch (value){
            
            case "S": //save the current game
                this.saveGame();
                break;
        
            default:
                ErrorView.display(this.getClass().getName(),
                        "\n*** Invalid selection *** try again");
}
       } catch (Exception e) {
           ErrorView.display(this.getClass().getName(),
                   "Error" + e.getMessage());
       }
        return false;
    
} 

    private void saveGame() {
        this.console.println("\nYour game will be saved.");
    }

    
}
