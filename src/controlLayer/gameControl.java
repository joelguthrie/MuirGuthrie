/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import java.util.Map;
import modelLayer.Game;
import modelLayer.ItemInvetoryModel;
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
       StarWarsGame.setCurrentGame(game);
       
       game.setPlayer(player);
       
       ItemInvetoryModel[] inventoryList = gameControl.createInventoryList();
       game.setInventory(inventoryList);
       
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
       
    private static ItemInvetoryModel[] createInventoryList() {
        
 
                ItemInvetoryModel[] inventory = new ItemInvetoryModel[3];
                
                ItemInvetoryModel emitter = new ItemInvetoryModel();
                emitter.setDescription("emittter");
                emitter.setQuantityInStock(0);
                emitter.setRequiredAmount(1);
                inventory[Item.emitter.ordinal()] = emitter;
                
                ItemInvetoryModel body = new ItemInvetoryModel();
                body.setDescription("body");
                body.setQuantityInStock(0);
                body.setRequiredAmount(1);
                inventory[Item.body.ordinal()] = body;
                
                ItemInvetoryModel crystal = new ItemInvetoryModel();
                crystal.setDescription("crystal");
                crystal.setQuantityInStock(0);
                crystal.setRequiredAmount(1);
                inventory[Item.crystal.ordinal()] = crystal;
                
                ItemInvetoryModel hilt = new ItemInvetoryModel();
                hilt.setDescription("hilt");
                hilt.setQuantityInStock(0);
                hilt.setRequiredAmount(1);
                inventory[Item.hilt.ordinal()] = hilt;
                
                return inventory;
    }
    
}
