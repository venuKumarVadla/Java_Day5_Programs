

import java.util.Scanner;  

public class LeapYear {
	
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);  

		

System.out.println("Enter Year : - ");  
int year = sc.nextInt();  

		if (year%4 == 0) {
			System.out.println("This is a leap Year");

		}else {
			System.out.println("This is a not a leap Year");
		}
	}

}
