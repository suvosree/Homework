package math;

import static org.junit.Assert.*;

//import static org.junit.Assert.assertTrue;
//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ComplexTest {

	@Test
	
	void testequals() {
		Complex comp1= new Complex(3,4);
		Complex comp2= new Complex(3,4);
		
		boolean output=comp1.equals(comp2);
		assertTrue(output);
		
	}
	


	
	@Test
	
	void testAdd() {
	 System.out.println("run test add");
	 double a = 1, b = 2, c = -3, d = 4;
	 double e = a + c, f = b + d;
	 Complex x = new Complex(a,b);
	 Complex y = new Complex(c,d);
	 Complex w = x.add(y);
	 Complex z = new Complex(e,f);
	 // set up Complex objects
	 // test condition using the Complex equals() method:
	assertTrue(z.equals(w));
	
	 }
	
	@Test
	
	void testSub() {
		 System.out.println("run test sub");
		 double a = 1, b = 2, c = -3, d = 4;
		 double e = a - c, f = b - d;
		 Complex x = new Complex(a,b);
		 Complex y = new Complex(c,d);
		 Complex w = x.sub(y);
		 Complex z = new Complex(e,f);
		 // set up Complex objects
		 // test condition using the Complex equals() method:
		assertTrue(z.equals(w));

	}

@Test
	
	void testMult() {
		 System.out.println("run test mult");
		 double a = 1, b = 2, c = -3, d = 4;
		 double e = a * c, f = b * d;
		 Complex x = new Complex(a,b);
		 Complex y = new Complex(c,d);
		 Complex w = x.mult(y);
		 Complex z = new Complex(e,f);
		 // set up Complex objects
		 // test condition using the Complex equals() method:
		assertTrue(z.equals(w));


 	}

@Test

void testDiv() {
	 System.out.println("run test div");
	 double a = 1, b = 2, c = -3, d = 4;
	 double e = (a+c), f = (b+d);
	 double g =e/f;
	 Complex x = new Complex(e);
	 Complex y = new Complex(f);
	 Complex w = x.div(y);
	 Complex z = new Complex(g);
	 // set up Complex objects
	 // test condition using the Complex equals() method:
	assertTrue(z.equals(w));



	}

}