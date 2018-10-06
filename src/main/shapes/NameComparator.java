package main.shapes;

import java.util.Comparator;

/** Compares two Shape2D variables based on the name.*/
public class NameComparator implements Comparator<Shape2D>{

	/** Compares main.shapes based on the name of the class they belong two.
	 *  "Circle" is less than "Parallelogram" because "C" comes before "P".
	 *  Hint 1:  Use getClass().getSimpleName() to get the name of the shape.
	 *  Hint 2:  You may use compareTo method from class String to compare names.
	 *
	 * @param shape1 first shape
	 * @param shape2 second shape
	 * @return the result of comparing the names alphabetically
	 *
	 */
	@Override
	public int compare(Shape2D shape1, Shape2D shape2) {
		// FILL IN CODE

		return 0; // change

	}

}
