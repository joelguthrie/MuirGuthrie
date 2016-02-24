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
public class MovePlanetView {
    
    private final String MENU ="\n=====================================================================\n"
        + "\n H - Hoth"
        + "\n M - Mustafar"
        + "\n A - Alderan"
        + "\n D - Death Star"
        + "\n D - Death Star"
        + "\n S - Star Killer"
        + "\n* E - exit ship"	
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
            
            System.out.println("What planet do you wnat to travl to: ");
            
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
	            case 'H':
	                this.ToHoth();
	                break;
	            case 'M':
	                this.ToMustafar();
	                break;
	            case 'A':
	                this.ToAleran();
	                break;
	            case 'D':
	                this.ToDeathStar();
	                break;
	            case 'S':
                        this.ToStarKiller();
                    case 'E':
	                return;
	            default:
	                System.out.println("\n **** Invalid Choice. Choose another ******");
	                break;
	        }
    }

    private void ToHoth() {
        System.out.println("\nYou are now getting ready to go to Hoth");
    }

    private void ToMustafar() {
        System.out.println("\nYOu are now getting ready to go to Mustafar");
    }

    private void ToAleran() {
        System.out.println("\nYou are now getting ready to go to Aleran");
    }

    private void ToDeathStar() {
        System.out.println("\nYou are now getting ready to go to the Death Star");
    }

    private void ToStarKiller() {
        System.out.println("\nYou are now getting ready to go to Star Killer Planet");
    }

    
    
}
