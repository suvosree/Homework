package Q4;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 
 * @author suvosree chatterjee
 * calculating total amount that user needs to pay
 */
public class Grades {
	public static void main(String[] args) {
		
// taking input from user
		
		Scanner sc = new Scanner(System.in);
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		List<String> output = new ArrayList<String>();
		double total_pay = 0;
		String done = "y";
		
//variable created to calculate amount payable
		
		while(done.equalsIgnoreCase("y")){
			System.out.println("Items Name: ");
			String product_name = sc.nextLine();
			System.out.println("Price: ");
			String unit_price = sc.nextLine();
			System.out.println("Quantity: ");
			String quantity = sc.nextLine();
			System.out.println("Do want to add more Items ?[Y/N] ");
			done = sc.nextLine();
			Double pay = Double.parseDouble(quantity)* Double.parseDouble(unit_price) ;
			total_pay = total_pay+pay;
			String result = product_name +"\t"+quantity +"\t"+formatter.format( Double.parseDouble(unit_price))+"\t"+formatter.format(pay);
			output.add(result);
		}
		
		System.out.println("Name\tQuantiyt\tunitPrice\tTotal");
		
		for(String line : output){
			System.out.println(line);
		}
		
//final receipt displaying
		String subtotal = "Subtotal"+"\t\t\t"+formatter.format(total_pay);
		System.out.println(subtotal);	  
}
 }
