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
public class GameMenuView {
 
    private final String MENU ="\n=====================================================================\n"
        + "\n L - lightsaber parts"
        + "\n F - Force training"
        + "\n M - show the Map"
        + "\n P - planets visited"
        + "\n T - Travel to a different Planet"
        + "\n C - Change Location on current planet"
        + "\n H - Help Menu"
        + "\n S - Save Game"
        + "\n B - back to Main Menu"
        +"\n=====================================================================\n";

    public void displayMenu() {
        boolean done = false;
        do {
            System.out.println(MENU);
            String menuOption = this.getMenuOption();
            if(menuOption.toUpperCase().equals("B"))
                return;
            
            done = this.doAction(menuOption);
            
        } while (!done);
    }

    private String getMenuOption() {
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

    private boolean doAction(String menuOption) {
        return true;
    }

}
