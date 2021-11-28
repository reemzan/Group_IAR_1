package ReservationSystem;

import static ReservationSystem.Horse_Riding_Reservation.AdminAddReservation;

public class Admin extends User {


    // Constructor to create an admin object
    public Admin(String username, String password, String email, long phonenum) {
        super(username, password, email, phonenum);
    }

    @Override
    public void ShowMenu(int AdminChoice){
        switch (AdminChoice) {
                            // Redirect admin depends on the entered value
                            case 1:
                            //    AddReservation(adminChoice);
                                AddReservation();
                                break;
                            case 2:

                                break;
                            case 3:

                                break;
                            case 4:
                                return;

                            default:
                                System.out.println();
                                // Show error message if admin entered a value other than 1-4
                                System.out.println("Wrong input try again");
                                break;
                        }
        
    }
    

    public void MessageloginConfirm() {
        
        
                    System.out.println("");
                    System.out.println("You have logged in succefully");
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

}