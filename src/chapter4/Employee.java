// an employee class
package chapter4;
import java.time.LocalDate;

class Employee {
    // instance field
    private String name;
    private double salary;
    private LocalDate hireDay;

    //constructor
    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    //   methods that are called in EmployeeTest
    @Override
    public String toString() {
        return (name + " " + salary + " " + hireDay);

    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void raiseSalaryHigher(double byMargin) {
        double extra = (salary * byMargin)/100;
                salary += extra;
    }}


    /* public void changeYear(int i) {
        LocalDate loyal = hireDay;
        loyal = hireDay.append.loyal.plusDays(i);
    }
}
*/

