package ReservationSystem;
import java.util.Scanner;

public class Admin extends User{
    // Constructor to create an admin object
    public Admin(String username, String password, String email, long phonenum) {
        super(username, password, email, phonenum);
    }

    @Override
    public void ShowMenu(int AdminChoice) {
        switch (AdminChoice) {
            // Redirect admin depends on the entered value
            case 1:
                //    AddReservation(adminChoice);
                System.out.println("--------------------------");
                System.out.println("     Add a Reservation    ");
                System.out.println("--------------------------");
                AddReservation();
                System.out.println("--------------------------");
                System.out.println("");
                break;
            case 2:
                System.out.println("--------------------------");
                System.out.println("        Reservations      ");
                System.out.println("--------------------------");
                ViewAllReservations();
                System.out.println("--------------------------");
                System.out.println("");
                break;
            case 3:
                System.out.println("--------------------------");
                System.out.println("    Delete a Reservation  ");
                System.out.println("--------------------------");
                DeleteReservation();
                System.out.println("--------------------------");
                System.out.println("");
                break;
            case 4:
                return;

            default:
                System.out.println();
                // Show error message if admin entered a value other than 1-4
                System.out.println("Wrong input try again");
                System.out.println("-----------------------------------");
                System.out.println("");
                break;
        }

    }

    public void MessageloginConfirm() {

        System.out.println("");
        System.out.println("You have logged in succefully");
        System.out.println("--------------------------");
        System.out.println("");

    }

    // Allow the admin to create a new appointment 
    public void AddReservation() {
        // Enter required data for the appointment
        String output = AdminAddReservation();
        String[] x = output.split(" ");
        String ReservationDate = x[0];
        String ReservationTime = x[1];
        String price = x[2];

        // Set as an available appointment
        boolean Available = true;

        // Create new appointment
        Reservation new_reservation = new Reservation(ReservationDate, ReservationTime, price, Available, null);

        // Add to available Reservations
        DataHolder.ReservationsArray.add(new_reservation);
        System.out.println("");
        // Confirmation message
        System.out.println("The new reservation has been added : " + new_reservation.toString());
        System.out.println("");

    }

    public String AdminAddReservation() {
        // admin AddReservation menu
        Scanner input = new Scanner(System.in);
        System.out.print("Enter reservation date: ");
        String ReservationDate = input.next();
        System.out.print("Enter reservation time: ");
        String ReservationTime = input.next();
        System.out.print("Enter price: ");
        String price = input.next();
        return (ReservationDate + " " + ReservationTime + " " + price);
    }
     public void ViewAllReservations() {
         if(DataHolder.ReservationsArray.isEmpty()){
             System.out.println("There is no reservation\n");
         }else
        for (int i = 0; i < DataHolder.ReservationsArray.size(); i++) {
            System.out.println((i + 1) + "- " + DataHolder.ReservationsArray.get(i).toString());
            if(DataHolder.ReservationsArray.get(i).getCustomer()==null)
                 System.out.println("The customer: none "+"| The availability: available\n");
            else
                 System.out.println("The customer:"+DataHolder.ReservationsArray.get(i).getCustomer().getUsername()+"| The availability: not available\n");
        }
        
        
    }
    
     public int AdminDeleteReservation(){
        // admin DeleteReservation menu
        ViewAllReservations();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter reservation number to delete it: ");
        int ReservationNum = input.nextInt();
        System.out.println("");
        return ReservationNum;
    }
    
    // Allow the admin to delete an appointment 
    public void DeleteReservation() {
        // Enter required data for the appointment
        int ReservationNum = AdminDeleteReservation()-1;
        for (int i = 0; i < DataHolder.ReservationsArray.size(); i++) {
            if(i == ReservationNum){
                System.out.println((i + 1) + "- " + DataHolder.ReservationsArray.get(i).toString() +
                        " reservation is deleted");
                
                DataHolder.ReservationsArray.remove(i);
                return;
            }
        }
        System.out.println("wrong number");
        System.out.println("--------------------------");
        System.out.println();
    }
}
