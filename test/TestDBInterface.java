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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
