

import java.util.Scanner;  

public class PowerOfTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		
		System.out.print("Enter The Base Number :- ");  
		int baseNumber = sc.nextInt();  

		
		System.out.print("Enter The Power :- ");  
		int power = sc.nextInt();  

				
	    long result = 1;

	    
	    for (int i =1 ; i <= power; i++){
	    	
	    	
	    	result = result * baseNumber;
	    }
	    

	    System.out.println("Answer = " + result);
	  }
		
	}


