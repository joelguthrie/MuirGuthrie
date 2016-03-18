/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;

import java.io.Serializable;

/**
 *
 * @author Joel
 */
public class Location implements Serializable{
    
    private double row;
    private double column;
    private boolean visited;
    private LocationType type;
    private InventoryItem item;

    // constructor functions for the three variables

    public Location(double row, double column, double visited) {
        this.row = row;
        this.column = column;
    }

    public Location() {
        
    }
    
    // getter and setter functions

    public double getRow() {
        return row;
    }

    public void setRow(double row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(double column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    } 

    public LocationType getType() {
        return type;
    }

    public void setType(LocationType type) {
        this.type = type;
    }

    public InventoryItem getItem() {
        return item;
    }

    public void setItem(InventoryItem item) {
        this.item = item;
    }
    
    
}
