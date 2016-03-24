/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import controlLayer.gameControl;
import java.util.Scanner;
import starwarsgame.StarWarsGame;

/**
 *
 * @author MIc
 */
public class MovePlanetView extends View {

    public MovePlanetView() {
        super("\n=====================================================================\n"
                + "\n H - Hoth"
                + "\n M - Mustafar"
                + "\n A - Alderan"
                + "\n D - Death Star"
                + "\n D - Death Star"
                + "\n S - Star Killer"
                + "\n* E - exit ship"
                + "\n=====================================================================\n");
    }

    public boolean doAction(char selection) {

        selection = Character.toUpperCase(selection);
        switch (selection) {
            case 'H':
                this.ToHoth();
                break;
            case 'M':
                this.ToMustafar();
                break;
            case 'A':
                this.ToAleran();
                break;
            case 'D':
                this.ToDeathStar();
                break;
            case 'S':
                this.ToStarKiller();
            case 'E':
                return true;
            default:
                console.println("\n **** Invalid Choice. Choose another ******");
                break;
        }
        
        return true;
    }

    private void ToHoth() {
        console.println("\nYou are now getting ready to go to Hoth");
    }

    private void ToMustafar() {
        console.println("\nYOu are now getting ready to go to Mustafar");
    }

    private void ToAleran() {
        console.println("\nYou are now getting ready to go to Aleran");
    }

    private void ToDeathStar() {
        console.println("\nYou are now getting ready to go to the Death Star");
    }

    private void ToStarKiller() {
        console.println("\nYou are now getting ready to go to Star Killer Planet");
    }

}
