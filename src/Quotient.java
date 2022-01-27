
import java.util.Scanner;
public class Quotient {
	
	static void UserInterAction() {
		
		System.out.println("===============User Interaction ===========");
		Scanner sc = new Scanner(System.in); 
	
		System.out.println("Now Working on this User Inputs");
		
		System.out.print("Enter The Dividend :- ");  
		int dividend = sc.nextInt();  

		
		System.out.print("Enter The Divisor :- ");  
		int divisor = sc.nextInt();  
		
		int quotient = dividend/divisor;
		System.out.println("The Quotient of "+ dividend +" and "+ divisor + " is  "+quotient);
		
		int remainder =  dividend % divisor;
		System.out.println("The Remainder  of "+ dividend +" and "+ divisor + " is  "+remainder);

	}

	public static void main(String[] args) {

		 int dividend = 10 ;
		 int divisor  = 5;
	     int remainder;
		 int quotient ;

	
		quotient = dividend / divisor;
		
		System.out.println("The Dividend is : " + dividend);
		System.out.println("The Divisor is : " + divisor);
		System.out.println("The Quotient of "+ dividend +"a nd "+ divisor + " is  "+quotient);

		
		remainder = dividend % divisor;
		System.out.println("The Remainder  of "+ dividend +"a nd "+ divisor + " is  "+remainder);
		
		UserInterAction();

	}
}
