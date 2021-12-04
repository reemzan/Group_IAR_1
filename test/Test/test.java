package Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import ReservationSystem.Customer;

/**
 *
 * @author wasan
 */
public class test {
    
    public test() {
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
    
}
