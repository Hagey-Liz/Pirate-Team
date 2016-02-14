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
public class SailControlTest {
    
    public SailControlTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of boardShip method, of class SailControl.
     */
    @Test
    public void testBoardShip() {
        System.out.println("boardShip");
        
        /***************************
         * Test case 1
         **************************/
        System.out.println("tTest case #1");
         
        // Input values for test case 1
        String ship = "small";
        double numPeople = 5.0;
        
        SailControl instance = new SailControl();
        
        double expResult = 6.0;
        
        double result = instance.boardShip(ship, numPeople);
        
        assertEquals(expResult, result, 0.1);
        
        
        /***************************
         * Test case 2
         **************************/
        System.out.println("tTest case #2");
         
        // Input values for test case 2
        ship = "large";
        numPeople = 14.0;
        
        
       expResult = 15.0;
        
        result = instance.boardShip(ship, numPeople);
        
        assertEquals(expResult, result, 0.1);
        
        
        /***************************
         * Test case 3
         **************************/
        System.out.println("tTest case #3");
         
        // Input values for test case 3
        ship = "small";
        numPeople = 10.0;
        
        
       expResult = -1.0;
        
        result = instance.boardShip(ship, numPeople);
        
        assertEquals(expResult, result, 0.1);
      
        
        /***************************
         * Test case 4
         **************************/
        System.out.println("tTest case #4");
         
        // Input values for test case 4
        ship = "small";
        numPeople = 15.0;
        
        
       expResult = -1.0;
        
        result = instance.boardShip(ship, numPeople);
        
        assertEquals(expResult, result, 0.1);
        
        
        /***************************
         * Test case 5
         **************************/
        System.out.println("tTest case #5");
         
        // Input values for test case 5
        ship = "large";
        numPeople = 21.0;
        
        
       expResult = -1.0;
        
        result = instance.boardShip(ship, numPeople);
        
        assertEquals(expResult, result, 0.1);
        
        
        /***************************
         * Test case 6
         **************************/
        System.out.println("tTest case #6");
         
        // Input values for test case 6
        ship = "small";
        numPeople = 9.0;
        
        
       expResult = 10.0;
        
        result = instance.boardShip(ship, numPeople);
        
        assertEquals(expResult, result, 0.1);
        
        
        /***************************
         * Test case 7
         **************************/
        System.out.println("tTest case #7");
         
        // Input values for test case 7
        ship = "large";
        numPeople = 19.0;
        
        
       expResult = 20.0;
        
        result = instance.boardShip(ship, numPeople);
        
        assertEquals(expResult, result, 0.1);
    }
    
}
