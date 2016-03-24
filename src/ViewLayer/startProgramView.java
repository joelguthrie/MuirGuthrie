/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import controlLayer.ProgramControl;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.Scanner;
import modelLayer.Player;
import starwarsgame.StarWarsGame;

/**
 *
 * @author MIc
 */
public class startProgramView {
    
    protected PrintWriter console = StarWarsGame.getOutFile();
    protected BufferedReader keyboard = StarWarsGame.getInFile();
    
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
        console.println(
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
        
        while (!valid){
            
            console.println("Enter your name:");
            
            try {
            playerName = keyboard.readLine();
            } catch (Exception e){
                ErrorView.display(this.getClass().getName(), "error reading input");
                
            }
            playerName = playerName.trim();
            if (playerName.length() < 2){
                
                console.println("name length must be longer then 2 characters, try again.");
                continue;
                
            }
            
            break;
            
        }
        
        return playerName;
    }

    private void displayWelcomeMessage(Player player) {
        
        console.println("=====================================================================\n");
        console.println("              wellcome to the realm of Darth Jar Jar\n");
        console.println("              " + player.getName() + " has been called to defend\n");
        console.println("              the universe from this theret from this\n");
        console.println("              and now you will have to find teachers \n");
        console.println("              to train in the ways of the force.     \n");
        console.println("=====================================================================\n");
    }
    
    
}


