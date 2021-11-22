package ReservationSystem;

import java.util.ArrayList;

public class Reservation {

    private String ReservationDate;
    private String ReservationTime;
    private int VisitorNum;
    private double price;
    private boolean Available;

    private Customer customer;
<<<<<<< Updated upstream
    static ArrayList<Reservation> Reservations = new ArrayList();
=======
    // Available Reservations ArrayList
    static ArrayList<Reservation> ReservationsArray = new ArrayList();

// Constructor to create a new Reservation Object
    public Reservation(String ReservationDate, String ReservationTime, int VisitorNum, double price, boolean Available, Customer customer) {
        this.ReservationDate = ReservationDate;
        this.ReservationTime = ReservationTime;
        this.VisitorNum = VisitorNum;
        this.price = price;
        this.Available = Available;
        this.customer = customer;
    }
>>>>>>> Stashed changes

    // Setters and getters 
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
<<<<<<< Updated upstream
    
    

    public Reservation(String ReservationDate, String ReservationTime, int VisitorNum,double price, boolean Available) {
        this.ReservationDate = ReservationDate;
        this.ReservationTime = ReservationTime;
        this.VisitorNum = VisitorNum;
        this.price=price;
        this.Available = Available;
    }
    
    
=======
>>>>>>> Stashed changes

    public String getReservationDate() {
        return ReservationDate;
    }

    public void setReservationDate(String ReservationDate) {
        this.ReservationDate = ReservationDate;
    }

    public String getReservationTime() {
        return ReservationTime;
    }

    public void setReservationTime(String ReservationTime) {
        this.ReservationTime = ReservationTime;
    }

    public int getVisitorNum() {
        return VisitorNum;
    }

    public void setVisitorNum(int VisitorNum) {
        this.VisitorNum = VisitorNum;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }

    // Check if all reservation are full
    public static boolean isReservationsFull() {
<<<<<<< Updated upstream
    for (int i = 0; i < Reservations.size(); i++) {
        if (Reservations.get(i).isAvailable()==true) {
            return false;
        }
    }
    return true;
}

=======
        for (int i = 0; i < ReservationsArray.size(); i++) {
            if (ReservationsArray.get(i).isAvailable() == true) {
                return false;
            }
        }
        return true;
    }

    // Check if a particular customer has any reserved appointments or not
    public static boolean Is_CustomerReservation_Empty(String email) {
        for (int i = 0; i < ReservationsArray.size(); i++) {
            if (ReservationsArray.get(i).getCustomer() != null) {
                if (ReservationsArray.get(i).getCustomer().getEmail().equalsIgnoreCase(email)) {
                    return false;
                }
            } else {
                continue;

            }
        }
        return true;
    }

    // Print a reservation information
>>>>>>> Stashed changes
    @Override
    public String toString() {
        return "Date: " + ReservationDate + " /nTime: " + ReservationTime + " /nVisitorNumber: " + VisitorNum + " /nprice: " + price;
    }
}
