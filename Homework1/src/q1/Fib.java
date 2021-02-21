package q1;

import java.util.InputMismatchException;
import java.util.Scanner;

/** 
 * @author Suvosree Chatterjee
 * Class Fib expects F(0) an integer value & F(1) an integer value as argument while creating an object.
 * These F(0) & F(1) value will be used generate Fibonacci series based on formula F(n) = F(n-1) + F(n-2)
 * Method int f(int n) will generate Fibonacci series using an iterative algorithm.
 * Method int fRec(int n) will generate Fibonacci series using an recursive algorithm.
 */
public class Fib {
	int f0;
	int f1;

/**
* Constructor to initialize F[0] & F[1] values with values passed during object creation.
*/
	Fib(int f0, int f1){
		this.f0 = f0;
		this.f1 = f1;
		
	}
	


/**
 * Function to calculate fibonacci series using the iterative method
 * @param n: 'n' is nth iteration of fibonacci series
 */
	public int f(int n) {
		if (n<0) {
			throw new IllegalArgumentException("Negative numbers are not allowed");
		}else {
			int ppNum, pNum = f0, cNum = f1;

	        for (int i = 1; i <= n ; i++) {

	            ppNum = pNum;

	            pNum = cNum;

	            cNum = ppNum + pNum;
	            System.out.print(ppNum + " ");

	        }
	        return cNum;
		}
		
	}
	
/**
 * Function to calculate fibonacci series using the recursive method
 * @param n: 'n' is nth iteration of fibonacci series
 * @return individual values of fibonacci series
 */
	public int fRec(int n) {
		if (n<0) {
			throw new IllegalArgumentException("Negative numbers are not allowed");
		}else {
			if (n == 0) {

	            return f0;

	        } else if (n == 1) {
	        	
	            return f1;
	        }   
	     return fRec(n - 1) + fRec(n - 2);
		}
	}	
	
	public static void main(String[] args) {
		int f0 = 0;
		int f1 = 0;
		int n = 0;
		
		try {
			
			Scanner in = new Scanner(System.in);
			System.out.println("Please enter first number: ");
		    f0 = in.nextInt();
		    System.out.println("Please enter second number: ");
		    f1 = in.nextInt();
		    System.out.println("Please enter how many times want to print: ");
		    n = in.nextInt();
		    System.out.println("Provided values: first number: " + f0 + " second number " + f1 +
		    		" how many times want to print: " + n);
		    in.close();
		}
		catch(InputMismatchException e) {
			System.out.println("Inavlid value !!! Terminated");
			
		}
		try {
			Fib fibIta = new Fib(f0, f1);
			System.out.println("*********************Via Iterative method***************** ");
			fibIta.f(n);
		}catch(IllegalArgumentException e){
			System.out.println(e);
		}
		try {
			
			Fib fibRec = new Fib(f0, f1);
			System.out.println(" ");
			System.out.println("*********************Via Recursive method***************** ");
			for(int i = 0; i < n; i++){
				System.out.print(fibRec.fRec(i) +" ");
			}
		
		}catch(IllegalArgumentException e){
			System.out.println(e);
		}

	}
}