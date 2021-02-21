package math;
/**
 * 
 * @author Suvosree Chatterjee
 *
 */

public class TestComplex {

	   public static void main(String[] args) {
	       //Creating the two Complex numbers class objects
	       Complex w1=new Complex(3,4);
	       Complex w2=new Complex(6,8);
	      
	       //Displaying the two complex numbers
	       System.out.println("Complex Number#1: "+w1.toString());
	       System.out.println("\nComplex Number#2: "+w2.toString());
	      
	       //Adding two complex numbers by calling the add() method on the Complex Class object
	       Complex z1=w1.add(w2);
	       System.out.println("\nAddition of "+w1.toString()+" and "+w2.toString()+" is "+z1.toString());
	      
	       //Subtracting two complex numbers by calling the sub() method on the Complex Class object
	       Complex z2=w1.sub(w2);
	       System.out.println("\nSubtraction of "+w1.toString()+" and "+w2.toString()+" is "+z2.toString());
	      
	       //Multiplying two complex numbers by calling the mult() method on the Complex Class object
	       Complex z3=w1.mult(w2);
	       System.out.println("\nMultiplication of "+w1.toString()+" and "+w2.toString()+" is "+z3.toString());
	      
	      
	       //Dividing two complex numbers by calling the div() method on the Complex Class object
	       Complex z4=w1.div(w2);
	       System.out.println("\nDivision of "+w1.toString()+" and "+w2.toString()+" is "+z4.toString());
	      
	       //finding the conjugate of a complex number by calling conjugate() method on the Complex Class object
	       Complex z5=w1.conjugate();
	       System.out.println("\nThe conjugate of "+w1.toString()+" is "+z5.toString());
	       Complex z6=w2.conjugate();
	       System.out.println("\nThe conjugate of "+w2.toString()+" is "+z6.toString());
	      
	       Complex z7=new Complex(3,4);
	       System.out.println("\nComplex Number#9 :"+z7.toString());
	       
	       //Checking whether the two complex numbers are equal or not
	       Boolean bool=z7.equals(w1);
	       if(bool)
	           System.out.println("The two complex numbers "+w1.toString()+" and "+z7.toString()+" are equal");
	       else
	           System.out.println("The two complex numbers "+z1.toString()+" and "+z7.toString()+" are not equal");
	      

	   }

	}
