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
public class StartProgramView {
    
    private String promptMessage;
    
    public StartProgramView(){
         
        this.promptMessage="\nPlease enter your name:";
        //display the banner when view is created
        this.displayBanner();
        
    }

    public void displayBanner() {
     System.out.println(
         "\n***************************************************************"
        +"\n*                                                             *"
        +"\n This is a game of Pirates of the Open Seas.  In this game you *"
        +"\n will choose to be either a pirate or Navy Captain.           *"
        +"\n If you choose to be a Pirate then your goal is to locate the *"
        +"\n treasure that is hidden on a island.                         *"
        +"\n If you choose to be the Navy Captain then your goal is to    *"
        +"\n capture the pirates and find the treasure for your country.  *"
        +"\n You will need to choose either a small or large ship along   *"
        +"\n a number of people  in your crew.  You will need to plan food*"
        +"\n water and weapons for your journey.  You may have to go      *"
        +"\n storms and will need to stop at ports or islands along the   *"
        +"\n way to restock supplies.  You will choose whether to fight or*"
        +"\n run when facing the enemy.                                   *"
        +"\n                                                              *"
        +"\n Good Luck and have fun in this adventure!                    *"
        +"\n***************************************************************"
     );
    }

    public void displayStartProgramView() {
        
    
         boolean done = false;//set flag to not done
        do{
            //prompt for and get players name
            String playersName = this.getPlayerName();
            if(playersName.toUpperCase().equals("Q"))//user wants to quit
                return;//exit the game
            
            //do the requested action display the next view
            done = this.doAction(playersName);
        } while (!done);
    
    }

    private String getPlayerName() {
       System.out.println("\n*** getPlayersName() called ***");
       return "Joe";
    }

    private boolean doAction(String playersName) {
       System.out.println("\n*** doAction() called ***");
       return true;
    }
    
        
       
    
        
        
    
    
}
