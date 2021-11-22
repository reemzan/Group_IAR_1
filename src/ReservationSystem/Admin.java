package ReservationSystem;

import static ReservationSystem.Reservation.ReservationsArray;
import static ReservationSystem.User.usersArry;
import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {

    // ArrayList for Admins
    static ArrayList<Admin> adminArray = new ArrayList();

    // Constructor to create an admin object
    public Admin(String username, String password, String email, long phonenum) {
        super(username, password, email, phonenum);
    }

    // Information for the admin 
    public static void addAdmin() {
        String username = "1";
        String password = "1";
        String email = "1@gmail.com";
        long phonenum = 1111111111;
        User newAdmin = new User(username, password, email, phonenum);
        usersArry.add(newAdmin);
        Admin newAdmin1 = new Admin(username, password, email, phonenum);
        adminArray.add(newAdmin1);
    }

    // Allow the admin to access the system
    public static void login(Scanner input) {
        // Ask the admin to enter required data
        System.out.println();
        System.out.println("Login into an account : Admin");
        System.out.println("--------------------------");
        System.out.print("Enter Email: ");
        String email = input.next();
        System.out.print("Enter password: ");
        String password = input.next();

        int key = 0;
        for (int i = 0; i < adminArray.size(); i++) {
            Admin temp = adminArray.get(i);
            if (email.equalsIgnoreCase(temp.getEmail())) {
                //email correct, password correct
                if (password.equalsIgnoreCase(temp.getPassword())) {
                    System.out.println("");
                    System.out.println("You have logged in succefully");
                    System.out.println("");
                    int adminChoice = 0;
                    while (adminChoice != 1 || adminChoice != 2 || adminChoice != 3) {
                        // Admin main menu
                        System.out.println("Enter 1 to add a reservation");
                        System.out.println("Enter 2 to view a reservation");
                        System.out.println("Enter 3 to delete a reservation");
                        System.out.println("Enter 4 to logout");
                        adminChoice = input.nextInt();
                        switch (adminChoice) {
                            // Redirect admin depends on the entered value
                            case 1:
                                temp.AddReservation(input);
                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:
                                return;

                            default:
                                System.out.println();
                                // Show error message if admin entered a value other than 1-4
                                System.out.println("Wrong input try again");
                                break;
                        }
                    }

                } else {
                    // Email correct, password incorrect
                    System.out.println("ERROR, wrong password");
                    while (!password.equalsIgnoreCase(temp.getPassword())) {
                        System.out.println("Try again or type 'exit' ");
                        System.out.println("Enter password: ");
                        password = input.next();
                        if (password.equalsIgnoreCase("exit")) {
                            break;
                        }
                    }
                    // Email correct, password correct
                    System.out.println("");
                    System.out.println("You have logged in succefully");
                    System.out.println("");
                }
                key = 1;
            }
        }

        // Email incorrect
        if (key == 0) {
            System.out.println("ERROR, email is not stored");
        }
    }

    // Allow the admin to create a new appointment 
    public void AddReservation(Scanner input) {
        // Enter required data for the appointment
        System.out.println("Enter reservation date");
        String ReservationDate = input.next();
        System.out.println("Enter reservation time");
        String ReservationTime = input.next();
        System.out.println("Enter number of visitors");
        int VisitorNum = input.nextInt();
        System.out.println("Enter price");
        double price = input.nextDouble();
        // Set as an available appointment
        boolean Available = true;
<<<<<<< Updated upstream
        Reservation new_reservation = new Reservation(ReservationDate, ReservationTime,  VisitorNum,price, Available);
        Reservations.add(new_reservation);
=======
        // Create new appointment
        Reservation new_reservation = new Reservation(ReservationDate, ReservationTime, VisitorNum, price, Available, null);
        // Add to available Reservations
        ReservationsArray.add(new_reservation);
>>>>>>> Stashed changes
        System.out.println("");
        // Confirmation message
        System.out.println("The new reservation has been added : " + new_reservation.toString());
        System.out.println("");
<<<<<<< Updated upstream
        
        
=======

>>>>>>> Stashed changes
    }

}
