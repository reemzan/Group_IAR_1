package ReservationSystem;


import java.util.ArrayList;


public class Reservation {
    
    private String ReservationDate;
    private String ReservationTime;
    private int VisitorNum;
    private double price;
    private boolean Available;
    
    private Customer customer;
    static ArrayList<Reservation> Reservations = new ArrayList();

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    

    public Reservation(String ReservationDate, String ReservationTime, int VisitorNum,double price, boolean Available) {
        this.ReservationDate = ReservationDate;
        this.ReservationTime = ReservationTime;
        this.VisitorNum = VisitorNum;
        this.price=price;
        this.Available = Available;
    }
    
    

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
    
    public static boolean isReservationsFull() {
    for (int i = 0; i < Reservations.size(); i++) {
        if (Reservations.get(i).isAvailable()==true) {
            return false;
        }
    }
    return true;
}

    @Override
    public String toString() {
        return "Date: " + ReservationDate + " Time: " + ReservationTime + " VisitorNumber: " + VisitorNum + " price: " + price ;
    }
}