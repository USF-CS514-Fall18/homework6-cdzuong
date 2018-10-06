package test;

import main.employee.Employee;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/** Contains JUnit tests for testing class Employee  */
public class EmployeeTester {

    @Test
    public void testCompareToCase1() {
        Employee emp1 = new Employee("Alice", 5000.0);
        Employee emp2 = new Employee("Bob", 4800.0);
        int comparison = emp1.compareTo(emp2);
        assertTrue("Employees are not compared correctly", comparison > 0);
    }

    @Test
    public void testCompareToCase2() {
        Employee emp1 = new Employee("Alice", 5000.05);
        Employee emp2 = new Employee("Bob", 5000.05);
        int comparison = emp1.compareTo(emp2);
        assertTrue("Employees are not compared correctly", comparison == 0);
    }

    @Test
    public void testCompareToCase3() {
        Employee emp1 = new Employee("Alice", 5000.0);
        Employee emp2 = new Employee("Bob", 5010.0);
        int comparison = emp1.compareTo(emp2);
        assertTrue("Employees are not compared correctly", comparison < 0);
    }

    @Test
    public void testToString() {
        Employee emp1 = new Employee("Alice", 5000.0);
        String expected = "Alice 5000.0";
        String res = emp1.toString();
        //System.out.println(res);
        assertTrue("Employee's toString method is incorrect", expected.equals(res));
    }
}
