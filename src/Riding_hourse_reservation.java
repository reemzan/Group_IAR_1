import java.util.*;

public class Hourse_Riding_Reservation {

    static ArrayList<Customer> customers = new ArrayList();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Welcome page
        System.out.println("welcome to Hourse Riding Reservation");
        System.out.println();

        // Integer input and loop to determine the user's choice (signup or login)
        int choise = 0;
        while (choise != 1 || choise != 2) {
            System.out.println("type 1 to sign up");
            System.out.println("type 2 to login");
            choise = input.nextInt();
            if (choise == 1) {
                sign_up(input);
            } else if (choise == 2) {
                login(input);

            } else {
                System.out.println();
                System.out.println("wrong input try again");
            }
        }
    }

    // signup method, takes info of new customer then store it
    public static void sign_up(Scanner input) {

        System.out.println();
        System.out.println("Sign up an account ");
        System.out.println("--------------------------");
        System.out.print("Enter username: ");
        String username = input.next();

        System.out.print("Enter password: ");
        String password = input.next();

        System.out.print("Enter Email (gmail, hotmail only): ");
        String email = input.next();
        while (true) {
            if (email.endsWith("@gmail.com") || email.endsWith("@hotmail.com")) {
                break;
            }
            System.out.print("Wrong Email try again ");
            email = input.next();
        }

        // checks if the entered email already exists or not
        for (int i = 0; i < customers.size(); i++) {
            Customer tem = customers.get(i);
            if (email.equalsIgnoreCase(tem.getEmail())) {

                // allow the customer to login if the email is already exist
                System.out.println();
                System.out.println("email already exist.");
                System.out.print("type 'yes' if you want to login to the account: ");

                // redirect to login page
                String answer = input.next();
                if (answer.equalsIgnoreCase("yes")) {
                    login(input);
                } else {
                    // Error message
                    while (email.equalsIgnoreCase(tem.getEmail())) {
                        System.out.println("try again or type 'exit' ");
                        System.out.print("Enter email: ");
                        email = input.next();
                        if (email.equalsIgnoreCase("exit")) {
                            System.exit(0);
                        }
                    }
                }
            }
        }

        // checks if the entered phone number is valid
        System.out.print("Enter phone number: ");
        String Phone = input.next();
        while (Phone.length() != 10) {
            System.out.print("phone number is not 10 digits try again: ");
            Phone = input.next();
        }

        // create a new customer object when all info are valid 
        
        try{
          long phone = Long.parseLong(Phone);
              Customer new_customer = new Customer(username, password, email, phone);

        // add to customers ArrayList   
        customers.add(new_customer);
        System.out.println("");
        System.out.println("You have signed up succefully");
        System.out.println("");
        }catch(Exception ex){
            System.out.println("Error!");
            System.out.println("Enter a valid phone number");
        }

      

    }

     // login method, allow the user to access the application
    public static void login(Scanner input) {

        System.out.println();
        System.out.println("Login an account ");
        System.out.println("--------------------------");
        System.out.print("Enter Email: ");
        String email = input.next();
        System.out.print("Enter password: ");
        String password = input.next();

        int key = 0;
        for (int i = 0; i < customers.size(); i++) {
            Customer tem = customers.get(i);
            if (email.equalsIgnoreCase(tem.getEmail())) {

                //email correct, password correct
                if (password.equalsIgnoreCase(tem.getPassword())) {
                    // Iteration 2
                    System.out.println("");
                    System.out.println("You have logged in succefully");
                    System.out.println("");

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
}
