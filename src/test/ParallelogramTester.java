package test;

import main.shapes.Parallelogram;
import main.shapes.Shape2D;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** Contains JUnit tests for area and perimeter methods of class Parallelogram */
public class ParallelogramTester {
    public static final double EPS = 0.001;

    @Test
    public void testParallelogramArea() {
        Shape2D shape1 = new Parallelogram(1.5, 3.2, 1.57);
        double area = shape1.area();
        System.out.println(area);
        double expected = 4.799;
        double comp = Math.abs(expected - area);
        assertTrue("Parallelogram's area() method is incorrect", comp < EPS);
    }
    
    @Test
    public void testParallelogramPerimeter() {
        Shape2D shape1 = new Parallelogram(1.5, 3.2, 1.57);
        double perimeter = shape1.perimeter();
        System.out.println(perimeter);
        double expected = 9.4;
        double comp = Math.abs(expected - perimeter);
        assertTrue("Parallelogram's perimeter() method is incorrect", comp < EPS);
    }
}
