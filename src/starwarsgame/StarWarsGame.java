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

    public static Game game;
    private static Player player;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        startProgramView startProgramView = new startProgramView();
        startProgramView.startProgram();
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        StarWarsGame.game = game;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        StarWarsGame.player = player;
    }
}
