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
    public boolean doAction(char selection) {
        selection = Character.toUpperCase(selection);
        switch (selection) {
            case 'N':
                this.moveNorth();
                break;
            case 'S':
                this.moveSouth();
                break;
            case 'T':
                this.movePlanet();
            case 'E':
                this.moveEast();
                break;
            case 'W':
                this.moveWest();
                break;
            case 'M':
                this.viewMap();
                break;
            case 'Q':
                return true;
            case 'H':
                break;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
        
        return false;
    }

    private void movePlanet() {
        PlanetMoveView pmv = new PlanetMoveView();
        pmv.display();
    }
    
    private void moveNorth() {
        System.out.println("the stub  fuction was called.");
    }

    private void moveSouth() {
        System.out.println("the stub  fuction was called.");
    }

    private void moveEast() {
        System.out.println("the stub  fuction was called.");
    }

    private void moveWest() {
        System.out.println("the stub  fuction was called.");
    }

    private void viewMap() {
        System.out.println(StarWarsGame.getGame().getMap().getMapString());
    }

}
