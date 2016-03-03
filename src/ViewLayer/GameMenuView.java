/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.util.Scanner;

/**
 *
 * @author MIc
 */
public class GameMenuView extends View{
 
    public GameMenuView(){
        super("\n=====================================================================\n"
        + "\n L - lightsaber parts"
        + "\n F - Force training"
        + "\n M - show the Map"
        + "\n P - planets visited"
        + "\n T - Travel to a different Planet"
        + "\n C - Change Location on current planet"
        + "\n H - Help Menu"
        + "\n S - Save Game"
        + "\n B - back to Main Menu"
        +"\n=====================================================================\n");
    }
    
    @Override
    public void doAction(char selection) {
        return;
    }

}
