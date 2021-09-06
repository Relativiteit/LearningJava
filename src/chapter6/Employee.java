package chapter6;
import java.util.*;

public class Employee implements Comparable<Employee> {
    private String name;
    private double salary;

    public Employee(String name, double salaryu) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    /**
     * Compares employees by salary
     *
     * @param other another Employee object
     * @return a negative value if thixs employee has a lower salary
     * otherObject,0 if the salaries are the same, a positive value
     */

    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary);
    }
}


