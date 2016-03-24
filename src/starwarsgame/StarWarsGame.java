/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starwarsgame;

import ViewLayer.startProgramView;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import modelLayer.Game;
import modelLayer.Player;

/**
 *
 * @author Joel
 */
public class StarWarsGame {

    public static Game game;
    private static Player player;
    
    private static PrintWriter outFile;
    private static BufferedReader inFile;
    
    private static PrintWriter logFile; 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        startProgramView startProgramView = new startProgramView();
        try {
            
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            String logPath = "log.txt";
            logFile = new PrintWriter(logPath);
        
            startProgramView.startProgram();
            
        } catch (Exception e){
            
            e.printStackTrace();
            startProgramView.startProgram();
            
        } finally {
          try{
              if (inFile != null){
                  inFile.close();
              }
              if (outFile != null){
                  outFile.close();
              }
              if (logFile != null){
                  logFile.close();
              }
          } catch (Exception ex) {
              System.out.println("error closing files");
          }
        }
    }

    public static Game getGame() {
        return game;
    }

    public static void setGame(Game game) {
        StarWarsGame.game = game;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        StarWarsGame.player = player;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        StarWarsGame.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        StarWarsGame.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        StarWarsGame.logFile = logFile;
    }
    
    
}
