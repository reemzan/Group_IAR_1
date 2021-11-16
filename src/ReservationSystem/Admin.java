
package ReservationSystem;

import static ReservationSystem.Reservation.Reservations;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    
    private String username;
    private String password;
    private String email;
    private long phonenum;
    static ArrayList<Admin> admin = new ArrayList();
    
    public Admin(String username, String password, String email, long phonenum) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.phonenum = phonenum;
    }

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
    
     // login method, allow the user to access the application
    public static void addAdmin(){
        String username= "1";
     String password= "1";
     String email="1@gmail.com";
     long phonenum=1111111111;
        Admin newAdmin = new Admin(username,password,email,phonenum);
        admin.add(newAdmin);
    }
    
    public static void login(Scanner input) {

        System.out.println();
        System.out.println("Login an account ");
        System.out.println("--------------------------");
        System.out.print("Enter Email: ");
        String email = input.next();
        System.out.print("Enter password: ");
        String password = input.next();

        int key = 0;
         for (int i = 0; i < admin.size(); i++) {
            Admin tem = admin.get(i);
            if (email.equalsIgnoreCase(tem.getEmail())) {

                //email correct, password correct
                if (password.equalsIgnoreCase(tem.getPassword())) {
                    // Iteration 2
                    System.out.println("");
                    System.out.println("You have logged in succefully");
                    System.out.println("");
                    
                    //---------------------------------------------------------------------------------------------------------------------
                    System.out.println("add new reservation");
                    admin.get(i).AddReservation(input);
                    
                    //'''''''''''''''''''''''''''''''''''''''''''''''''''''' print للتأكد
                    for (int y = 0; y < Reservations.size(); y++) {
                     Reservation tem1 = Reservations.get(i);
                        System.out.println(tem1.getPrice());
                        System.out.println(tem1.getReservationDate());
                   //'''''''''''''''''''''''''''''''''''''''''''''''''''''''     
                       
                    }
                    //---------------------------------------------------------------------------------------------------------------------

                } else {
                    //email correct, password incorrect
                    System.out.println("ERROR, wrong password");
                    while (!password.equalsIgnoreCase(tem.getPassword())) {
                        System.out.println("try again or type 'exit' ");
                        System.out.print("Enter password: ");
                        password = input.next();
                        if (password.equalsIgnoreCase("exit")) {
                            break;
                        }
                    }
                    System.out.println("");
                    System.out.println("You have logged in succefully");
                    System.out.println("");
                }
                key = 1;
            }
        }

        //email incorrect
        if (key == 0) {
            System.out.println("ERROR, email is not stored");
        }
    }
    
    public void AddReservation(Scanner input){
        System.out.println("enter reservation date");
        String ReservationDate = input.next();
        System.out.println("enter reservation time");
        String ReservationTime = input.next();;
        System.out.println("enter number of visitors");
        int VisitorNum = input.nextInt();;
        System.out.println("enter price");
        double price = input.nextDouble();
        boolean Available = true;
        Reservation new_reservation = new Reservation(ReservationDate, ReservationTime,  VisitorNum,price, Available);
        Reservations.add(new_reservation);
        
        
    }
    

}
