package main.employee;

import java.lang.*;

/**
 * Class Employee.
 * Must implement Comparable<Employee> interface
 * so that employees are compared based on the salary.
 * FILL IN CODE
 */
public class Employee implements Comparable<Employee> { // Add the keyword "implements" and the interface it should implement

    public static final double EPS = 0.001;
    // FILL IN CODE: add instance variables: name of type String and
    // salary of type double
    private String name;
    private double salary;

    // Add constructor, getters, toString (that returns a string with
    // name and salary separated by comma
    // and compareTo method that compares based on salary
    public Employee(String name, double price) {
        this.name = name;
        this.salary = price;
    }

    /**
     * Returns string in the following format: name space salary:
     * Example: Jones 5002.0
     *
     * @return string representation of the main.employee
     */
    public String toString() {
        String res = this.name + " " + this.salary;
        return res;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee e) {
        if (this.salary < e.getSalary()) {
            return -1;
        } else if (this.salary == e.getSalary()) {
            return 0;
        } else {
            return 1;
        }
    }

}
