package ReservationSystem;

import java.util.*;

// Main Class
public class Horse_Riding_Reservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Welcome page 
        System.out.println("Welcome To Horse Riding Reservation");
        System.out.println();

        // Integer input and loop to determine the user's choice
        int userChoice = 0;
        Admin.addAdmin();
        // System main menu
        while (userChoice != 1 || userChoice != 2 || userChoice != 3) {
            System.out.println("Enter 1 to sign up");
            System.out.println("Enter 2 to login");
            System.out.println("Enter 3 to admin login");
            System.out.println("Enter 4 to exit");
            // Takes the user's choice
            userChoice = input.nextInt();
            switch (userChoice) {
                case 1:
                    // New Customer 
                    Customer.sign_up(input);
                    break;
                case 2:
                    // Old Customer
                    Customer.login(input);
                    break;
                case 3:
                    // Admin 
                    Admin.login(input);
                    break;
                case 4:
                    // Done and Exit
                    System.exit(0);
                default:
                    // Otherwise show an error message and ask the user to reenter a correct input
                    System.out.println();
                    System.out.println("Wrong input try again");
                    break;
            }
        }

    }
}
