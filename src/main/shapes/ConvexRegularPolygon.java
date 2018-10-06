package main.shapes;

/** Represents a convex regular polygon. A child class of Shape2D */
public class ConvexRegularPolygon extends Shape2D {
	private int numSides; // the number of sides
	private double side; // the length of the side
	// You may *not* add any other instance variables to this class

	/** Constructor for class Shape2D
	 *
	 * @param numSides number of sides
	 * @param side length of each side
	 */
	public ConvexRegularPolygon(int numSides, double side) {
		// FILL IN CODE

	}

	/** Overrides the area method of Shape2D.
	 * Returns the area of the convex regular polygon.
	 * Use formula from https://en.wikipedia.org/wiki/Regular_polygon#Area

	 * @return area
	 */
	@Override
	public double area() {
		// FILL IN CODE

		return 0; // change
	}

	/** Overrides the perimeter method of Shape2D .
	 *  Returns the perimeter of the convex regular polygon
	 *
	 * @return perimeter (numSides * side)
	 */
	@Override
	public double perimeter() {
		// FILL IN CODE

		return 0; // change

	}
}
