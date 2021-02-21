package q3;

import java.util.*;
import java.io.*;

public class DataAnalyzerTester {

	public static void main(String[] args) {
		LinkedList<Integer> numLinkedList = new LinkedList<Integer>();
		boolean goodToContinue = false;
		String fileName="";
		Scanner in = new Scanner(System.in);
		String numList="";
		
		try {
			System.out.println("Enter the numbers seperated by comma ',' : ");
			numList = in.nextLine();
			System.out.println("Please give the filename where you want to save data  : ");
			fileName= in.nextLine();
		}catch(InputMismatchException e) {
			System.out.println("Inavlid value !!! Terminated");
			
		}
		
		try {
		      File myObj = new File(fileName);
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		        
		        goodToContinue = true;
		   			
		      } else {
		        System.out.println("File already exists. Program will override ok ? Y/N !!!!");
		        String decision = in.next();
		        
		        if(decision.equals("Y")) {
		        	goodToContinue = true;
		        }else {
		        	System.out.println("Program terminating !!!!");
		        }
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.Program terminating !!!!");
		      e.printStackTrace();
		    }
		
		if(goodToContinue) {
			
			try {
				FileWriter myWriter = new FileWriter(fileName);
			    myWriter.write(numList);
			    
			    myWriter.close();
			}
			catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
			
			String[] numString = numList.split("[,]");
			int holdValue = 0;
			for (int i = 0; i < numString.length; i++) {
				holdValue = Integer.parseInt(numString[i]);
				numLinkedList.addLast(holdValue);
			}
			
			DataAnalyzer analyzer = new DataAnalyzer(numLinkedList);
			System.out.println("Min value     : " + analyzer.min());
			System.out.println("Max value     : " + analyzer.max());
			System.out.println("Average value : " + analyzer.average());
			try {
				
				
				BufferedWriter writer = new BufferedWriter(
				       new FileWriter(fileName, true));
				writer.write("\r\nMin value     : " + analyzer.min());
				writer.write("\r\nMax value     : " + analyzer.max());
				writer.write("\r\nAverage value : " + analyzer.average());
			    
				writer.close();
			}
			catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }	
		
		}
		
		in.close();
		
	}

}
