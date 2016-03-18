/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import java.util.Map;
import modelLayer.Game;
import modelLayer.InventoryItem;
import modelLayer.Player;
import modelLayer.Spaceship;
import starwarsgame.StarWarsGame;

/**
 *
 * @author Joel
 */
public class gameControl {

    public static void creatNewGame(Player player) {
        Game game = new Game();
        StarWarsGame.setGame(game);

        game.setPlayer(player);

//        ItemInvetoryModel[] inventoryList = gameControl.createInventoryList();
//        game.setInventory(inventoryList);

        Spaceship spaceship = new Spaceship();
        game.setSpaceship(spaceship);

        modelLayer.Map map = mapControl.createMap();
        game.setMap(map);

    }

    public enum Item {
        emitter,
        body,
        crystal,
        hilt;
    }

    

}
