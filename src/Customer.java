public class Customer {
    
    private String username;
    private String password;
    private String email;
    private long phonenum;

    // Constructor to create a new customer and store their info
    public Customer(String username, String password, String email, long phonenum) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenum = phonenum;
    }

    // getters and setters for each variable
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
