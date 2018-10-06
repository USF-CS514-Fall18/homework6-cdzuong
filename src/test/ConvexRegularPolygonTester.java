package test;

import main.shapes.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** Contains JUnit tests for class ConvexRegularPolygon */
public class ConvexRegularPolygonTester {
    public static final double EPS = 0.001;

    @Test
    public void testConvexRegularPolygonTesterArea() {
        Shape2D shape1 = new ConvexRegularPolygon(5, 3.2);
        double area = shape1.area();
        System.out.println(area);
        double expected = 17.617;
        double comp = Math.abs(expected - area);
        assertTrue("ConvexRegularPolygon's area() method is incorrect", comp < EPS);
    }

    @Test
    public void testConvexRegularPolygonTesterPerimeter() {
        Shape2D shape1 = new ConvexRegularPolygon(5, 3.2);
        double perimeter = shape1.perimeter();
        System.out.println(perimeter);
        double expected = 16.0;
        double comp = Math.abs(expected - perimeter);
        assertTrue("ConvexRegularPolygon's perimeter() method is incorrect", comp < EPS);
    }
}
