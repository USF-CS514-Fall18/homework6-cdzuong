package main.employee;

import java.util.*;

/** Represents a company that has employees */
public class Company {
    private List<Employee> employees; // a list of employees

    /** Constructor for class Company */
    public Company() {
        employees = new ArrayList<>();
    }

    /**
     * Adds an main.employee with the given name and salary
     * @param name name
     * @param salary salary
     */
    public void addEmployee(String name, double salary) {
        // FILL IN CODE

    }

    /** Sorts employees by salary in ascending order.
     *  You are allowed to use Collections.sort method
     */
    public void sortBySalary() {
        // FILL IN CODE

    }

    /**
     * Returns employees in a string
     * @return string
     */
    public String toString() {
        return employees.toString();
    }

}
