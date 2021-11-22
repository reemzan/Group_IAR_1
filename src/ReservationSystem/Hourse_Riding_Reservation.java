<<<<<<< Updated upstream
=======
<<<<<<< HEAD
<<<<<<< Updated upstream
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
         Admin.addAdmin();
        while (choise != 1 || choise != 2 || choise != 3) {
            System.out.println("type 1 to sign up");
            System.out.println("type 2 to login");
            System.out.println("type 3 to admin login");
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    Customer.sign_up(input);
                    break;
                case 2:
                    Customer.login(input);
                    
                    break;
                case 3:
                   
                    Admin.login(input);
                    break;
                
                default:
                    System.out.println();
                    System.out.println("wrong input try again");
                    break;
            }
        }
    }

}
=======

=======
>>>>>>> 1b16b83626da2cca6ba1bcfcb56d5cc4477dcf89
>>>>>>> Stashed changes
package ReservationSystem;

import java.util.*;

public class Hourse_Riding_Reservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

<<<<<<< Updated upstream
=======
<<<<<<< HEAD
        // Welcome page 
        System.out.println("welcome to Hourse Riding Reservation");
        System.out.println();
        

        // Integer input and loop to determine the user's choice (signup or login)
        int choise = 0;
         Admin.addAdmin();
=======
>>>>>>> Stashed changes
        // Welcome page
        System.out.println("welcome to Hourse Riding Reservation");
        System.out.println();

        // Integer input and loop to determine the user's choice (signup or login)
        int choise = 0;
<<<<<<< Updated upstream
=======
>>>>>>> 1b16b83626da2cca6ba1bcfcb56d5cc4477dcf89
>>>>>>> Stashed changes
        while (choise != 1 || choise != 2 || choise != 3) {
            System.out.println("type 1 to sign up");
            System.out.println("type 2 to login");
            System.out.println("type 3 to admin login");
<<<<<<< Updated upstream
            System.out.println("type 4 to customer service login");
=======
<<<<<<< HEAD
=======
            System.out.println("type 4 to customer service login");
>>>>>>> 1b16b83626da2cca6ba1bcfcb56d5cc4477dcf89
>>>>>>> Stashed changes
            choise = input.nextInt();
            switch (choise) {
                case 1:
                    Customer.sign_up(input);
                    break;
                case 2:
                    Customer.login(input);
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
                    
                    break;
                case 3:
                   
                    Admin.login(input);
                    break;
                
=======
>>>>>>> Stashed changes
                    break;
                case 3:
                    Admin.addAdmin();
                    Admin.login(input);
                    break;
                case 4:
                   // Customer Service.login(input);
                    break;
<<<<<<< Updated upstream
=======
>>>>>>> 1b16b83626da2cca6ba1bcfcb56d5cc4477dcf89
>>>>>>> Stashed changes
                default:
                    System.out.println();
                    System.out.println("wrong input try again");
                    break;
            }
        }
    }
<<<<<<< Updated upstream

}
=======
<<<<<<< HEAD
}
>>>>>>> Stashed changes
=======

}
>>>>>>> 1b16b83626da2cca6ba1bcfcb56d5cc4477dcf89
>>>>>>> Stashed changes
