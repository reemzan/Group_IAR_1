package ReservationSystem;

public class Reservation {

    private String ReservationDate;
    private String ReservationTime;
    private String price;
    private boolean Available;

    private Customer customer;

// Constructor to create a new Reservation Object
    public Reservation(String ReservationDate, String ReservationTime, String price, boolean Available, Customer customer) {
        this.ReservationDate = ReservationDate;
        this.ReservationTime = ReservationTime;
        this.price = price;
        this.Available = Available;
        this.customer = customer;
    }

    Reservation() {

    }

    // Setters and getters 
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return Available;
    }

    public void setAvailable(boolean Available) {
        this.Available = Available;
    }

    // Check if all reservation are full
    public boolean isReservationsFull() {
        for (int i = 0; i < DataHolder.ReservationsArray.size(); i++) {
            if (DataHolder.ReservationsArray.get(i).isAvailable() == true) {
                return false;
            }
        }
        return true;
    }

    // Check if a particular customer has any reserved appointments or not
    public boolean Is_CustomerReservation_Empty(String email) {
        for (int i = 0; i < DataHolder.ReservationsArray.size(); i++) {
            if (DataHolder.ReservationsArray.get(i).getCustomer() != null) {
                if (DataHolder.ReservationsArray.get(i).getCustomer().getEmail().equalsIgnoreCase(email)) {
                    return false;
                }
            } else {
                continue;

            }
        }
        return true;
    }

    // Print a reservation information
    @Override
    public String toString() {
        return "Date: " + ReservationDate + " | Time: " + ReservationTime + " | price: " + price;
    }
}
