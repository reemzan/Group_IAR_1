package ReservationSystem;

//import static ReservationSystem.Reservation.Reservations;
import java.util.ArrayList;
import java.util.Scanner;

public class User {

    private String username;
    private String password;
    private String email;
    private long phonenum;
    // ArrayList to store all users' information
    static ArrayList<User> usersArry = new ArrayList();

    public User() {
    }

    // Constructor to create a new User object
    public User(String username, String password, String email, long phonenum) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenum = phonenum;
    }

    // Setters and getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public long getPhonenum() {
        return phonenum;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhonenum(long phonenum) {
        this.phonenum = phonenum;
    }
}
