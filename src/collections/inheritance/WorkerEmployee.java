package collections.inheritance;

import java.time.*;

public class WorkerEmployee extends Person{
    private double salary;
    private LocalDate hireDay;

    public WorkerEmployee(String name, double salary, int year, int month, int day)
    {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary()
    {
        return salary;
    }
    public LocalDate getHireDay()
    {
        return hireDay;
    }

    public String getDescription()
    {
        return String.format("and employee with a salary of ", salary);
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

}
