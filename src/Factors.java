

import java.util.Scanner;  


public class Factors {

	public static void main(String[] args) {

		System.out.println("This is a Java Factorials");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any Number :- ");  
		
		int factor = sc.nextInt();  
		int factorNumber = Math.abs(factor);

		for (int i = 1; i <= factorNumber; ++i) {

		   if (factor % i == 0) {
		        System.out.print( i + " " );
		      }
		    }
		  }
		}

