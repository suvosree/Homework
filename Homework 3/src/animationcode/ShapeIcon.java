package animationcode;

import java.awt.*;

import java.util.*;

import javax.swing.*;

/**

An icon that contains a moveable shape.
 * @param <MoveableShape>

*/

	public class ShapeIcon<MoveableShape> implements Icon{
		private int width;

		private int height;

		private MoveableShape shape;

		private ArrayList <MoveableShape> cars;

		public ShapeIcon(MoveableShape shape, int width, int height){

			this.shape = shape;

			this.width = width;

			this.height = height;

			cars = new ArrayList<MoveableShape>();
}

		public int getIconWidth()

{

			return width;

}

		public int getIconHeight()

{

			return height;

}

		public void paintIcon(Component c, Graphics g, int x, int y)
{

			Graphics2D g2 = (Graphics2D) g;

			((Graphics2D) shape).draw((Shape) g2);

}

}

