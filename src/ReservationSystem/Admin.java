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
                       int choise = 0;
        while (choise != 1 || choise != 2 || choise != 3) {
            System.out.println("type 1 add reservation");
            System.out.println("type 2 to view reservation");
            System.out.println("type 3 to delete reservation");
            System.out.println("type 4 to logout");
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    tem.AddReservation(input);
                    
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                   
                    break;
                    case 4:
                    return;
                
                default:
                    System.out.println();
                    System.out.println("wrong input try again");
                    break;
            }
        }
                    
                    
                    
                    

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
        String ReservationTime = input.next();
        System.out.println("enter number of visitors");
        int VisitorNum = input.nextInt();
        System.out.println("enter price");
        double price = input.nextDouble();
        boolean Available = true;
        Reservation new_reservation = new Reservation(ReservationDate, ReservationTime,  VisitorNum,price, Available,null);
        Reservations.add(new_reservation);
        System.out.println("");
        System.out.println("the new reservation has been added : "+new_reservation.toString());
        System.out.println("");
      
        
    }
    

}
