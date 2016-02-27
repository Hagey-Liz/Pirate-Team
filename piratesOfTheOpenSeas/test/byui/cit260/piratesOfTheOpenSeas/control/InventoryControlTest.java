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
 * @author Roderick
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
        double height = 0.0;
        double diameter = 0.0;
        double expResult = 0.0;
        double result = InventoryControl.calcBarrelVolume(height, diameter);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcFoodWanted method, of class InventoryControl.
     */
    @Test
    public void testCalcFoodWanted_3args_1() {
        System.out.println("calcFoodWanted");
        int noOfPeople = 0;
        int poundsPerDay = 0;
        int noOfDays = 0;
        int expResult = 0;
        int result = InventoryControl.calcFoodWanted(noOfPeople, poundsPerDay, noOfDays);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of displayInventoryControl method, of class InventoryControl.
     */
    @Test
    public void testDisplayInventoryControl() {
        System.out.println("displayInventoryControl");
        InventoryControl instance = new InventoryControl();
        instance.displayInventoryControl();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcFoodWanted method, of class InventoryControl.
     */
    @Test
    public void testCalcFoodWanted_3args_2() {
        System.out.println("calcFoodWanted");
        double noOfPeople = 0.0;
        double poundsPerDay = 0.0;
        double noOfDays = 0.0;
        InventoryControl instance = new InventoryControl();
        double expResult = 0.0;
        double result = instance.calcFoodWanted(noOfPeople, poundsPerDay, noOfDays);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
