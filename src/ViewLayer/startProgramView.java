/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import controlLayer.ProgramControl;
import java.util.Scanner;
import modelLayer.Player;
import starwarsgame.StarWarsGame;

/**
 *
 * @author MIc
 */
public class startProgramView {
    
    public void startProgram(){
        
        //display the banner screen
        this.displayBanner();
        
        //get the players name
        String playersName = this.getplayerName();
        
        //make a new player
        Player player = ProgramControl.createPlayer(playersName);
        StarWarsGame.setPlayer(player);
        
        //display the welcome message
        this.displayWelcomeMessage(player);
        
        //show the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
    }

    private void displayBanner() {
        System.out.println(
        "=====================================================================\n"
        +"                   8888888888  888    88888\n"
        +"                  88     88   88 88   88  88\n"
        +"                   8888  88  88   88  88888\n"
        +"                      88 88 888888888 88   88\n"
        +"               88888888  88 88     88 88    88888\n"
        +"               88  88  88   888    88888    888888\n"
        +"               88  88  88  88 88   88  88  88\n"
        +"               88 8888 88 88   88  88888    8888\n"
        +"                888  888 888888888 88   88     88\n"
        +"                 88  88  88     88 88    8888888\n"
        +"=====================================================================\n"
	+"                    The Age of Darth Jar-Jar.\n" 
        );
        

                                          
    }

    private String getplayerName() {
        
        boolean valid = false;
        String playerName = null;
        Scanner keyboard = new Scanner(System.in);
        
        while (!valid){
            
            System.out.println("Enter your name:");
            
            playerName = keyboard.nextLine();
            playerName = playerName.trim();
            if (playerName.length() < 2){
                
                System.out.println("name length must be longer then 2 characters, try again.");
                continue;
                
            }
            
            break;
            
        }
        
        return playerName;
    }

    private void displayWelcomeMessage(Player player) {
        
        System.out.println("=====================================================================\n");
        System.out.println("              wellcome to the realm of Darth Jar Jar\n");
        System.out.println("              " + player.getName() + " has been called to defend\n");
        System.out.println("              the universe from this theret from this\n");
        System.out.println("              and now you will have to find teachers \n");
        System.out.println("              to train in the ways of the force.     \n");
        System.out.println("=====================================================================\n");
    }
    
    
}


