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
        double hilt = 2.0;
        double blade = 1.0;
        mathControl instance = new mathControl();
        double expResult = 1.0;
        double result = instance.buildLightSaber(hilt, blade);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
