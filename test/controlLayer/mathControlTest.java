/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlLayer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joel
 */
public class mathControlTest {
    
    public mathControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of buildLightSaber method, of class mathControl.
     */
    @Test
    public void testBuildLightSaber() {
        System.out.println("buildLightSaber");
        System.out.println("\ttestCase1");
        double hilt = 2.0;
        double blade = 1.0;
        mathControl instance = new mathControl();
        double expResult = 1.0;
        double result = instance.buildLightSaber(hilt, blade);
        assertEquals(expResult, result, 0.0);
       
        
        System.out.println("\ttestCase2");
        hilt = 1.0;
        blade = 1.5;
        expResult = -1.0;
        result = instance.buildLightSaber(hilt, blade);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase3");
        hilt = 3.0;
        blade = 2.5;
        expResult = -1.0;
        result = instance.buildLightSaber(hilt, blade);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase4");
        hilt = 1.5;
        blade = 1.75;
        expResult = -1.0;
        result = instance.buildLightSaber(hilt, blade);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase5");
        hilt = 1.0;
        blade = 0.5;
        expResult = 1.0;
        result = instance.buildLightSaber(hilt, blade);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase6");
        hilt = 2.5;
        blade = 2.0;
        expResult = 1.0;
        result = instance.buildLightSaber(hilt, blade);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of askDivisionQuestion method, of class mathControl.
     */
    @Test
    public void testAskDivisionQuestion() {
        System.out.println("askDivisionQuestion");
        System.out.println("\ttestCase1");
        double input1 = 25.0;
        double input2 = 5.0;
        double answer = 5.0;
        mathControl instance = new mathControl();
        double expResult = 1.0;
        double result = instance.askDivisionQuestion(input1, input2, answer);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase2");
        input1 = 87.0;
        input2 = 2.0;
        answer = 5.0;
        expResult = 0.0;
        result = instance.askDivisionQuestion(input1, input2, answer);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase3");
        input1 = 6.0;
        input2 = 6.0;
        answer = 2.0;
        expResult = 0.0;
        result = instance.askDivisionQuestion(input1, input2, answer);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase4");
        input1 = 7.0;
        input2 = 8.0;
        answer = 5.0;
        expResult = 0.0;
        result = instance.askDivisionQuestion(input1, input2, answer);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase5");
        input1 = 5.0;
        input2 = 5.0;
        answer = 1.0;
        expResult = 1.0;
        result = instance.askDivisionQuestion(input1, input2, answer);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase6");
        input1 = 100.0;
        input2 = 1.0;
        answer = 100.0;
        expResult = 1.0;
        result = instance.askDivisionQuestion(input1, input2, answer);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of bossFight method, of class mathControl.
     */
    @Test
    public void testBossFight() {
        System.out.println("boss fight testing");
        System.out.println("\ttestCase1");
        double input1 = 12;
        double input2 = 6;
        double input3 = 72;
        mathControl instance = new mathControl();
        double expResult = 1;
        double result = instance.bossFight(input1, input2, input3);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase2");
        input1 = 8;
        input2 = 9;
        input3 = 72;
        
        expResult = 1;
        result = instance.bossFight(input1, input2, input3);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase3");
        input1 = 1;
        input2 = 12;
        input3 = 72;
        
        expResult = 0;
        result = instance.bossFight(input1, input2, input3);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase4");
        input1 = 8;
        input2 = 1;
        input3 = 72;
        
        expResult = 0;
        result = instance.bossFight(input1, input2, input3);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase5");
        input1 = 100;
        input2 = 0;
        input3 = 72;
        
        expResult = -1;
        result = instance.bossFight(input1, input2, input3);
        assertEquals(expResult, result, 0.0);
        
        System.out.println("\ttestCase6");
        input1 = 0;
        input2 = 100;
        input3 = 72;
        
        expResult = -1;
        result = instance.bossFight(input1, input2, input3);
        assertEquals(expResult, result, 0.0);       
    }//end of boss finght testing
    
}
