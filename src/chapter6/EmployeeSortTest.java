package chapter6;

import java.util.*;

/**
 * This program demonstrates thee use of the COmparable interface
 * @author Alejo Cain
 */
public class EmployeeSortTest {
    public static void main(String[] args)
    {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry Cracker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}
