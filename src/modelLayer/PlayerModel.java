/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;

import java.io.Serializable;

/**
 *
 * @author MIc
 */
public class PlayerModel implements Serializable{
    
    //varables
    private double coordinates;
    private String inventory;

    public PlayerModel(double coordinates, String inventory) {
        this.coordinates = coordinates;
        this.inventory = inventory;
    }

    public double getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double coordinates) {
        this.coordinates = coordinates;
    }

    public String getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory = inventory;
    }
    
    
    
}
