package main.shapes;

/** Class Circle, a child of Shape2D. */
public class Circle extends Shape2D {
	private double radius; // radius of the circle
	// You are not allowed to add any other instance variables to this class

	/**
	 * Constructor of class Circle
	 * @param radius radius
	 */
	public Circle(double radius) {
		this.radius = radius;
	}

	/** Getter for radius
	 *
	 * @return radius of the circle
	 */
	public double getRadius() {
		return radius;
	}

	/** Overrides the perimeter() method of the
	 * parent class to returns the perimeter of the circle
	 *
	 * @return perimeter
	 */
	@Override
	public double perimeter() {
		// FILL IN CODE

		return 0; // change
	}

	/** Overrides the area() method of the
	 * parent class to returns the area of the circle
	 *
	 * @return perimeter
	 */
	@Override
	public double area() {
		// FILL IN CODE

		return 0; // change
	}
	
}
