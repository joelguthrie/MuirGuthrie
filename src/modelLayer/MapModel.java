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
public class MapModel implements Serializable {
    
    public String planet;
    
    public double rowCount;
    
    public double columnCount;
    
    // constructor function for three above variables
    public MapModel(String planet, double rowCount, double columnCount) {
        this.planet = planet;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }
    // getter and setter functions for the three variables
    
    public String getPlanet() {
        return planet;
    }

    public void setPlanet(String planet) {
        this.planet = planet;
    }

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(double rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(double columnCount) {
        this.columnCount = columnCount;
    }
    
    
    
}
