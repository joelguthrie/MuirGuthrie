/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

/**
 *
 * @author Joel
 */
public class mathControl {
    
    
        public double buildLightSaber (double hilt, double blade){
        if (hilt > 2.5 || hilt < 1){
            return -1;}
        if (blade > 2.0 || blade < 0.5){
            return -1;}
        if (blade + 0.5 >= hilt){
            return -1;}
        
        return 1;
    }
}
