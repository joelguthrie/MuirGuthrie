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
public class askDivisionQuestion {
    
    public void askDivisionQuestion(){
        displayDivisionProblem();
        int answer = getInput();
        doAction(answer);
    }
    
    int randomInt1 = (int) Math.random();
    int randomInt2 = (int) Math.random();
    
 //Create random number 0 - 99
double randNumber = Math.random();
double d = randNumber * 100;

//Type cast double to int
int randomInt = (int)d;
    
 //Create random number 0 - 99
double randNumber2 = Math.random();
double i = randNumber2 * 100;

//Type cast double to int
int randomInt9 = (int)i;

private final String division1 = "\n"
        +                  "\n***************************************************"
        +                  "\n What is " + randomInt + " / " + randomInt9 + " ?"
        +                  "\n***************************************************";
      
    public void displayDivisionProblem() {
        
            System.out.println(division1);
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
        if (answer == (randomInt / randomInt9))
                this.correctAnswer();

        else{
                System.out.println("\n **** Wrong Answer ******");        
        }
        }
    private void correctAnswer() {
        System.out.println("\n **** correctAnswer stubFunction here******");
    }
}
