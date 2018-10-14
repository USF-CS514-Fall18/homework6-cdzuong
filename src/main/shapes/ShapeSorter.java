package main.shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * A class that stores a collection of 2D shapes, and is able to sort main.shapes based
 * on different criteria: by area, by perimeter or by name.
 * 
 * @author okarpenko
 *
 */
public class ShapeSorter {
	private List<Shape2D> shapes; // list of 2D shapes

	/** A default constructor for class ShapeSorter */
	public ShapeSorter() {
		shapes = new ArrayList<Shape2D>();
	}

	/** Adds a given shape to the list of shapes
	 *
	 * @param shape shape
	 */
	public void addShape(Shape2D shape) {
		shapes.add(shape);
	}

	/**
	 * Sort the list of Shapes
	 * @param comparator
	 *            A Comparator object that tells the method how to sort
	 *            shapes. Use Collections.sort method.
	 */
	public void sortShapes(Comparator<Shape2D> comparator) {
			Collections.sort(shapes.comparator);
	}

	/**
	 * Returns a string representation of shapes;
	 * Call toString method of each shape and add a ; after each shape
	 * Use StringBuffer.
	 * @return string representation of the shapes
	 */
	public String toString() {
		// FILL IN CODE

		return ""; // change
	}


}
