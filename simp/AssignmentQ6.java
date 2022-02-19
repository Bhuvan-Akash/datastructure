package simp;
import java.util.Scanner;
public class AssignmentQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String sp=" ";
        System.out.println("Enter the UserId");
        String uname = sc.nextLine();
        

       System.out.println("Enter the Password");
        String upass = sc.nextLine();
         

        

        System.out.println("Enter the Username");
        String lname = sc.nextLine();
        System.out.println("Enter the Password");
        String lpass = sc.nextLine();

        if(uname.equals(lname) && upass.equals(lpass)){
            System.out.println("Welcome "+lname );
        }
        else{
            System.out.println("You have entered wrong credentials ,please enter the right credentials.");
        }
    }
}
	 
