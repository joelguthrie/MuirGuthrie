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
public class askMultiQuestion {

    public void askQuestion(){
        displayDivisionProblem();
        int answer = getInput();
        doAction(answer);
    }
    
    int Int1 = (int) Math.random();
    int Int2 = (int) Math.random();
    

double rando = Math.random();
double d = rando * 100;

int Int = (int)d;
    
double rando2 = Math.random();
double i = rando2 * 100;

int Int3 = (int)i;

private final String display = "\n"
        +                  "\n***************************************************"
        +                  "\n What is " + Int + " * " + Int3 + " ?"
        +                  "\n***************************************************";
      
    public void displayDivisionProblem() {
        
            System.out.println(display);
            char selection = ' ';
            int input = this.getInput();

            
            this.doAction(input);
        
        
        }
    
        private Integer getInput() {
           
                System.out.println("What is the answer?");
                
                Scanner scan = new Scanner(System.in); 
                int answer = scan.nextInt(); 
                
            return answer;
    
    }
        private void doAction(int answer) {
        if (answer == (Int * Int3))
                this.correctAnswer();

        else{
                System.out.println("\n **** Wrong Answer ******");        
        }
        }
    private void correctAnswer() {
        System.out.println("\n **** correctAnswer stubFunction here******");
        return;
    }
    
}
