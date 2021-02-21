package q3;

import java.util.*;

/**
 * 
 * @author Suvosree Chatterjee
 * DataAnalyzer has methods to calculate min, max &  average of a sequence of numbers
 */
public class DataAnalyzer {
	LinkedList<Integer> numList = new LinkedList<Integer>();
	
	public DataAnalyzer(LinkedList<Integer> numList) {
		this.numList = numList;
	}

/**
 * Finds minimum number from a sequence of numbers 
 * @return Minimum number
 */
	public int min() {
		int minVal = numList.get(0);
		for (int i = 0; i < numList.size(); i++) {
		    if (minVal > numList.get(i)) {
		    	minVal = numList.get(i);
		    }
		}
		return minVal;
	}
	
/**
 * Finds maximum number from a sequence of numbers 	
 * @return Maximum number
 */
	public int max() {
		int maxVal = numList.get(0);
		for (int i = 0; i < numList.size(); i++) {
		    if (maxVal < numList.get(i)) {
		    	maxVal = numList.get(i);
		    }
		}
		return maxVal;
		
	}

/**
 * Calculates average from a sequence of numbers 
 * @return Average value
 */
	public double average() {
		int total = 0;
		double numAvg = 0.0;
		for (int i = 0; i < numList.size(); i++) {
		    
			total = total + numList.get(i);
		    
		}
		numAvg = (double)total/(double)numList.size();
		return numAvg;
	}
	
	

}
