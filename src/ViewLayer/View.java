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
public abstract class View implements ViewInterface {

    protected String displayMessage;
    
    protected PrintWriter console = StarWarsGame.getOutFile();
    protected BufferedReader keyboard = StarWarsGame.getInFile();

    public View() {

    }

    public View(String message) {
        this.displayMessage = message;
    }

    public void display() {

        char selection = ' ';
        boolean stop;
        do {

            console.println(this.displayMessage);

            String input = this.getInput();
            selection = input.charAt(0);

            stop = this.doAction(selection);

        } while (!stop);

    }

    @Override
    public String getInput(){
        boolean valid = false;
        String input = null;

        while (!valid) {

            console.println("what do you want to do:");
            try {
                input = keyboard.readLine();
            } catch (Exception e){
                throw new RuntimeException("error reading input");
            }
            input = input.trim();
            input = input.toUpperCase();
            if (input.length() >= 2) {

                console.println("that is not an option");
                continue;

            }

            break;

        }

        return input;
    }

}
