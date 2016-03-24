/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import starwarsgame.StarWarsGame;

/**
 *
 * @author MIc
 */
public class askMultiQuestion {
    
    protected PrintWriter console = StarWarsGame.getOutFile();
    protected BufferedReader keyboard = StarWarsGame.getInFile();

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
        
            console.println(display);
            char selection = ' ';
            int input = this.getInput();

            
            this.doAction(input);
        
        
        }
    
        private Integer getInput() {
           
                console.println("What is the answer?");
                
                Scanner scan = new Scanner(System.in); 
                int answer = scan.nextInt(); 
                
            return answer;
    
    }
        private void doAction(int answer) {
        if (answer == (Int * Int3))
                this.correctAnswer();

        else{
                console.println("\n **** Wrong Answer ******");        
        }
        }
    private void correctAnswer() {
        console.println("\n **** correctAnswer stubFunction here******");
        return;
    }
    
}
