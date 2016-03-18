/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;
import starwarsgame.StarWarsGame;

/**
 *
 * @author MIc
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n=====================================================================\n"
                + "\n N - North"
                + "\n S - South"
                + "\n E - East"
                + "\n W - West"
                + "\n T - Travel to a different Planet"
                + "\n M - Map"
                + "\n H - Help Menu"
                + "\n S - Save Game"
                + "\n E - Exit"
                + "\n=====================================================================\n");
    }

    @Override
    public void doAction(char selection) {
        selection = Character.toUpperCase(selection);
        switch (selection) {
            case 'N':
                this.MoveNorth();
                break;
            case 'S':
                this.MoveSouth();
                break;
            case 'E':
                this.MoveEast();
                break;
            case 'W':
                this.MoveWest();
                break;
            case 'M':
                this.viewMap();
                break;
            case 'Q':
                break;
            case 'H':
                break;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
    }

    private void MoveNorth() {
        System.out.println("the stub  fuction was called.");
    }

    private void MoveSouth() {
        System.out.println("the stub  fuction was called.");
    }

    private void MoveEast() {
        System.out.println("the stub  fuction was called.");
    }

    private void MoveWest() {
        System.out.println("the stub  fuction was called.");
    }

    private void viewMap() {
        System.out.println(StarWarsGame.getGame().getMap().getMapString());
    }

}
