package ReservationSystem;

import java.util.ArrayList;
import java.util.Scanner;
import static ReservationSystem.Reservation.ReservationsArray;
import static ReservationSystem.User.usersArry;

// Customer Class is a subclass of User Class
public class Customer extends User {

<<<<<<< Updated upstream
    public Customer(String username, String password, String email, long phonenum) {
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
=======
    // ArrayList for customers
    static ArrayList<Customer> customersArray = new ArrayList();
>>>>>>> Stashed changes

    // Constructor to create a customer object
    public Customer(String username, String password, String email, long phonenum) {
        super(username, password, email, phonenum);
    }

    // signup method, takes information of a new customer then store 
    // New Customer to the system
    public static void sign_up(Scanner input) {
        // Take all required information from the customer 
        System.out.println();
        System.out.println("Sign up an account ");
        System.out.println("--------------------------");
        System.out.println("Enter username: ");
        String username = input.next();
        System.out.println("Enter password: ");
        String password = input.next();
        System.out.println("Enter Email (gmail, hotmail only): ");
        String email = input.next();
        while (true) {
            // Check the format of the entered Email
            if (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
                break;
            } // If not correct ask the customer to reenter the Email
            System.out.print("Wrong Email try again ");
            email = input.next();
        }

        // Checks if the entered email already exists or not
        for (int i = 0; i < usersArry.size(); i++) {
            User temp = usersArry.get(i);
            if (email.equalsIgnoreCase(temp.getEmail())) {
                System.out.println();
                // Entered Email is already existed in the system
                System.out.println("email already exist.");
                // Show an error message and ask the customer to reenter the correct Email
                while (email.equalsIgnoreCase(temp.getEmail())) {
                    System.out.println("Try again or type 'exit' ");
                    System.out.print("Enter email: ");
                    // Exit if the customer asked to 
                    email = input.next();
                    if (email.equalsIgnoreCase("exit")) {
                        break;
                    }
                }
            }
        }

        // Checks if the entered phone number is valid
        System.out.println("Enter phone number: ");
        String Phone = input.next();
        while (Phone.length() != 10) {
            // Ask the customer to reenter the phone number if it isn't correct
            System.out.println("Phone number is not 10 digits try again: ");
            Phone = input.next();
        }

        // Create a new user object when all information are valid 
        try {
            long phone = Long.parseLong(Phone);
            User new_customer = new User(username, password, email, phone);

            // Add to users ArrayList   
            usersArry.add(new_customer);

            // Create a new customer object
            Customer new_customer1 = new Customer(username, password, email, phone);

            // Add to customers ArrayList   
            customersArray.add(new_customer1);

            // Confirmation message
            System.out.println("");
            System.out.println("You have signed up succefully");
            System.out.println("");
        } catch (Exception ex) {
            // Show an error message 
            // and ask the customer to reenter a valid phone number 
            System.out.println("Error!");
            System.out.println("Enter a valid phone number");
        }

    }

    // Allow the customer to access the system
    public static void login(Scanner input) {
        // Ask the customer to enter required data
        System.out.println();
        System.out.println("Login into an account ");
        System.out.println("--------------------------");
        System.out.println("Enter Email: ");
        String email = input.next();
        System.out.println("Enter password: ");
        String password = input.next();

        int key = 0;
        for (int i = 0; i < customersArray.size(); i++) {
            Customer temp = (Customer) customersArray.get(i);
            if (email.equalsIgnoreCase(temp.getEmail())) {
                //email correct, password correct
                if (password.equalsIgnoreCase(temp.getPassword())) {
                    // Confirmation message
                    System.out.println("");
                    System.out.println("You have logged in succefully");
                    System.out.println("");
<<<<<<< Updated upstream
                    int choise = 0;
        while (choise != 1 || choise != 2 || choise != 3) {
            System.out.println("type 1 make reservation");
            System.out.println("type 2 to view reservation");
            System.out.println("type 3 to delete reservation");
            System.out.println("type 4 to logout");
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    tem.MakeReservation(input);
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
=======
                    int customerChoice = 0;
                    while (customerChoice != 1 || customerChoice != 2 || customerChoice != 3) {
                        // Customer main menu
                        System.out.println("Enter 1 to make reservation");
                        System.out.println("Enter 2 to view reservation");
                        System.out.println("Enter 3 to delete reservation");
                        System.out.println("Enter 4 to logout");
                        customerChoice = input.nextInt();
                        // Redirect customer depends on the entered value
                        switch (customerChoice) {
                            case 1:
                                temp.MakeReservation(input);
                                break;
                            case 2:

                                break;
                            case 3:
                                temp.DeleteMyReservation(input);
                                break;
                            case 4:
                                return;

                            default:
                                // Show error message if customer entered a value other than 1-4
                                System.out.println();
                                System.out.println("Wrong input try again");
                                break;
                        }
                    }
>>>>>>> Stashed changes

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
                    // Email correct, Password correct
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

    // Allow the customer to reserve a new appointment
    public void MakeReservation(Scanner input) {
        // Check the availability of appoitments 
        for (int i = 0; i < ReservationsArray.size(); i++) {
            if (ReservationsArray.get(i).isAvailable() == true) {
                System.out.println((i + 1) + "- " + ReservationsArray.get(i).toString());
            }

        }

        // No available appointment
        if (ReservationsArray.isEmpty()) {
            System.out.println("There is no available reservations");
        } else if (Reservation.isReservationsFull()) {
            // Or reserved
            System.out.println("Fully reserved");
        }
        // Exit from the current menu
        System.out.println("Enter 0 to exit");
        System.out.println();
        // Enter reservation number
        System.out.println("Enter the reservation number: ");

        try {
            while (true) {
                int resrervationChoice = input.nextInt();

                if (resrervationChoice == 0) {
                    return;
                    // Wrong Reservation number
                } else if (resrervationChoice > ReservationsArray.size() + 1 || resrervationChoice < 0) {
                    System.out.println("Error! reenter");

                    // All set 
                } else {
                    ReservationsArray.get(resrervationChoice - 1).setCustomer(this);
                    ReservationsArray.get(resrervationChoice - 1).setAvailable(false);
                    break;
                }

            }

            // Confirmation message
            System.out.println("");
            System.out.println("You have booked succefully");
            System.out.println("");
        } catch (Exception ex) {
            // Incorrect reservation number
            System.out.println("Error!");
            System.out.println("Enter a valid rservation number");
            System.out.println("");
        }
    }
<<<<<<< Updated upstream
}
=======

    // Allow the Customer to delete a reserved appointment
    public void DeleteMyReservation(Scanner input) {
        // Depending on the customer's email
        String customer = this.getEmail();
        for (int i = 0; i < ReservationsArray.size(); i++) {
            if (ReservationsArray.get(i).getCustomer() == this) {
                System.out.println((i + 1) + "- " + ReservationsArray.get(i).toString());
            }
        }
        // Error message, Customer doesn't booked any appointments
        if (Reservation.Is_CustomerReservation_Empty(customer)) {
            System.out.println("Sorry! you dont have any reservations yet");
            return;
        } else {
            // Customer have an appointment
            System.out.println("Enter the reservation number you want to delete");
        }
        try {
            while (true) {
                int deletionChoice = input.nextInt();
                if (deletionChoice == 0) {
                    return;
                } else if (deletionChoice < 0 || deletionChoice > ReservationsArray.size() + 1) {
                    // Incorrect reservation number
                    System.out.println("Error! reenter again: ");
                    // All set
                } else {
                    ReservationsArray.get(deletionChoice - 1).setCustomer(null);
                    ReservationsArray.get(deletionChoice - 1).setAvailable(true);
                    break;
                }
            }
            // Appointment deleted
            System.out.println("Delete have been successfully");
        } catch (Exception ex) {
            // Incorrect reservation number
            System.out.println("Error!");
            System.out.println("Enter a valid reservation number to delete");
            System.out.println("");
        }
    }
}
>>>>>>> Stashed changes
