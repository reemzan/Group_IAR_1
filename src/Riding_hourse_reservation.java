import java.util.*;

public class Riding_hourse_reservation {

    
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
        int userChoise = 0;
        while (userChoise != 1 || userChoise != 2){ 
            System.out.println("type 1 to sign up");
            System.out.println("type 2 to login");
            userChoise = input.nextInt();
            if (userChoise == 1){
                sign_up(input);
                break;
            } else if (userChoise == 2) {
                login(input)
                 break;
            } else {
                System.out.println();
                System.out.println("wrong input try again, or type '3'");
                if(userChoise == 3)
                    System.exit(0);
            }
        
        }
        
        
        
        
    }
    
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
        
        
        for (int i = 0; i < customers.size(); i++) {
            Customer tem = customers.get(i);
            if(email.equalsIgnoreCase(tem.getEmail())){
                
                System.out.println();
                System.out.println("email already exist.");
                System.out.print("type 'yes' if you want to login to the account: ");
                
                String answer = input.next();
                if (answer.equalsIgnoreCase("yes")) {
                    login(input);
                }else{
                    while(email.equalsIgnoreCase(tem.getEmail())){
                        System.out.println("try again or type 'exit' ");
                        System.out.print("Enter email: ");
                        email = input.next();
                        if(email.equalsIgnoreCase("exit"))
                            System.exit(0);
                    }
                } 
                
            }
        }
        
        
        System.out.print("Enter phone number: ");
        String Phone = input.next();
        while (Phone.length() != 10){
            System.out.print("phone number is not 10 digits try again: ");
            Phone = input.next();
        }
        long phone=Long.parseLong(Phone);
        Customer new_customer = new Customer(username, password, email, phone);
        
        
            
        customers.add(new_customer);
        
    }
    
    public static void login(Scanner input){
        
        System.out.println();
        System.out.println("Login an account ");
        System.out.println("--------------------------");
        System.out.print("Enter Email: ");
        String email = input.next();
        System.out.print("Enter password: ");
        String password = input.next();
        
        for (int i = 0; i < customers.size(); i++) {
            Customer tem = customers.get(i);
            if(email.equalsIgnoreCase(tem.getEmail())){
                
                //email correct, password correct
                if(password.equalsIgnoreCase(tem.getPassword())){
                    ///////////
                    
                }else{
                    //email correct, password incorrect
                    System.out.println("ERROR, wrong password");
                    while(!password.equalsIgnoreCase(tem.getPassword())){
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
