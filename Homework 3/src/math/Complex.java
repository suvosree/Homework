package math;

/**
 * 
 * @author Suvosree Chatterjee
 *
 */
public class Complex {
		//Declaration of variables
	    private double x,y;
	    //parameterized constructor taking real and imaginary part
	    public Complex(double x,double y) {
	    	this.x=x;
	    	this.y=y;
  }
	    //parameterized constructor taking only the real part
	    public Complex(double x) {
	    	this.x=x;
	    	this.y=0;
 }
	    //Zero argumented constructor
	    public Complex() {
	    	this.x = 0;
	    	this.y = 0;
}

	    //Getters
	    public double getX() {
	    	return x;
	    }

	    public double getY() {
	    	return y;
	    }
	    /* This method will add the two complex numbers
	     * return a Complex number class object
	     */
	    public Complex add(Complex w) {
	    	Complex z = new Complex();
	    	z.x = this.x + w.x;
	    	z.y = this.y + w.y;
	    	return z;
	    }
 
	    /* This method will subtract the two complex numbers
	     * return a Complex number class object
	     */ 
	    public Complex sub(Complex w) {
	    	Complex z = new Complex();
	    	z.x = this.x - w.x;
	    	z.y = this.y - w.y;
	    	return z;
	    }
    
	    /* This method will find the conjugate of a complex number
	     * return a Complex number class object
	     */
     
	    public Complex conjugate() {
	    	Complex z = new Complex();
	    	z.x = this.x;
	    	z.y = -(this.y);
	    	return z;
	    }
         /* This method will multiply the two complex numbers
          * return a Complex number class object
          */
          
          public Complex mult(Complex w) {
               Complex z = new Complex();
               z.x = this.x * w.x;
               z.y = this.y * w.y;
               return z;
         }
          
           /* This method will divide the two complex numbers
            * return a Complex number class object
            */
           
           public Complex div(Complex w) {
               double denominator=Math.pow(w.mod(),2);
               return new Complex((x*w.getX()+y*w.getY())/denominator,(y*w.getX()-x*w.getY())/denominator);
           }


            public double mod() {
            	if (x!=0 || y!=0) {
            		return Math.sqrt(x*x+y*y);
            	} 
            	else {
            		return 0.0;
            	}
            }
             
            
            //This method will check whether the two complex numbers are equal or not
            
            public boolean equals(Complex w) {
                 if (this.x == w.getX() && this.y == w.getY())
                     return true;
                 else
                     return false;
            }
            
            
            
            /*
             * toString() method is used to display the contents of an object inside it
             */
             @Override
             
             
             public String toString() {

            	 if (getX() == 0)
            		 return getY() + "i";
            	 else if (getY() == 0)
            		 return getX() + "";

            	 else if (getY() < 0)
            		 return x + "-" + (-y) + "i";
            	 else
            		 return x + "+" + y + "i";

             }
}