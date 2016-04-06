/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import controlLayer.ProgramControl;
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
                + "\n G - Save Game"
                + "\n Q - Quit"
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
            case 'G':
                this.save();
                break;
            case 'Q':
                return true;
            case 'H':
                break;
            default:
                console.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
        
        return false;
    }

    private void movePlanet() {
        PlanetMoveView pmv = new PlanetMoveView();
        pmv.display();
    }
    
    private void moveNorth() {
        console.println("the stub  fuction was called.");
    }

    private void moveSouth() {
        console.println("the stub  fuction was called.");
    }

    private void moveEast() {
        console.println("the stub  fuction was called.");
    }

    private void moveWest() {
        console.println("the stub  fuction was called.");
    }

    private void viewMap() {
        console.println(StarWarsGame.getGame().getMap().getMapString());
    }

    private void save() {
        console.println("enter file name:");
        try{
            String fileName = keyboard.readLine();
            ProgramControl.saveGame(fileName);
            console.println("your game was saved");
        } catch(Exception e){
            ErrorView.display(this.getClass().getName(), "error when saveing game");
        }
    }

}
