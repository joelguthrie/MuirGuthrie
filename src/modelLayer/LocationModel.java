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
public class LocationModel implements Serializable{
    
    public double row;
    
    public double column;
    
    public double visited;

    // constructor functions for the three variables

    public LocationModel(double row, double column, double visited) {
        this.row = row;
        this.column = column;
        this.visited = visited;
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

    public double getVisited() {
        return visited;
    }

    public void setVisited(double visited) {
        this.visited = visited;
    }
    
    
    
    
}
