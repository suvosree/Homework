package Q4;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class CashRegister {
	
	NumberFormat formatter = NumberFormat.getCurrencyInstance();
	
	  double result(String product_name,double unit_price,double quantity,double pay){
		 
		 double total_pay=0;
		 pay = (quantity) * (unit_price) ;
		
		total_pay = total_pay+pay;
		return total_pay;
		
		
		//List<String> output = new ArrayList<String>();
		
		//String result = product_name +"\t"+quantity +"\t"+formatter.format( Double.parseDouble(unit_price))+"\t"+formatter.format(total_pay);
		
	
		
		
		
		
	 }
}
