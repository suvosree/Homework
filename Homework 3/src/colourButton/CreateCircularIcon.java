package colourButton;
/**
 * @author Suvosree Chatterjee
 */
		import java.awt.Color;

		import java.awt.Component;

		import java.awt.Graphics;

		import java.awt.Graphics2D;

		import java.awt.geom.Ellipse2D;

		import javax.swing.Icon;

		//Define the class CreateCircularIcon implementing the

		//Icon interface.

		public class CreateCircularIcon implements Icon

		{

		     //Declare required private member variables.

		     private int circle_size;

		     private Color circle_color;

		    

		     //Define the constructor of the class.

		     public CreateCircularIcon(int size)

		     {

		          //Initialize the private member variables.

		          circle_size = size;

		          circle_color = Color.RED;

		     }

		    
 @Override
//Define the overridden method paintIcon() having

 //required values as parameters of the function.

		 public void paintIcon(Component com, Graphics gr,int x_coordinate, int y_coordinate)

		     {

		          //Store the Graphics class object type casted

		          //into Graphics2D to the object of the class

		          //Graphics2D.

		          Graphics2D gar2D = (Graphics2D)gr;

		         

		          //Create an object of the class Ellipse2D and

		          //pass the required values.

		          Ellipse2D.Double my_circle = new

		          Ellipse2D.Double(x_coordinate, y_coordinate,circle_size, circle_size);

		         

		          //Set the color of the shape.

		          gar2D.setColor(circle_color);

		         

		          //Call the fill() function by passing the

		          //my_circle object.

		          gar2D.fill(my_circle);

		     }

		    

		     //Define the method fillPaint() having a string

		     //parameter.

		     public void fillPaint(String str)

		     {

		          //If the string is red, then assign Color.RED

		          //to the variable circle_color.

		          if(str == "RED")

		          {

		               circle_color = Color.RED;

		          }

		         

		          //If the string is green, then assign

		          //Color.GREEN to the variable circle_color.

		          else if(str == "GREEN")

		          {

		               circle_color = Color.GREEN;

		          }

		         

		          //If the string is blue, then assign

		          //Color.BLUE to the variable circle_color.

		          else if(str == "BLUE")

		          {

		               circle_color = Color.BLUE;

		          }

		     }

		    

		     @Override

		     //Define the overridden method getIconHeight() and

		     //return the circle_size.

		     public int getIconHeight()

		     {

		          return circle_size;

		     }

		    

		     @Override

		     //Define the overridden method getIconHeight() and

		     //return the circle_size.

		     public int getIconWidth()

		     {

		   
		          return circle_size;

		     }

		
	}


