

import java.util.Scanner;

public class Even_Odd_Numbers {
	private static Scanner sc;


	public static void main(String[] args) {

		sc = new Scanner(System.in);		
		System.out.println("Please Enter any Number: ");
		int number = sc.nextInt();
		
		if(number %2 == 0) {
			System.out.format("%d is a Even Number", number);
			
			
		}else {
			System.out.format("%d is a Odd Number", number);

			
		}
		
		
	}

}
