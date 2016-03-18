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
public class Map implements Serializable {

    public String planet;

    public static int rowCount = 10;
    public static int columnCount = 10;
    
    public Location[][] loc;

    public Map(int rc, int cc) {
        rowCount = rc;
        columnCount = cc;
        loc = new Location[rowCount][columnCount];
        init();
    }

    public Map() {
        rowCount = 10;
        columnCount = 10;
        loc = new Location[rowCount][rowCount];
        init();
    }

    public void init() {
        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                Location location = new Location();
                location.setType(LocationType.values()[(int) (Math.random() * LocationType.values().length)]);
                location.setRow(row);
                location.setColumn(col);
                loc[row][col] = location;
            }
        }
    }

    public String getMapString() {

        String rtn = "";

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                rtn += loc[row][col].getType().name().charAt(0);
                rtn += loc[row][col].getItem() == null ? "" : loc[row][col].getItem().getType().name().charAt(0);
                rtn += "\t";
            }
            rtn += "\n";
        }
        return rtn;
    }

    public Location getLocation(int row, int col) {
        return loc[row][col];
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

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

}
