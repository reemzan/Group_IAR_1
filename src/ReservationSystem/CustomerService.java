package ReservationSystem;

import java.util.Scanner;

/**
 *
 * @author wasan
 */
public class CustomerService extends User{
    
    private String questions;
    private String answer;

    public CustomerService(String questions, String answer) {
        this.questions = questions;
        this.answer = answer;
    }
    
    public CustomerService(String username, String password, String email, long phonenum) {
        super(username, password, email, phonenum);
    }
    
        public void Message_loginConfirm() {

        System.out.println("");
        System.out.println("You have logged in succefully");
        System.out.println("--------------------------");
        System.out.println("");

    }
        
        @Override
    public void ShowMenu(int serviceChoice) {
        switch (serviceChoice) {
            // Redirect admin depends on the entered value
            case 1:
                System.out.println("--------------------------");
                System.out.println("      Add a Question      ");
                System.out.println("--------------------------");
                Addquestions();
                System.out.println("--------------------------");
                System.out.println("");
                break;
             case 2:  
                 break; 
            default:
                System.out.println();
                // Show error message if admin entered a value other than 1-4
                System.out.println("Wrong input try again");
                System.out.println("-----------------------------------");
                System.out.println("");
                break;
        }

    }
    
    public void Addquestions(){
        String output =customerservice_Add_QandA();
        String[] x = output.split(",");
        String question = x[0];
        String answer = x[1];
     

       CustomerService QandA= new CustomerService(question,answer);
       DataHolder.question_And_answerArray.add(QandA);
      
        System.out.println("");
        // Confirmation message
        System.out.println("The new  Q&A has been added : \nthe question: " + question+" \nthe answer: "+ answer);
    }

  public String customerservice_Add_QandA(){
      
        Scanner input = new Scanner(System.in);
        System.out.println("Enter question:");
        String question = input.nextLine();
        System.out.println("");
        System.out.println("Enter answer:");
        String answer = input.nextLine();
 
        return (question + "," + answer);
    }
   public String getQuestions() {
        return questions;
    }

    public String getAnswer() {
        return answer;
    }
}
