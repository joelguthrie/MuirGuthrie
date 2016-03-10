/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;

import java.io.Serializable;
import javax.tools.DocumentationTool.Location;

/**
 *
 * @author Joel
 */
public class Map implements Serializable {
    
    public String planet;
    
    public double rowCount;
    
    public double columnCount;
    private Location[][] locations;
    
    // constructor function for three above variables
    public Map(String planet, double rowCount, double columnCount) {
        this.planet = planet;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
    }
    // getter and setter functions for the three variables

    public Map(int rowCount, int columnCount) {
       if (rowCount < 1 || columnCount < 1){
           System.out.println("The number of rows and columns must be > zero");
                   return;}

       this.rowCount = rowCount;
       this.columnCount = columnCount;
       
       this.locations = new Location[rowCount][columnCount];

       for (int row = 0; row < rowCount; row++){
           for(int col = 0; col < columnCount; col++){
               Location location = new Location();
               location.setColumn(col);
               location.setRow(row);
               location.setVisited(false);
               
               locations[row][col] = location;
           }
       }
    }
    
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
