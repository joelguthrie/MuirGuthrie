/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import controlLayer.gameControl;
import java.util.Scanner;
import starwarsgame.StarWarsGame;

/**
 *
 * @author MIc
 */
public class MainMenuView {

    private final String MENU ="\n=====================================================================\n"
        + "\n N - New Game"
        + "\n L - Load Saved Game"
        + "\n S - Save Game"
        + "\n H - Help Menu"
        + "\n* Q - Quit"
        +"\n=====================================================================\n";
    
    public void displayMenu() {
        
        char selection = ' ';
        do{
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        }while (selection != 'Q');
        
    }

    
                

    private String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while (!valid){
            
            System.out.println("what do you want to do:");
            
            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            if (input.length() >= 2){
                
                System.out.println("that is not an option");
                continue;
                
            }
            
            break;
            
        }
        
        return input;
    }

    private void doAction(char selection) {
        
        selection = Character.toUpperCase(selection);
	        switch (selection){
	            case 'N':
	                this.startNewGame();
	                break;
	            case 'L':
	                this.startExistingGame();
	                break;
	            case 'H':
	                this.displayHelpMenu();
	                break;
	            case 'S':
	                this.saveGame();
	                break;
	            case 'Q':
	                return;
	            default:
	                System.out.println("\n **** Invalid Choice. Choose another ******");
	                break;
	        }
    }

    private void startNewGame() {
        System.out.println("the new game fuction was called.");
        
        gameControl.creatNewGame(StarWarsGame.getPlayer());
        
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
        
    }

    private void startExistingGame() {
        System.out.println("the load game fuction was called.");
    }

    private void displayHelpMenu() {
        System.out.println("the help fuction was called.");
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.displayMenu();
    }

    private void saveGame() {
        System.out.println("the save game fuction was called.");
    }

    
}
