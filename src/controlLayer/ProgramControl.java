/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import modelLayer.Game;
import modelLayer.Map;
import modelLayer.Player;
import starwarsgame.StarWarsGame;

/**
 *
 * @author MIc
 */
public class ProgramControl {

    public static Player createPlayer(String name) {
            
            if (name == null){
                return null;
            }
            Player player = new Player();
            player.setName(name);
            
            StarWarsGame.setPlayer(player);
            return player;
            
    }
 
    public static void createNewGame(Player player){
        Game g = new Game();
        g.setPlayer(player);
        
        Map gameMap = new Map();
        g.setMap(gameMap);
        
        player.setLocation(gameMap.getLocation(0, 0));
        
        StarWarsGame.setGame(g);
    }
 
