/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

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
 
    
}
