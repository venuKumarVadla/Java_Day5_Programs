
public class SwappingNumbers {

	public static void main(String[] args) {

		String  myName = "VenuKumar";
		System.out.println(" This is My Name Characters Count :"+ myName.length());
		
		/* Letter Swapping*/
		
		myName = "Venu";
		
		String firstLetter = "V";
		String secondLetter = "E";
		String thirdLetter = "N";
		String fourthLetter = "U";
		
				firstLetter = fourthLetter;
				secondLetter = thirdLetter;
				thirdLetter = secondLetter;
				fourthLetter = firstLetter;
				
		System.out.println(firstLetter + secondLetter + thirdLetter + fourthLetter);
				
			String fName = "Venu";
	        String lName = "Kumar";
	 
	        System.out.println(fName+"" + lName);
	 
	        String newName = fName;
	        fName = lName;
	        lName = newName;
	 
	        System.out.printf("After Swapping," + fName + lName);
	        
	        /*Swapping Numbers*/
	        
	        String firstNumber = "390";
	        String secondNumber = "555";
	        
	        System.out.println("Before Swapping :" + "First Number :" + firstNumber + "  Second Number :"+ secondNumber);
	        
	        	String swap = firstNumber;
	        	firstNumber = secondNumber;
	        	secondNumber = swap;
	     System.out.println("After Swapping :" + "First Number :" + firstNumber + "  Second Number :"+ secondNumber);

	        	
	        	
	    }
		
	}


