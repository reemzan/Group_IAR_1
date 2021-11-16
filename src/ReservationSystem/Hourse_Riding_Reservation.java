package ReservationSystem;

import java.util.*;

public class Hourse_Riding_Reservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Welcome page
        System.out.println("welcome to Hourse Riding Reservation");
        System.out.println();

        // Integer input and loop to determine the user's choice (signup or login)
        int choise = 0;
        while (choise != 1 || choise != 2 || choise != 3) {
            System.out.println("type 1 to sign up");
            System.out.println("type 2 to login");
            System.out.println("type 3 to admin login");
            System.out.println("type 4 to customer service login");
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    Customer.sign_up(input);
                    break;
                case 2:
                    Customer.login(input);
                    break;
                case 3:
                    Admin.addAdmin();
                    Admin.login(input);
                    break;
                case 4:
                   // Customer Service.login(input);
                    break;
                default:
                    System.out.println();
                    System.out.println("wrong input try again");
                    break;
            }
        }
    }

}
