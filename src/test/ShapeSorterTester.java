package test;

import main.shapes.*;
import org.junit.Test;

import java.text.DecimalFormat;

import static org.junit.Assert.assertTrue;

/** Contains JUnit tests for shape sorter */
public class ShapeSorterTester {
    protected final DecimalFormat df = new DecimalFormat("#.00");

    @Test
    public void testAreaComparator1() {
        Shape2D shape1 = new Circle(4.5); // shape1 has larger area than shape2
        Shape2D shape2 = new Parallelogram(1.5, 7.8, 1.5);
        //System.out.println(shape1.area()  + " " + shape2.area());
        AreaComparator areaComp = new AreaComparator();
        int res = areaComp.compare(shape1, shape2);
        //System.out.println(res);
        assertTrue("AreaComparator is incorrect",res > 0);
    }

    @Test
    public void testAreaComparator2() {
        Shape2D shape1 = new ConvexRegularPolygon(4, 1); // shape1 has smaller area than shape2
        Shape2D shape2 = new Parallelogram(4.5, 7.8, 1.5);
        //System.out.println(shape1.area()  + " " + shape2.area());
        AreaComparator areaComp = new AreaComparator();
        int res = areaComp.compare(shape1, shape2);
        //System.out.println(res);
        assertTrue("AreaComparator is incorrect",res < 0);
    }

    @Test
    public void testAreaComparatorEqual() {
        Shape2D shape1 = new Circle(1.2); // shape1 has the same area as shape2
        Shape2D shape2 = new Circle(1.2);
        AreaComparator comp = new AreaComparator();
        int res = comp.compare(shape1, shape2);
        //System.out.println(res);
        assertTrue("AreaComparator is incorrect",res == 0);
    }

    @Test
    public void testPerimeterComparator1() {
        Shape2D shape1 = new ConvexRegularPolygon(4, 1); // shape1 has smaller perimeter than shape2
        Shape2D shape2 = new Parallelogram(4.5, 7.8, 1.5);
        System.out.println(shape1.perimeter()  + " " + shape2.perimeter());
        PerimeterComparator comp = new PerimeterComparator();
        int res = comp.compare(shape1, shape2);
        //System.out.println(res);
        assertTrue("PerimeterComparator is incorrect",res < 0);
    }

    @Test
    public void testPerimeterComparator2() {
        Shape2D shape1 = new ConvexRegularPolygon(4, 2.5); // shape1 has larger perimeter than shape2
        Shape2D shape2 = new Circle(1.2);
        //System.out.println(shape1.perimeter()  + " " + shape2.perimeter());
        PerimeterComparator comp = new PerimeterComparator();
        int res = comp.compare(shape1, shape2);
        //System.out.println(res);
        assertTrue("PerimeterComparator is incorrect",res > 0);
    }

    @Test
    public void testPerimeterComparatorEqual() {
        Shape2D shape1 = new Circle(1.2); // shape1 has the same perimeter as shape2
        Shape2D shape2 = new Circle(1.2);
        //System.out.println(shape1.perimeter()  + " " + shape2.perimeter());
        PerimeterComparator comp = new PerimeterComparator();
        int res = comp.compare(shape1, shape2);
        //System.out.println(res);
        assertTrue("PerimeterComparator is incorrect",res == 0);
    }

    @Test
    public void testNameComparator1() {
        Shape2D shape1 = new Circle(4.5);
        Shape2D shape2 = new Parallelogram(1.5, 7.8, 1.5);
        NameComparator comp = new NameComparator();
        int res = comp.compare(shape1, shape2);
        //System.out.println(res);
        // Circle is less than Parallelogram (alphabetically)
        assertTrue("NameComparator is incorrect",res < 0);
    }

    @Test
    public void testNameComparator2() {
        Shape2D shape1 = new Parallelogram(1.5, 7.8, 1.5);
        Shape2D shape2 = new Circle(4.5);
        NameComparator comp = new NameComparator();
        int res = comp.compare(shape1, shape2);
        //System.out.println(res);
        // Parallelogram is larger than Circle (alphabetically)
        assertTrue("NameComparator is incorrect",res > 0);
    }

    @Test
    public void testNameComparatorSameNames() {
        Shape2D shape1 = new Circle(7.8);
        Shape2D shape2 = new Circle(4.5);
        NameComparator comp = new NameComparator();
        int res = comp.compare(shape1, shape2);
        //System.out.println(res);
        // Names are the same
        assertTrue("NameComparator is incorrect", res == 0);
    }

    @Test
    public void testShapeSorterByPerimeter() {
        ShapeSorter sorter = new ShapeSorter();
        sorter.addShape(new Circle(3.8));
        sorter.addShape(new Circle(1.0));
        sorter.addShape(new Parallelogram(1.5, 7.8, 1.5));
        sorter.addShape(new ConvexRegularPolygon(4, 2.5));
        sorter.addShape(new Parallelogram(3.5, 2.5, 1.0));
        sorter.addShape(new ConvexRegularPolygon(7, 3));

        sorter.sortShapes( new PerimeterComparator());
        String res = sorter.toString().trim();
        //System.out.println(res);
        String expected1 = "Circle" + "\t" + df.format(3.14) + "\t" + df.format(6.28) +";";
        String expected2 = "ConvexRegularPolygon" + "\t" + df.format(6.25) + "\t" + df.format(10.00) +";";
        String expected3 = "Parallelogram" + "\t" + df.format(7.36) + "\t" + df.format(12.00) +";";
        String expected4 = "Parallelogram" + "\t" + df.format(11.67) + "\t" + df.format(18.60) +";";
        String expected5 = "ConvexRegularPolygon" + "\t" + df.format(32.71) + "\t" + df.format(21.00) +";";
        String expected6 = "Circle" + "\t" + df.format(45.36) + "\t" + df.format(23.88) +";";
        String expected = expected1 + System.lineSeparator() + expected2
                + System.lineSeparator() + expected3 + System.lineSeparator() + expected4 + System.lineSeparator() + expected5 +
                System.lineSeparator() + expected6;
        res = res.trim();
        //System.out.println(expected);
        /*System.out.println(res.length() + "; " + expected.length());
        for (int i = 0; i < res.length(); i++) {
            if (res.charAt(i) != expected.charAt(i))
                System.out.println(res.charAt(i));
        }
        */
        assertTrue("ShapeSorter does not correctly sort by perimeter", res.equals(expected));
    }

    @Test
    public void testShapeSorterByArea() {
        ShapeSorter sorter = new ShapeSorter();
        sorter.addShape(new Circle(3.8));
        sorter.addShape(new Circle(1.0));
        sorter.addShape(new Parallelogram(1.5, 7.8, 1));
        sorter.addShape(new ConvexRegularPolygon(4, 2.5));
        sorter.addShape(new Parallelogram(3.5, 2.5, 2.0));
        sorter.addShape(new ConvexRegularPolygon(7, 3));

        sorter.sortShapes( new AreaComparator());
        String res = sorter.toString().trim();
       // System.out.println(res);
        String expected1 = "Circle" + "\t" + df.format(3.14) + "\t" + df.format(6.28) +";";
        String expected2 = "ConvexRegularPolygon" + "\t" + df.format(6.25) + "\t" + df.format(10.00) +";";
        String expected3 = "Parallelogram" + "\t" + df.format(7.96) + "\t" + df.format(12.00) +";";
        String expected4 = "Parallelogram" + "\t" + df.format(9.85) + "\t" + df.format(18.60) +";";
        String expected5 = "ConvexRegularPolygon" + "\t" + df.format(32.71) + "\t" + df.format(21.00) +";";
        String expected6 = "Circle" + "\t" + df.format(45.36) + "\t" + df.format(23.88) +";";
        String expected = expected1 + System.lineSeparator() + expected2
                + System.lineSeparator() + expected3 + System.lineSeparator() + expected4 + System.lineSeparator() + expected5 +
                System.lineSeparator() + expected6;
        res = res.trim();
        assertTrue("ShapeSorter does not correctly sort by area", res.equals(expected));
    }

    @Test
    public void testShapeSorterByName() {
        ShapeSorter sorter = new ShapeSorter();
        sorter.addShape(new Circle(3.8));
        sorter.addShape(new Parallelogram(1.5, 7.8, 1));
        sorter.addShape(new ConvexRegularPolygon(4, 2.5));

        sorter.sortShapes( new NameComparator());
        String res = sorter.toString().trim();
        System.out.println(res);
        String expected1 = "Circle" + "\t" + df.format(45.36) + "\t" + df.format(23.88) +";";
        String expected2 = "ConvexRegularPolygon" + "\t" + df.format(6.25) + "\t" + df.format(10.00) +";";
        String expected3 = "Parallelogram" + "\t" + df.format(9.85) + "\t" + df.format(18.60) +";";
        String expected = expected1 + System.lineSeparator() + expected2
                + System.lineSeparator() + expected3;
        res = res.trim();
        assertTrue("ShapeSorter does not correctly sort by name", res.equals(expected));
    }
}
