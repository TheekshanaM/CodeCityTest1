package calculation;
import java.util.Scanner;

public class CheckEvenOdd {
	 void check()
	  {
	    int num;
	    System.out.println("Enter an Integer number:");

	    //The input provided by user is stored in num
	    Scanner input = new Scanner(System.in);
	    num = input.nextInt();
	    switch (num) {
		case 1:
			System.out.println("Entered number is even");
			break;

		case 2:
			System.out.println("Entered number is even");
			break;
		}

	    /* If number is divisible by 2 then it's an even number
	     * else odd number*/
	    try {
	    	if ( num % 2 == 0 )
		        System.out.println("Entered number is even");
		     else
		        System.out.println("Entered number is odd");
		} catch (Exception e) {
			// TODO: handle exception
		}
	    
	  } 
}
