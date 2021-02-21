

public class Complex {
   // Declaring variables
   private double x, y;

   //Parameterized constructor
   public Complex(double x, double y) {
       super();
       this.x = x;
       this.y = y;
   }

   //One argumented constructor
   public Complex(double x) {
       super();
       this.x = x;
       this.y = 0;
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
   public Complex add(Complex c) {
       Complex comp = new Complex();
       comp.x = this.x + c.x;
       comp.y = this.y + c.y;
       return comp;
   }

   /* This method will subtract the two complex numbers
   * return a Complex number class object
   */
   public Complex sub(Complex c) {
       Complex comp = new Complex();
       comp.x = this.x - c.x;
       comp.y = this.y - c.y;
       return comp;
   }

   /* This method will multiply the two complex numbers
   * return a Complex number class object
   */
   public Complex mult(Complex c) {
       Complex comp = new Complex();
       comp.x = this.x * c.x;
       comp.y = this.y * c.y;
       return comp;
   }

   /* This method will divide the two complex numbers
   * return a Complex number class object
   */
   public Complex div(Complex c) {
       double denominator=Math.pow(c.mod(),2);
   return new Complex((x*c.getX()+y*c.getY())/denominator,(y*c.getX()-x*c.getY())/denominator);
      
   }
public double mod() {
if (x!=0 || y!=0) {
return Math.sqrt(x*x+y*y);
} else {
return 0.0;
}
}

   /* This method will find the conjugate of a complex number
   * return a Complex number class object
   */
   public Complex conjugate() {
       Complex comp = new Complex();
       comp.x = this.x;
       comp.y = -(this.y);
       return comp;
   }

   //This method will check whether the two complex numbers are equal or not
   public boolean equals(Complex c) {
       if (this.x == c.getX() && this.y == c.getY())
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