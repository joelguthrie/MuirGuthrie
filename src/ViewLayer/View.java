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
public abstract class View implements ViewInterface {

    protected String displayMessage;

    public View() {

    }

    public View(String message) {
        this.displayMessage = message;
    }

    public void display() {

        char selection = ' ';
        boolean stop;
        do {

            System.out.println(this.displayMessage);

            String input = this.getInput();
            selection = input.charAt(0);

            stop = this.doAction(selection);

        } while (!stop);

    }

    @Override
    public String getInput() {
        boolean valid = false;
        String input = null;
        Scanner keyboard = new Scanner(System.in);

        while (!valid) {

            System.out.println("what do you want to do:");

            input = keyboard.nextLine();
            input = input.trim();
            input = input.toUpperCase();
            if (input.length() >= 2) {

                System.out.println("that is not an option");
                continue;

            }

            break;

        }

        return input;
    }

}
