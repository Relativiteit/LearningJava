package chapter4;

public class ParamTest {
    public static void main(String[] args)
    {

        //test 1 methods can't modify numeric parameters
        System.out.println("Testing tripleValue");
        double percent = 10;
        System.out.println("before: percent=" + percent);
        tripleValue(percent);
        System.out.println("After: percent=" + percent);


        // test 2 methods can change the state of object parameters
        System.out.println("\nTesting tripleSalary");
        var harry = new EmployeeForParam("Harry", 50000);
        System.out.println("Before: salary=" + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary=" + harry.getSalary());

        // test 3 methods can' attach new objects to object parameters
        System.out.println("\nTesting swap:");
        var a = new EmployeeForParam("Alice", 70000);
        var b = new EmployeeForParam("Bob", 60000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        swap(a,b);
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());

    }
    // methods
    public static void tripleValue(double x) // doens't work
    {
        x = 3 * x;
        System.out.println("End of method: x=" + x);
    }

    public static void tripleSalary(EmployeeForParam x) // works
    {
        x.raiseSalary(200);
        System.out.println("End of method: salary=" + x.getSalary());
    }

    public static void swap(EmployeeForParam x, EmployeeForParam y)
    {
        EmployeeForParam temp = x;
        x = y;
        y = temp;
        System.out.println("End of method: x= " + x.getName());
        System.out.println("End of method: y= " + y.getName());
    }
}

class EmployeeForParam // another soul for corporate
{
    private String name;
    private double salary;
    public EmployeeForParam(String n, double s)
    {
        name= n;
        salary = s;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent /100;
        salary +=  raise;

    }
}