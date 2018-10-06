package test;

import main.shapes.*;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** Contains JUnit tests for area and perimeter methods of class Circle */
public class CircleTester {
    public static final double EPS = 0.001;

    @Test
    public void testCircleArea() {
        Shape2D shape1 = new Circle(1.5);
        double area = shape1.area();
        System.out.println(area);
        double expected = 7.0685;
        double comp = Math.abs(expected - area);
        assertTrue("Circle's area() method is incorrect", comp < EPS);
    }

    @Test
    public void testCirclePerimeter() {
        Shape2D shape1 = new Circle(4.5);
        double perimeter = shape1.perimeter();
        System.out.println(perimeter);
        double expected = 28.2743;
        double comp = Math.abs(expected - perimeter);
        assertTrue("Circle's perimeter() method is incorrect", comp < EPS);
    }
}
