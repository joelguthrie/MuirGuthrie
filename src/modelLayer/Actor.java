/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelLayer;

import java.awt.Point;
import java.io.Serializable;

/**
 *
 * @author Joel
 */
public enum Actor implements Serializable {
 
    ObiWan("Fierce Jedi that has deep peircing blue eyes!"),
    Padme("Why am i wandering through the forest again?"),
    Sebulba("The handsomest devil of them all."),
    Link("I need to find that Master Sword, wait....... who are you?"),
    TheGhostOfQuiGon("How can you see me? I'm a Ghost.......ohwwwwa!!!!");
    
    private String description;
    private Point coordinates;
    
    
    public String getDescription() {
        return description;
    }

    public Point getCoordinates() {
        return coordinates;
    }

    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    


}
