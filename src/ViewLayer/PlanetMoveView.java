/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import starwarsgame.StarWarsGame;

/**
 *
 * @author Daniel
 */
public class PlanetMoveView extends View {
    
    public PlanetMoveView() {
        super("\n=====================================================================\n"
                + "\n 0 - Hoth"
                + "\n 1 - Tatooine"
                + "\n 2 - Naboo"
                + "\n=====================================================================\n");
    }
    
    @Override
    public boolean doAction(char selection) {
        selection = Character.toUpperCase(selection);
        
        int planetIndex = -1;
        
        try {
            planetIndex = Integer.parseInt(selection + "");
        } catch (Exception e) {
            console.println("Please enter a number");
            return false;
        }
        
        if(planetIndex < 0 || planetIndex > StarWarsGame.getGame().getPlanets().length) {
            console.println("Please enter a valid selection");
            return false;
        }
        
        StarWarsGame.getGame().setMap(StarWarsGame.getGame().getPlanets()[planetIndex]);
        StarWarsGame.getGame().getPlayer().setLocation(StarWarsGame.getGame().getMap().getLocation(0, 0));
        
        return true;
    }
}
