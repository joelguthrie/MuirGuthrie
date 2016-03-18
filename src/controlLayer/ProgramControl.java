/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import java.util.Random;
import modelLayer.Game;
import modelLayer.InventoryItem;
import modelLayer.ItemType;
import modelLayer.Location;
import modelLayer.Map;
import modelLayer.Player;
import starwarsgame.StarWarsGame;

/**
 *
 * @author MIc
 */
public class ProgramControl {

    public static Player createPlayer(String name) {

        if (name == null) {
            return null;
        }
        Player player = new Player();
        player.setName(name);

        StarWarsGame.setPlayer(player);
        return player;

    }

    public static void createNewGame(Player player) {
        Game g = new Game();
        g.setPlayer(player);

        Map hoth = new Map();
        g.setMap(hoth);

        Map tatooine = new Map();
        
        Map naboo = new Map();
        
        Map[] planets = new Map[3];
        
        planets[0] = hoth;
        planets[1] = tatooine;
        planets[2] = naboo;
        
        g.setPlanets(planets);
        
        createAndPlaceItems(planets);
        
        player.setLocation(hoth.getLocation(0, 0));

        StarWarsGame.setGame(g);
    }
    
    private static void createAndPlaceItems(Map[] planets) {
        
        InventoryItem hilt = new InventoryItem();
        hilt.setType(ItemType.Hilt);
        placeItem(planets[0], hilt);
        
        InventoryItem emitter = new InventoryItem();
        emitter.setType(ItemType.Emitter);
        placeItem(planets[1], emitter);
        
        InventoryItem crystal = new InventoryItem();
        crystal.setType(ItemType.Crystal);
        placeItem(planets[2], crystal);
        
    }
    
    private static void placeItem(Map map, InventoryItem item) {
        boolean placed = false;
        Random random = new Random();
        
        while(!placed) {
            Location loc = map.getLocation(random.nextInt(Map.rowCount) , random.nextInt(Map.columnCount));
            if(loc.getItem() == null) {
                loc.setItem(item);
                placed = true;
            }
        }
    }
    
    private static InventoryItem[] createInventoryList() {

        InventoryItem[] inventory = new InventoryItem[3];

        InventoryItem emitter = new InventoryItem();
        emitter.setDescription("emittter");
        emitter.setQuantityInStock(0);
        emitter.setRequiredAmount(1);
        inventory[ItemType.Emitter.ordinal()] = emitter;

        InventoryItem body = new InventoryItem();
        body.setDescription("body");
        body.setQuantityInStock(0);
        body.setRequiredAmount(1);
        inventory[gameControl.Item.body.ordinal()] = body;

        InventoryItem crystal = new InventoryItem();
        crystal.setDescription("crystal");
        crystal.setQuantityInStock(0);
        crystal.setRequiredAmount(1);
        inventory[gameControl.Item.crystal.ordinal()] = crystal;

        InventoryItem hilt = new InventoryItem();
        hilt.setDescription("hilt");
        hilt.setQuantityInStock(0);
        hilt.setRequiredAmount(1);
        inventory[gameControl.Item.hilt.ordinal()] = hilt;

        return inventory;
    }
}
    
