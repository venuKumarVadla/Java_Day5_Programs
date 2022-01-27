
public class HarmonicNumber {


    
	static double harmonicNumber(int N)
	{	  
		
	    float n = 1;
	 
	    for (int i = 2; i <= N; i++) {
	        n += (double)1 / i;
	    }
	 
	    return n;
	}
	 
	 
	    public static void main (String[] args) {

	    int N = 9;	
	    
	    System.out.print(harmonicNumber(N));
	     
	    }
	}