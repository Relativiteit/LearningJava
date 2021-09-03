package chapter5.arrayList;

import chapter5.inheritance.WorkerEmployee;

import java.util.*;

/**
 * This program demonstrates the ArrayLIst class.
 * @verison 1.11 2012-01-26
 * @author Cay Horstmann
 */
public class ArrayListTest {
    public static void main(String[] args)
    {
        // fill the staff array list with three Employee objects
        var staff = new ArrayList<WorkerEmployee>();

        staff.add(new WorkerEmployee("Carl Cracker", 75000, 1987, 12, 15));
        staff.add(new WorkerEmployee("Harry Hacker", 50000, 1989, 10, 1));
        staff.add(new WorkerEmployee("Tony Tester", 40000, 1990, 3, 15));

        // raise everyone's salary by 5%
        for (WorkerEmployee e:staff)
            e.raiseSalary(5);

        // print out information about all Employee objects
        for (WorkerEmployee e:staff)
            System.out.println("name= " + e.getName() + ",salary=" + e.getSalary() + "day=" + e.getHireDay());
    }
}
