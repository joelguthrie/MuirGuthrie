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
        if (blade + 0.5 > hilt){
            return -1;}
        
        return 1.0;
    }
         public double askDivisionQuestion(double input1, double input2, double answer){
        if (input1 < 1 || input1 > 100){
            return -1.0;}
        if (input2 < 1 || input2 > 100){
            return -1.0;}
        if (input1 / input2 == answer){
            return 1.0;}
        
        return 0.0; }
         
        public double bossFight (double input1, double input2, double input3) {
        if (input1 < 1 || input1 > 100){
		return -1;
        }
	if (input2 < 1 || input2 > 100){
		return -1;
        }
	if (input1 * input2 == input3){
		return 1;
        }
		return 0;
        }
}
        
