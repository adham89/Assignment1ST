/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import softwaretestingassignment1.DifferentMethods;

/**
 *
 * @author ad
 */
public class TestDifferentMethods {
    
    public TestDifferentMethods() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
        @Test
    public void testAddition() {
        System.out.println("addition");
        int a = 100;
        int b = 100;
        DifferentMethods instance = new DifferentMethods();
        int expResult = 200;
        int result = instance.additionOfTwoNumbers(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
    
          @Test
    public void testsub() {
        System.out.println("addition");
        int a = 600;
        int b = 100;
        DifferentMethods instance = new DifferentMethods();
        int expResult = 500;
        int result = instance.substractionOfTwoNumbers(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    

}
