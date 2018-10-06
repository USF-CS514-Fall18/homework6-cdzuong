package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/** Tester file for homework 6 - will test all classes.
 *  Note: you are responsible for further testing your code.
 *  Tests are basic. Passing all tests does not mean that the code is correct. */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        RecursiveStringUtilTester.class,
        EmployeeTester.class,
        CompanyTester.class,
        CircleTester.class,
        ParallelogramTester.class,
        ConvexRegularPolygonTester.class,
        ShapeSorterTester.class
})


public class Homework6Tester {
    // Calls all other tests
}
