/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MIc
 */
public class Player implements Serializable{
    
    //varables
    private Location location;
    private List<InventoryItem> inventory;
    private String name;
    
    public Player() {
        inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<InventoryItem> getInventory() {
        return inventory;
    }

    public void setInventory(List<InventoryItem> inventory) {
        this.inventory = inventory;
    }
}
