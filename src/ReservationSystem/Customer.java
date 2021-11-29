package ReservationSystem;

//import java.util.ArrayList;
//import java.util.Scanner;
//import static ReservationSystem.Reservation.Reservations;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User{
    
    public Customer() {
    }


    // Constructor to create a customer object
    public Customer(String username, String password, String email, long phonenum) {
        super(username, password, email, phonenum);
    }
    
    @Override
    public void ShowMenu(int CustomerChoice){
        switch (CustomerChoice) {
                            // Redirect customer depends on the entered value
                            case 1:
                            //    AddReservation(adminChoice);
                                MakeReservation();
                                break;
                            case 2:
                                ViewMyReservations();
                                break;
                            case 3:
                                DeleteMyReservation();
                                break;
                            case 4:
                                AskforHelp();
                                 break;
                            case 5:
                                return;

                            default:
                                System.out.println();
                                // Show error message if customer entered a value other than 1-4
                                System.out.println("Wrong input try again");
                                break;
                        }
    }


    // Add a new Customer to the system
    public boolean sign_up(Customer customer) {
            DataHolder.customersArray.add(customer);
        //    customersArray.add(customer);
            return true;
    }

    // Allow the customer to access the system
    public  boolean login(String email,String password) {
        int key = 0;
        for (int i = 0; i < DataHolder.customersArray.size(); i++) {
            Customer temp = DataHolder.customersArray.get(i);
            if (email.equalsIgnoreCase(temp.getEmail())) {
                //email correct, password correct
                if (password.equalsIgnoreCase(temp.getPassword())) {
                    // Confirmation message
                    System.out.println("");
                    System.out.println("You have logged in succefully");
                    System.out.println("");

return true;
            
                }
            }
        }
        return false;
    }
    



    // Allow the customer to reserve a new appointment
    public void MakeReservation() {
        Reservation r = new Reservation();
        
        // Check the availability of appoitments 
        ViewAvailableReservations();
        
        // No available appointment
        if (DataHolder.ReservationsArray.isEmpty()) {
            System.out.println("There is no available reservations");
        } else if (r.isReservationsFull()) {
            // Or reserved
            System.out.println("Fully reserved");
        }
        // Exit from the current menu
        System.out.println("Enter 0 to return to the menu");
        System.out.println();
        // Enter reservation number
        System.out.println("Enter the reservation number: ");

        try {
            while (true) {
                int resrervationChoice = TakeCustomerChoice();

                if (resrervationChoice == 0) {
                    return;
                    // Wrong Reservation number
                } else if (resrervationChoice > DataHolder.ReservationsArray.size() + 1 || resrervationChoice < 0) {
                    System.out.println("Error! reenter");

                    // All set 
                } else {
                    DataHolder.ReservationsArray.get(resrervationChoice - 1).setCustomer(this);
                    DataHolder.ReservationsArray.get(resrervationChoice - 1).setAvailable(false);
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
  
    
    
    public void ViewAvailableReservations(){
        for (int i = 0; i < DataHolder.ReservationsArray.size(); i++) {
            if (DataHolder.ReservationsArray.get(i).isAvailable() == true) {
                System.out.println((i + 1) + "- " + DataHolder.ReservationsArray.get(i).toString());
            }

        }
    }
    
    
    // Allow the Customer to view his/her reservered reservations
     public void ViewMyReservations(){
         
        ArrayList<Reservation> CRA = new ArrayList();
        for (int i = 0; i < DataHolder.ReservationsArray.size(); i++) {
            if (DataHolder.ReservationsArray.get(i).getCustomer() == this) {
                System.out.println((i + 1) + "- " + DataHolder.ReservationsArray.get(i).toString());
                CRA.add(DataHolder.ReservationsArray.get(i));
            }
        }
        if(CRA.isEmpty()){
            System.out.println("");
            System.out.println("You have no booked reservation");
            System.out.println("");
        }
     }

     
    // Allow the Customer to delete a reserved appointment
    public void DeleteMyReservation() {
        Reservation r = new Reservation();
        
        // Depending on the customer's email
        String customeremail = this.getEmail();
        
        // Error message, Customer doesn't booked any appointments
        if (r.Is_CustomerReservation_Empty(customeremail)) {
            System.out.println("Sorry! you dont have any reservations yet");
            return;
        } else {
            ViewMyReservations();
            // Customer have an appointment
            System.out.println("Enter the reservation number you want to delete");
        }
        try {
            while (true) {
                int deletionChoice = TakeCustomerChoice();
                if (deletionChoice == 0) {
                    return;
                } else if (deletionChoice < 0 || deletionChoice > DataHolder.ReservationsArray.size() + 1) {
                    // Incorrect reservation number
                    System.out.println("Error! reenter again: ");
                    // All set
                } else {
                    DataHolder.ReservationsArray.get(deletionChoice - 1).setCustomer(null);
                    DataHolder.ReservationsArray.get(deletionChoice - 1).setAvailable(true);
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
    public void viewAllquestions(){
          System.out.println("Frequent Asked question:");
          System.out.println("--------------------------");
          for(int i=0;i<DataHolder.question_And_answerArray.size();i++){
          System.out.println((i + 1) + "- " + DataHolder.question_And_answerArray.get(i).getQuestions());
        }
          System.out.println("For contact info enter 0");
    }
    
    public void AskforHelp(){
        
         if(DataHolder.question_And_answerArray.isEmpty()){
            System.out.println("Sorry! there are no questions yet");
              System.out.println("please contact us:\n" + "Email:park@gmail.com\n" + "phone:0556736257\n");
            return;
        }
         else{
        viewAllquestions();
        System.out.println("Enter the question number you want to ask:");
        while(true){
        int customerChoice = TakeCustomerChoice();
       if(customerChoice>DataHolder.question_And_answerArray.size()+1||customerChoice<0){
                System.out.println("Error! reenter again:");
                }
       else if(customerChoice!=0){
        System.out.println(DataHolder.question_And_answerArray.get(customerChoice-1).getAnswer()+"\n");
        break;}
        else  if(customerChoice==0){
              System.out.println("couldn't find what you are looking for?\n "
                      + "Contact us:\n" + "Email:park@gmail.com\n" + "phone:0556736257\n");
        break;
          }
    }
         }
    }
    
     public int TakeCustomerChoice(){
         Scanner input = new Scanner(System.in);
         int choice = input.nextInt();
         return choice;
    }

}