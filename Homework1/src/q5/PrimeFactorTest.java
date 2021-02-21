package q5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactorTest {

	public static void main(String[] args) {
		int int1 = 0;
		try {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter integer number: ");
		    int1 = in.nextInt();
		    PrimeFactorizer fact = new PrimeFactorizer(int1);
		    fact.compute();
		    System.out.println(fact.toString());
		    
		    
		    fact.getFactorsAndExponents(90, null, null);
		    System.out.println("For value 90");
		    System.out.println(fact.toString());
		    in.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Inavlid value !!! Terminated");
			
		}

	}

}
