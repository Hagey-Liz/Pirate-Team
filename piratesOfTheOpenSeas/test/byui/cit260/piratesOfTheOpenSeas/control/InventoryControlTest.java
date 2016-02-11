/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.piratesOfTheOpenSeas.control;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roland
 */
public class InventoryControlTest {
    
    public InventoryControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of calcBarrelVolume method, of class InventoryControl.
     */
    @Test
    public void testCalcBarrelVolume() {
        
        System.out.println("calcBarrelVolume");
        
        /************************
         *  Test case 1
         ***********************/
        System.out.println("tTest case #1");
        
        // input values for test case 1
        double height = 24.0;
        double diameter = 24.0;
        
        InventoryControl instance = new InventoryControl();
        
        double expResult = 6.2832; // expected value 
        
        // create instance of InvrntoryControl class
        double result = instance.calcBarrelVolume(height, diameter);
        
        assertEquals(expResult, result, 0.0001);
        
        
        /************************
         *  Test case 2
         ***********************/
        System.out.println("tTest case #2");
        
        // input values for test case 2
        height = 60.0;
        diameter = 20.0;
        
        
        expResult = -1; // expected value 
        
        // create instance of InvrntoryControl class
        result = instance.calcBarrelVolume(height, diameter);
        
        assertEquals(expResult, result, 0.0001);
        
        
        /************************
         *  Test case 3
         ***********************/
        System.out.println("tTest case #3");
        
        // input values for test case 2
        height = 30.0;
        diameter = -6.0;
        
        
        expResult = -1; // expected value 
        
        // create instance of InvrntoryControl class
        result = instance.calcBarrelVolume(height, diameter);
        
        assertEquals(expResult, result, 0.0001);
        
        /************************
         *  Test case 4
         ***********************/
        System.out.println("tTest case #4");
        
        // input values for test case 4
        height = 10.0;
        diameter = 40.0;
        
        
        expResult = -1; // expected value 
        
        // create instance of InvrntoryControl class
        result = instance.calcBarrelVolume(height, diameter);
        
        assertEquals(expResult, result, 0.0001);
        
        
        /************************
         *  Test case 5
         ***********************/
        System.out.println("tTest case #5");
        
        // input values for test case 5
        height = 12.0;
        diameter = 16.0;
        
        
        expResult = 1.3963; // expected value 
        
        // create instance of InvrntoryControl class
        result = instance.calcBarrelVolume(height, diameter);
        
        assertEquals(expResult, result, 0.0001);
        
        
        /************************
         *  Test case 6
         ***********************/
        System.out.println("tTest case #6");
        
        // input values for test case 6
        height = 48.0;
        diameter = 12.0;
        
        
        expResult = 3.1416; // expected value 
        
        // create instance of InvrntoryControl class
        result = instance.calcBarrelVolume(height, diameter);
        
        assertEquals(expResult, result, 0.0001);
        
        
        /************************
         *  Test case 7
         ***********************/
        System.out.println("tTest case #7");
        
        // input values for test case 7
        height = 20.0;
        diameter = 36.0;
        
        
        expResult = 11.781; // expected value 
        
        // create instance of InvrntoryControl class
        result = instance.calcBarrelVolume(height, diameter);
        
        assertEquals(expResult, result, 0.001);
    }
    
}
