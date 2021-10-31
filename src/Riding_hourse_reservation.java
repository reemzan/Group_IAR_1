import java.util.*;

public class Riding_hourse_reservation {

    // ArrayList to store customers' information
    static ArrayList <Customer> customers = new ArrayList();
    
    public static void main(String[] args) {
        
        Customer new_customer = new Customer("s", "s", "s", 1);
        Customer new_customer2 = new Customer("s", "s", "s", 1);
        customers.add(new_customer);
        customers.add(new_customer2);
        
        Scanner input = new Scanner(System.in);
        // Welcome page
        System.out.println("welcome to hourse Riding reservation");
        System.out.println();
        // Integer input and loop to determine the user's choice (signup or login)
        int userChoice = 0;
        while (userChoice != 1 || userChoice != 2){ 
            System.out.println("type 1 to sign up");
            System.out.println("type 2 to login");
            userChoice = input.nextInt();
            if (userChoice == 1){
                sign_up(input);
                break;
            } else if (userChoice == 2) {
                login(input)
                 break;
            } else {
                // Error message if the input is neither 1 nor 2
                System.out.println();
                System.out.println("wrong input try again");
            }
        }
    }
    
    // signup method, takes info of new customer then store it
    public static void sign_up (Scanner input){
        
        System.out.println();
        System.out.println("Sign up an account ");
        System.out.println("--------------------------");
        System.out.print("Enter username: ");
        String username = input.next();
        
        System.out.print("Enter password: ");
        String password = input.next();
        
        System.out.print("Enter Email: ");
        String email = input.next();
        
        // checks if the entered email already exists or not
        for (int i = 0; i < customers.size(); i++) {
            Customer temp = customers.get(i);
            if(email.equalsIgnoreCase(temp.getEmail())){
                // allow the customer to login if the email is already exist 
                System.out.println();
                System.out.println("email already exist.");
                System.out.print("type 'yes' if you want to login to the account: ");
                
                // redirect to login page
                String answer = input.next();
                if (answer.equalsIgnoreCase("yes")) {
                    login(input);
                }else{
                    // Error message 
                    while(email.equalsIgnoreCase(temp.getEmail())){
                        System.out.println("try again or type 'exit' ");
                        System.out.print("Enter email: ");
                        email = input.next();
                        if(email.equalsIgnoreCase("exit"))
                            System.exit(0);
                    }
                } 
                
            }
        }
        
        // checks if the entered phone number is valid
        System.out.print("Enter phone number: ");
        String Phone = input.next();
        while (Phone.length() != 10){
            System.out.print("phone number is not 10 digits try again: ");
            Phone = input.next();
        }
        // create a new customer object when all info are valid 
        long phone=Long.parseLong(Phone);
        Customer new_customer = new Customer(username, password, email, phone);
        
        
        // add to customers ArrayList
        customers.add(new_customer);
        
    }
    
    // login method, allow the user to access the application  
    public static void login(Scanner input){
        
        System.out.println();
        System.out.println("Login an account ");
        System.out.println("--------------------------");
        System.out.print("Enter Email: ");
        String email = input.next();
        System.out.print("Enter password: ");
        String password = input.next();
        
        for (int i = 0; i < customers.size(); i++) {
            Customer temp = customers.get(i);
            if(email.equalsIgnoreCase(temp.getEmail())){
                
                //email correct, password correct
                if(password.equalsIgnoreCase(temp.getPassword())){
                    ///////////
                    
                }else{
                    //email correct, password incorrect
                    System.out.println("ERROR, wrong password");
                    while(!password.equalsIgnoreCase(temp.getPassword())){
                        System.out.println("try again or type 'exit' ");
                        System.out.print("Enter password: ");
                        password = input.next();
                        if(password.equalsIgnoreCase("exit"))
                            System.exit(0);
                    }
                    
                    
                }
                    
             //email incorrect   
            }else
                System.out.println("ERROR, email is not stored ");
        }
    }
}
