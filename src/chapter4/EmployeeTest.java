package chapter4;
import java.time.*;
import java.util.Arrays;
// class encapsulation you don't leak the property of the class
public class EmployeeTest {
    public static void main(String[] args) // make a program that excepts main arguments
        { // fill the staff array with three Employee objects
            Employee[] staff = new Employee[3];
            staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);
            staff[1] = new Employee("Harry Dracker", 50000, 1989, 10, 1);
            staff[2] = new Employee("Tony Tester", 75000, 1987, 12, 15);

            // raise everyone's salary by 5 % use for each loop
            System.out.println(Arrays.asList(staff));
            // use streams to print out the staff members, it can be a 'one liner'

            for (Employee e: staff)
                 e.raiseSalary(5);
             //print out information about all Employee objects
            for (Employee e: staff) {
                System.out.println("name=" + e.getName() + ",salary="  + e.getSalary() + e.getHireDay());
            }

            for (Employee e: staff) {
                e.raiseSalaryHigher(7);
            System.out.println("Salary after the reforms will be " + e.getSalary());

            for (Employee d: staff) {
                e.changeDay(4);
                System.out.println("Extra years " + d.getHireDay());
            }

        }
        }
    }

   /* class Employee
    {
        private String name;
        private double salary;
        private LocalDate hireDay;

        public Employee(String n, double s, int year, int month, int day)
        {
            name = n;
            salary = s;
            hireDay = LocalDate.of(year, month, day);}
        public String getName() {return name;}
        public double getSalary() {return salary;}
        public LocalDate getHireDay() {return hireDay;}
        public void raiseSalary(double byPercent) {
            double raise = salary * byPercent / 100;
            salary += raise;}

    }
*/