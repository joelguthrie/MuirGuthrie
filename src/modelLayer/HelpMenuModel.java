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
public class HelpMenuModel implements Serializable{
    
    //menu variables
    private String description;

    //the constructor for the game menu model
    public HelpMenuModel(String description) {
        this.description = description;
    }

    //geter and setter for the game menu model
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
    
}
