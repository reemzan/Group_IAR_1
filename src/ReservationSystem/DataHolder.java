/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReservationSystem;

/**
 *
 * @author wasan
 */
import java.util.ArrayList;

public class DataHolder{
    
   static ArrayList<Customer>customersArray = new ArrayList();
   static ArrayList<Admin>adminArray = new ArrayList();
   static ArrayList<Reservation>ReservationsArray = new ArrayList();
   
   public DataHolder() {
    }
    
    public Admin RetriveAdminObject(String email,ArrayList<Admin> adminArray) {
        // Checks if the entered email already exists or not
        for (int i = 0; i < adminArray.size(); i++) {
            Admin temp = adminArray.get(i);
            if (email.equalsIgnoreCase(temp.getEmail())) {
                return temp;
            }
        }
        return null;
    }
    
    public Customer RetriveCustomerObject(String email,ArrayList<Customer> customersArray) {
        // Checks if the entered email already exists or not
        for (int i = 0; i < customersArray.size(); i++) {
            Customer temp = customersArray.get(i);
            if (email.equalsIgnoreCase(temp.getEmail())) {
                return temp;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomersArray() {
        return customersArray;
    }

    
    public ArrayList<Admin> getAdminArray() {
        return adminArray;
    }

    public ArrayList<Reservation> getReservationsArray() {
        return ReservationsArray;
    }
}
