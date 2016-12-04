/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author amrit_parajuli
 */
public class SaxonSystemTest {
    
    public SaxonSystemTest() {
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

    /**
     * Test of requestMemberShip method, of class SaxonSystem.
     */
    @Test
    public void testRequestMemberShip() {
        System.out.println("requestMemberShip");
        String name = "Bob";
        String email = "bob@bob.com";
        String address = "11 Eleven Avenue";
        String postcode = "EL11 VEN";
        long telephone = 12;
        Payment paymentType = new Cheque("12/12/2016", 120);
        SaxonSystem instance = new SaxonSystem();
        boolean expResult = true;
        boolean result = instance.requestMemberShip(name, email, address, postcode, telephone, paymentType);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkCustomerExists method, of class SaxonSystem.
     */
    @Test
    public void testCheckCustomerExists() {
        System.out.println("checkCustomerExists");
        
        String email = "test@test.com";
        SaxonSystem instance = new SaxonSystem();
        Customer testCustomer = new Customer("Bob", "test@test.com", "sds", "ub1", 934093049);
        instance.addCustomer(testCustomer);
        boolean expResult = true;
        boolean result = instance.checkCustomerExists(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of addCustomer method, of class SaxonSystem.
     */
    @Test
    public void testAddCustomer() {
        System.out.println("addCustomer");
        Customer customer = null;
        SaxonSystem instance = new SaxonSystem();
        instance.addCustomer(customer);
        assertEquals(1, instance.members.size());
    }
    
}
