/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;

/**
 *
 * @author Joel
 */
public class testMenuView {
     private final String MENU ="\n=====================================================================\n"
        + "\n A - askDivisionQuestion"
        + "\n B - temp2"
        + "\n C - temp3"
        + "\n D - temp4"
        + "\n* Q - Quit"
        +"\n=====================================================================\n";
    
    public void displayTestMenu() {
        
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
	            case 'A':
	                this.askDivisionQuestion();
	                break;
	            case 'B':
	                this.stubFunction2();
	                break;
	            case 'C':
	                this.stubFunction3();
	                break;
	            case 'D':
	                this.stubFunction4();
	                break;
	            case 'Q':
	                return;
	            default:
	                System.out.println("\n **** Invalid Choice. Choose another ******");
	                break;
	        }
    }

    private void stubFunction2() {
    System.out.println("stubFunction2 was called");
    }

    private void stubFunction3() {
  System.out.println("stubFunction3 was called");
    }

    private void stubFunction4() {
    System.out.println("stubFunction4 was called");
    }

    private void askDivisionQuestion() {
          askDivisionQuestion askDivisionQuestion = new askDivisionQuestion();
           askDivisionQuestion. askDivisionQuestion();
    }

}
