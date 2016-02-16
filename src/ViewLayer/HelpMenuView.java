/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;

/**
 *
 * @author MIc
 */
public class HelpMenuView {
    
    private final String MENU ="\n=====================================================================\n"
        + "\n M - How to move through the galaxy"
        + "\n F - Help finding the lightsaber"
        + "\n W - What do i need?"
        + "\n H - How do i win?"
        + "\n E - Exit"
        +"\n=====================================================================\n";
    
    public void displayMenu() {
        
        char selection = ' ';
        do{
            
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        }while (selection != 'E');
        
    }

    
                

    private String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);
        
        while (!valid){
            
            System.out.println("what do you want to do:");
            
            input = keyboard.nextLine();
            input = input.trim();
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
	            case 'M':
                        System.out.println("display the move info");
	                break;
	            case 'F':
	                System.out.println("showing help Lightsaber");
	                break;
	            case 'W':
	                System.out.println("show what you need");
	                break;
	            case 'H':
	                System.out.println("Show How you win the game");
	                break;
	            case 'E':
	                return;
	            default:
	                System.out.println("\n **** Invalid Choice. Choose another ******");
	                break;
	        }
    }
}
