import java.util.Random;

public class TossCoin {
	 public String chanceFunc() {
	      Random r = new Random();
	      int chance = r.nextInt(2);
	      if (chance == 1) {
	    	     System.out.println(" Tails");

	         return"tails";
	      } else {
	    	     System.out.println(" Heads");

	         return"heads";
	      }
	   }

	
public static void main(String[] args) {
	TossCoin t = new TossCoin();
     int heads = 0;
     int tails = 0;
     int chances = 10;
     for (int i = 1; i<= chances; i++) {
        if (t.chanceFunc().equals("tails")) {
           tails++;
        } else {
           heads++;
        }
     }
     System.out.println("Chances = " + chances);
     System.out.println("Heads: " + heads + "%");
     System.out.println("Tails: " + tails + "%");
  }

}

