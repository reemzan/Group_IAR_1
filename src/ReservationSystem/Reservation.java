<<<<<<< Updated upstream
=======
<<<<<<< HEAD
<<<<<<< Updated upstream
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

    @Override
    public String toString() {
        return "Date: " + ReservationDate + " Time: " + ReservationTime + " VisitorNumber: " + VisitorNum + " price: " + price ;
    }

    

    
    
    
    
    
}
=======
=======
>>>>>>> 1b16b83626da2cca6ba1bcfcb56d5cc4477dcf89
>>>>>>> Stashed changes
package ReservationSystem;


import java.util.ArrayList;


public class Reservation {
    
    private String ReservationDate;
    private String ReservationTime;
    private int VisitorNum;
    private double price;
    private boolean Available;
    
<<<<<<< Updated upstream
    static ArrayList<Reservation> Reservations = new ArrayList();

=======
<<<<<<< HEAD
    private Customer customer;
    static ArrayList<Reservation> Reservations = new ArrayList();

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }
    
    

=======
    static ArrayList<Reservation> Reservations = new ArrayList();

>>>>>>> 1b16b83626da2cca6ba1bcfcb56d5cc4477dcf89
>>>>>>> Stashed changes
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

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
    @Override
    public String toString() {
        return "Date: " + ReservationDate + " Time: " + ReservationTime + " VisitorNumber: " + VisitorNum + " price: " + price ;
    }
}
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
    

    
    
    
    
    
}
<<<<<<< Updated upstream
=======
>>>>>>> 1b16b83626da2cca6ba1bcfcb56d5cc4477dcf89
>>>>>>> Stashed changes
