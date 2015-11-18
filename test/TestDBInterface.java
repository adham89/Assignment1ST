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
import org.mockito.Mockito;
import static org.mockito.Mockito.when;
import softwaretestingassignment1.DBInterface;
import softwaretestingassignment1.InterfaceHandler;

/**
 *
 * @author ad
 */
public class TestDBInterface {
    
    DBInterface intF;
    InterfaceHandler instance;
    
    public TestDBInterface() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    
        intF=Mockito.mock(DBInterface.class);
        when(intF.connect("jdbc:mysql://localhost/dictionary", "root", "root")).thenReturn(true);
        
        instance = new InterfaceHandler();
        instance.setIntF(intF);
        
//        comp=Mockito.mock(Company.class);
//        when(comp.addCompany("", "")).thenReturn(true);
        
    
    }
    
    @After
    public void tearDown() {
    }

    
     @Test
    public void testConnect() {
        System.out.println("connect");
        String address = "jdbc:mysql://localhost/dictionary";
        String userName = "root";
        String password = "root";
        boolean expResult = true;
        boolean result = instance.connect(address, userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
        @Test
    public void testDisconnect() {
        System.out.println("disconnect");
        instance.disconnect();
        boolean expResult = false;
        boolean result = instance.disconnect();
        assertEquals(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
