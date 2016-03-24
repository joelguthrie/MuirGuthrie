/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ViewLayer;

import java.io.PrintWriter;
import starwarsgame.StarWarsGame;

/**
 *
 * @author MIc
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = StarWarsGame.getOutFile();
    private static final PrintWriter logFile = StarWarsGame.getLogFile();
    
    public static void display (String className, String errorMsg){
        errorFile.println("----------------------------------------" +
                          "\n ERROR: " + errorMsg + 
                          "\n--------------------------------------");
        logFile.println(className + " - " + errorMsg);
    } 
    
}
