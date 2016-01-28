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
public class ManiMenuModel implements Serializable{
    
    //varables
    private String loadData;
    private String NewData;

    public ManiMenuModel(String loadData, String NewData) {
        this.loadData = loadData;
        this.NewData = NewData;
    }

    public String getLoadData() {
        return loadData;
    }

    public void setLoadData(String loadData) {
        this.loadData = loadData;
    }

    public String getNewData() {
        return NewData;
    }

    public void setNewData(String NewData) {
        this.NewData = NewData;
    }
    
    
    
}
