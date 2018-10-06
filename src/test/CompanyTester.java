package test;

import main.employee.Company;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


/** Contains JUnit tests for class Company */
public class CompanyTester {

    @Test
    public void testSortBySalary() {
        Company c = new Company();
        c.addEmployee("Ackers", 5005.0);
        c.addEmployee("Zhang", 5020.0);
        c.addEmployee("Drovyanko", 5000.0);
        c.addEmployee("Evinsky", 4900.0);
        c.addEmployee("Bailey", 5022.0);
        c.sortBySalary();
        String res = c.toString();
        System.out.println(res);
        String expected = "[Evinsky 4900.0, Drovyanko 5000.0, Ackers 5005.0, Zhang 5020.0, Bailey 5022.0]";
        //System.out.println(c.toString());
        assertTrue("Employees are not sorted correctly", expected.equals(res));
    }

    @Test
    public void testSortBySalary2() {
        Company c = new Company();
        c.addEmployee("A", 100.0);
        c.addEmployee("B", 99.0);
        c.addEmployee("C", 80.0);
        c.addEmployee("D", 40.0);
        c.addEmployee("E", 90.0);
        c.addEmployee("F", 60.0);
        c.addEmployee("G", 200.0);
        c.addEmployee("H", 75.0);

        c.sortBySalary();
        String res = c.toString();
        System.out.println(res);
        String expected = "[D 40.0, F 60.0, H 75.0, C 80.0, E 90.0, B 99.0, A 100.0, G 200.0]";
        //System.out.println(c.toString());
        assertTrue("Employees are not sorted correctly", expected.equals(res));
    }

}
