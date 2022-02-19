package simp;
import java.util.Scanner;
public class AssignmentQ5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

    
            System.out.print("Enter your income: ");
            double inc = sc.nextDouble();
            double tax;
            if(inc<=180000)
            {
                tax=0;
            }
            else if((inc>180000)&&(inc<=300000))
            {
                tax = (inc-180000)*0.1;
            }
            else if((inc>300000)&&(inc<=500000))
            {
                tax = (inc-300000)*0.2;
                tax += 34000;
            }
            else 
            {
                tax = (inc-500000)*0.3;
                tax += 94000;
            }
            
            
            System.out.println("\nIncome Tax is INR "+tax);
        }
    

    
		// TODO Auto-generated method stub

	}


