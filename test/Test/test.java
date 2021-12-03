package Test;

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
import ReservationSystem.Customer;
import org.junit.Assert;

/**
 *
 * @author wasan
 */
public class test {
    
    public test() {
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
    

   //test for show menue method 
    @Test
    public void testshowmeue(){
        int choice=3;
        Customer customer=new Customer();
        
        customer.ShowMenu(choice);
    }
    
     //test for ask for help method 
    @Test
    public void testAskforhelp(){
        Customer customer=new Customer();
        customer.AskforHelp();
    }
    
    //test for view my reservation method 
     @Test
    public void testviewmyreservation(){
        Customer customer=new Customer();
        customer.ViewMyReservations();
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
