/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import controlLayer.ProgramControl;
import controlLayer.gameControl;
import java.util.Scanner;
import starwarsgame.StarWarsGame;

/**
 *
 * @author MIc
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n=====================================================================\n"
                + "\n N - New Game"
                + "\n L - Load Saved Game"
                + "\n S - Save Game"
                + "\n H - Help Menu"
                + "\n T - Test Menu"
                + "\n* Q - Quit"
                + "\n=====================================================================\n");
    }

    @Override
    public boolean doAction(char selection) {

        selection = Character.toUpperCase(selection);
        switch (selection) {
            case 'N':
                this.startNewGame();
                break;
            case 'L':
                this.startExistingGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'T':
                this.displayTestMenu();
                break;
            case 'Q':
                return true;
            default:
                System.out.println("\n **** Invalid Choice. Choose another ******");
                break;
        }

        return false;
    }

    private void startNewGame() {
        ProgramControl.createNewGame(StarWarsGame.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void startExistingGame() {
        System.out.println("the load game fuction was called.");
    }

    private void displayHelpMenu() {
        System.out.println("the help fuction was called.");
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    private void saveGame() {
        System.out.println("the save game fuction was called.");
    }

    private void displayTestMenu() {
        testMenuView testMenuView = new testMenuView();
        testMenuView.display();
    }

}
