package chapter4;


import java.time.LocalDate;
import java.util.Arrays;
// class encapsulation you don't leak the property of the class
public class EmployeeTest {
    public static void main(String[] args) // make a program that excepts main arguments
        { // fill the staff array with three Employee objects
           WorkerBee[] staff = new WorkerBee[3];
            staff[0] = new WorkerBee("Carl Cracker", 75000, 1987, 12, 15);
            staff[1] = new WorkerBee("Harry Dracker", 50000, 1989, 10, 1);
            staff[2] = new WorkerBee("Tony Tester", 75000, 1987, 12, 15);

           // Employee goat = new Employee("Goat", 250000, 0001, 1, 1); // error

            // raise everyone's salary by 5 % use for each loop
            System.out.println(Arrays.asList(staff));
            // use streams to print out the staff members, it can be a 'one liner'

            for (WorkerBee e: staff)
                 e.raiseSalary(5);
             //print out information about all Employee objects
            for (WorkerBee e: staff) {
                System.out.println("name=" + e.getName() + ",salary="  + e.getSalary() + e.getHireDay());
            }
            // salary after applyiing raise
            for (WorkerBee e: staff) {
                e.raiseSalary(7);
            System.out.println("Salary after the reforms will be " + e.getSalary());
            // extra enhandced loop in employee for hireday
            for(WorkerBee d: staff){
                d.getHireDay();
                System.out.println("date" + d.getHireDay());
            }

        }
        }
    }


    class Employee
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
