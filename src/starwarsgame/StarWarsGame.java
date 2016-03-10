/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwarsgame;

import ViewLayer.startProgramView;
import modelLayer.Game;
import modelLayer.Player;

/**
 *
 * @author Joel
 */
public class StarWarsGame {

    public static Game getCurrentGame;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        StarWarsGame.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        StarWarsGame.player = player;
    }

    private static Game currentGame = null;
    
    private static Player player = null;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        startProgramView startProgramView = new startProgramView();
        startProgramView.startProgram();
    }
    

}
