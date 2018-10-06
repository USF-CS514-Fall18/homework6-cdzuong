package main.shapes;

import java.text.DecimalFormat;

/** An abstract class Shape2D. Represents a generic 2D shape.
 * A direct parent of Circle, Parallelogram and ConvexRegularPolygon.
 * Do not modify this class.
 */
public abstract class Shape2D {
	protected final DecimalFormat df = new DecimalFormat("#.00");
    // You may *not* add any other instance variables to this class

	/**
	 * An abstract method for computing the area or the surface area of the
	 * shape.
	 *
	 * @return area of the shape
	 */
	public abstract double area();


	/** An abstract method for computing the perimeter of the shape.
	 *
	 * @return perimeter of the shape
	 */

	public abstract double perimeter();

	/**
	 * Returns a string representation of the shape. Contains the name of the shape,
	 * then one tab, then the area of the shape (formatted so that it only shows
	 * two digits after the decimal point), one tab and perimeter
	 *
	 * @return String
	 */
	@Override
	public String toString() {
		String formattedName = this.getClass().getSimpleName() + "\t" +
				df.format(area()) + "\t" + df.format(perimeter());
		return formattedName;
	}
	
}

