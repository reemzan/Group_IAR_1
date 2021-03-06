package ReservationSystem;

import java.util.*;

public class Horse_Riding_Reservation {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome To Horse Riding Reservation");
        //System.out.println("");

        int i = 0;
        //Data Holder object
        DataHolder dh = new DataHolder();
        // Add the Admin to the system
        Admin newAdmin = initAdmin();
        dh.getAdminArray().add(newAdmin);

        CustomerService newcustomerservice = initCustomerService();
        dh.getcustomer_serviceArray().add(newcustomerservice);

        // Integer input and loop to determine the user's choice
        int userChoice = 0;
        // System main menu
        while (true) {
            // print
            PrintMenus(1);
            // Takes the user's choice
            userChoice = input.nextInt();
            switch (userChoice) {
                case 1:
                    // New Customer 
                    System.out.println();
                    System.out.println("--------------------------");
                    System.out.println("Sign up an account ");
                    System.out.println("--------------------------");

                    System.out.print("Enter username: ");
                    String username1 = input.next();
                    System.out.print("Enter password: ");
                    String password1 = input.next();
                    System.out.print("Enter Email (gmail, hotmail only): ");
                    String email1 = input.next();
                    if (dh.RetriveCustomerObject(email1, dh.getCustomersArray()) != null || dh.RetriveAdminObject(email1, dh.getAdminArray()) != null) {
                        System.out.println();
                        System.out.println("Email already exist.");
                        System.out.println("--------------------------");
                        System.out.println("");
                    } else {
                        System.out.print("Enter phone number: ");
                        String Phone = input.next();
                        long phone = Long.parseLong(Phone);

                        Customer customer = new Customer(username1, password1, email1, phone);

                        if (customer.sign_up(customer)) {
                            // Confirmation message
                            System.out.println("");
                            System.out.println("You have signed up succefully");
                            System.out.println("--------------------------");
                            System.out.println("");
                        }
                    }

                    break;
                case 2:
                    System.out.println();
                    System.out.println("--------------------------");
                    System.out.println("Login into an account");
                    System.out.println("--------------------------");
                    System.out.print("Enter Email: ");
                    String emailLogin = input.next();
                    System.out.print("Enter password: ");
                    String passwordLogin = input.next();

                    // Admin login
                    if (emailLogin.equalsIgnoreCase("1") && passwordLogin.equalsIgnoreCase("1")) {
                        Admin admin = dh.RetriveAdminObject(emailLogin, dh.getAdminArray());
                        admin.MessageloginConfirm();

                        int choice;
                        do {
                            PrintMenus(2);
                            choice = input.nextInt();
                            System.out.println("");
                            admin.ShowMenu(choice);
                        } while (choice != 4);
                        break;

                        // Customer login
                    } else if (emailLogin.equalsIgnoreCase("2") && passwordLogin.equalsIgnoreCase("2")) {
                        CustomerService customerservice = dh.RetriveCustomerServiceObject(emailLogin, dh.getcustomer_serviceArray());

                        customerservice.Message_loginConfirm();

                        int choice;
                        do {
                            PrintMenus(4);
                            choice = input.nextInt();
                            System.out.println("");
                            customerservice.ShowMenu(choice);
                        } while (choice != 2);
                        break;
                    } else {
                        Customer customer = dh.RetriveCustomerObject(emailLogin, dh.getCustomersArray());
                        if (customer != null) {
                            if (customer.login(emailLogin, passwordLogin)) {
                                int choice;
                                do {
                                    PrintMenus(3);
                                    choice = input.nextInt();
                                    System.out.println("");
                                    customer.ShowMenu(choice);
                                } while (choice != 5);
                                break;
                            } else {
                                System.out.println("");
                                System.out.println("Wrong password");
                                System.out.println("--------------------------");
                                System.out.println("");
                            }

                        } else {
                            System.out.println("");
                            System.out.println("Wrong email");
                            System.out.println("--------------------------");
                            System.out.println("");
                        }
                    }
                    break;
                case 3:
                    // Done and Exit
                    System.exit(0);
                default:
                    // Otherwise show an error message and ask the user to reenter a correct input
                    System.out.println();
                    System.out.println("Wrong input try again");
                    System.out.println("-----------------------------------");
                    System.out.println();
                    break;
            }
        }
    }

    public static void PrintMenus(int key) {

        switch (key) {
            // Home Page
            case 1:
                // main menu
                System.out.println("-----------------------------------");
                System.out.println("            Main Menu");
                System.out.println("-----------------------------------");
                System.out.println("Enter 1 to sign up");
                System.out.println("Enter 2 to login");
                System.out.println("Enter 3 to exit");
                return;

            // admin main menu
            case 2:
                System.out.println("-----------------------------------");
                System.out.println("            Admin Menu             ");
                System.out.println("-----------------------------------");
                System.out.println("Enter 1 to add a new reservation");
                System.out.println("Enter 2 to view all reservations");
                System.out.println("Enter 3 to delete a reservation");
                System.out.println("Enter 4 to logout");
                return;
            // customer main menu
            case 3:
                System.out.println("-----------------------------------");
                System.out.println("            Customer Menu          ");
                System.out.println("-----------------------------------");
                System.out.println("Enter 1 to make reservation");
                System.out.println("Enter 2 to view my reservation");
                System.out.println("Enter 3 to cancel reservation");
                System.out.println("Enter 4 to ask for help");
                System.out.println("Enter 5 to logout");
                return;

            case 4:
                System.out.println("-----------------------------------");
                System.out.println("        Customer Service Menu      ");
                System.out.println("-----------------------------------");
                System.out.println("Enter 1 to add  Q&A");
                System.out.println("Enter 2 to logout");

            default:
                return;

        }
    }

    public static Admin initAdmin() {
        String username = "1";
        String password = "1";
        String email = "1";
        long phonenum = 1111111111;
        Admin newAdmin = new Admin(username, password, email, phonenum);
        return newAdmin;
    }

    public static CustomerService initCustomerService() {
        String username = "2";
        String password = "2";
        String email = "2";
        long phonenum = 222222;
        CustomerService newcustomerservice = new CustomerService(username, password, email, phonenum);
        return newcustomerservice;
    }

}
