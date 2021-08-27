package chapter4.mainmethodsoutside;

public class StaticTest {
    public static void main(String[] args) {
        // fill the staff array with three employee objects
        var staff = new Employeeforlife[3];

        staff[0] = new Employeeforlife("Tom", 40000);
        staff[1] = new Employeeforlife("Dick", 60000);
        staff[2] = new Employeeforlife("Harry", 65000);

        // print out information about all Employee objects
        for (Employeeforlife e : staff)
        {
           e.setId();
            System.out.println("name= " + e.getName() + ", id=" + e.getId() + e.getSalary());
        }

        int n = Employeeforlife.getNextId(); // calls static method
        System.out.println("Next available id=" +n);

    }
}

class Employeeforlife
{
    private static int nextId = 1;
    private String name;
    private double salary;
    private int id;


    public Employeeforlife(String n, double s)
    {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId()
    {
        id = nextId; // set id to next available id
        nextId++;
    }

    public static int getNextId()
    {
        return nextId; // returns static field
    }

    public static void main(String[] args) {
        var e = new Employeeforlife("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());

    }
}
