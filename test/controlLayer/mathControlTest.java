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
    
}
