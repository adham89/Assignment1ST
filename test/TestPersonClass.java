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
import softwaretestingassignment1.Person;

/**
 *
 * @author ad
 */
public class TestPersonClass {
    
    public TestPersonClass() {
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
    public void testSetAge() {
        System.out.println("setAge");
        Person instance = new Person();
        instance.setPersonAge(49);
        int result = instance.getPersonAge();
        int expResult = 49;
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }
    
    @Test
    public void testGetAge(){
        System.out.println("getAGe");
        Person instance = new Person();
        instance.setPersonAge(60);
        int result = instance.getPersonAge();
        int expResult = 60;
        assertEquals(expResult, result);
    }
    
        /**
     * Test of getSalary method, of class Person.
     */
    @Test
    public void testGetSalary() {
        System.out.println("getSalary");
        Person instance = new Person();
        instance.setSalary(5000);
        int expResult = 5000;
        int result = instance.getSalary();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setSalary method, of class Person.
     */
    @Test
    public void testSetSalary() {
        System.out.println("setSalary");
     
        Person instance = new Person();
        instance.setSalary(70000);
        int result = instance.getSalary();
        int expResult = 70000;
        assertEquals(expResult, result);
       
    }
}
