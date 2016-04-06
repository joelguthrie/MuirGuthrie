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
                console.println("\n **** Invalid Choice. Choose another ******");
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
        console.println("enter file name:");
        try{
            String fileName = keyboard.readLine();
            ProgramControl.loadGame(fileName);
            GameMenuView gmv = new GameMenuView();
            gmv.display();
        } catch(Exception e){
            ErrorView.display(this.getClass().getName(), "error in loading save game");
        }
    }

    private void displayHelpMenu() {
        console.println("the help fuction was called.");
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
    }

    void saveGame() {
        console.println("enter file name:");
        try{
            String fileName = keyboard.readLine();
            ProgramControl.saveGame(fileName);
            console.println("your game was saved");
        } catch(Exception e){
            ErrorView.display(this.getClass().getName(), "error when saveing game");
        }
    }

    private void displayTestMenu() {
        testMenuView testMenuView = new testMenuView();
        testMenuView.display();
    }

}
