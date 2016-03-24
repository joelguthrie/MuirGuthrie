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
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n=====================================================================\n"
                + "\n M - How to move through the galaxy"
                + "\n F - Help finding the lightsaber"
                + "\n W - What do i need?"
                + "\n H - How do i win?"
                + "\n E - Exit"
                + "\n=====================================================================\n");
    }

    @Override
    public boolean doAction(char selection) {

        selection = Character.toUpperCase(selection);
        switch (selection) {
            case 'M':
                console.println("display the move info");
                break;
            case 'F':
                console.println("showing help Lightsaber");
                break;
            case 'W':
                console.println("show what you need");
                break;
            case 'H':
                console.println("Show How you win the game");
                break;
            case 'E':
                return true;
            default:
                console.println("\n **** Invalid Choice. Choose another ******");
                break;
        }

        return false;
    }
}
