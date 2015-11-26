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
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import softwaretestingassignment1.BankLoan;
import softwaretestingassignment1.Person;

/**
 *
 * @author ad
 */
public class LoanTest {
    private Person personValid;
    private Person personInValid;
    private BankLoan loan;
    
    public LoanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
         loan = new BankLoan();
        personValid = mock(Person.class);
        personInValid = mock(Person.class);
        when(personInValid.isPersonOver18()).thenReturn(false);
        when(personInValid.PersonHighSalary()).thenReturn(false);
        when(personValid.isPersonOver18()).thenReturn(true);
        when(personValid.PersonHighSalary()).thenReturn(true);
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
        /**
     * Test of setPerson method, of class Loan.
     */
    @Test//(expected = IllegalArgumentException.class)
    public void testSetInvalidPerson() {
       loan.setPerson(personInValid);
       verify(personInValid).isPersonOver18();
        verify(personInValid).PersonHighSalary();
    }
    
       @Test//(expected = IllegalArgumentException.class)
    public void testSetvalidPerson() {
        loan.setPerson(personValid);
        verify(personValid).isPersonOver18();
        verify(personValid).PersonHighSalary();
    }
}
