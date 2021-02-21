package q5;

import java.util.ArrayList;
/**
 * 
 * @author Suvosree Chatterjee
 * Class has methods to calculate prime factorization
 */
public class PrimeFactorizer {
	int n = 0;
	ArrayList<Integer> primes = new ArrayList<Integer>();
	ArrayList<Integer> exponents = new ArrayList<Integer>();
	boolean alreadyCalculated;
	
	
/**
 *  
 * @param n Initialize the object with target number n.
 */
	PrimeFactorizer(int n){
		this.n = n;
		alreadyCalculated = false;
	}
	

/**
 * 
 * @return Return n, the target number.
 */
	public int getN() {
		return n;
	}
	
 
/**
 * Compute factorization. Do not repeat operation if it was called before.
 */
	public void compute() {
		if (!alreadyCalculated) {
			
			int indx = 0;
			for(int i = 2; i<= n; i++) {
		         while(n%i == 0) {
 
		            indx = primes.indexOf(i);
		            
		            if(indx<0) {
		            	primes.add(i);
		            	exponents.add(1);

		            }
		            else {
		            	int holdExponenets = exponents.get(indx);
		            	holdExponenets = holdExponenets + 1;
		            	exponents.set(indx, holdExponenets);
		            }
		            n /= i;
		            
		      }
			}
		   
		}else {
			System.out.println("Already calculated once !!!");
		}
		
	}

/**
 * Overrides target value n
 * @param n Used to override target value
 * @param primes Not sure what needs to be done, hence not used !!!
 * @param exponents Not sure what needs to be done, hence not used !!!
 */
	public void getFactorsAndExponents(int n, ArrayList<Integer> primes, ArrayList<Integer> exponents) {
		if(this.n != n) {
			alreadyCalculated = false;
		}
		this.n = n;
		if (!alreadyCalculated) {
			this.primes.clear();
			this.exponents.clear();
			compute();
		}
	  }

/**
 * Returns a string with the "pretty" representation of the prime factorization.
 * @return prime factorization string.
 */
	public String toString() {
		  String prettyRepresentation = "";
		  String exponentString = "";
		    for (int i = 0; i < primes.size(); i++) {
		    	if (exponents.get(i) > 1) {
		    		exponentString = "^" + exponents.get(i);
		    	}
		    	else {
		    		exponentString = "";
		    	}
		    	if (i < (primes.size() -1)) {
		    		prettyRepresentation = prettyRepresentation + primes.get(i) + exponentString +"*";
		    	}else {
		    		prettyRepresentation = prettyRepresentation + primes.get(i) + exponentString;
		    	}
		    	
		    	
		      }
		   
		    return prettyRepresentation;
		  }
}
	
	   
	


