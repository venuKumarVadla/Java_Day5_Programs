
import java.util.Scanner;

public class Vowel_Consonant {
	private static Scanner sc;
	
	public static void main(String[] args) {
		
		
		char letter = 'a';
		
		if((letter == 'a') || (letter == 'e') ||(letter == 'i') ||(letter == 'o') ||(letter == 'u')) {
			System.out.println("This is VOWEL");
		}else {
			
			System.out.println("This is CONSONANT");

		}
		sc = new Scanner(System.in); 

		
		System.out.print("Enter a letter :- ");  
		
        char let = sc.next().charAt(0);

        System.out.println("given Character is = "+ let);
        
        
       
        
        if((let == 'a') || (let == 'e') ||(let == 'i') ||(let == 'o') ||(let == 'u')) {
        	
			System.out.println("This is VOWEL");
			
		}else {
			
			System.out.println("This is CONSONANT");

		}
		
		
	}
	

}
