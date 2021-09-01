package chapter4;
import java.util.*;
import java.util.Random;

public class ConstructorTest {
    public static void main(String[] args)
    {
        var staff = new MemberInEmployment[3];

        staff[0] = new MemberInEmployment("Harry", 4000);
        staff[1] = new MemberInEmployment(60000);
        staff[2] = new MemberInEmployment();

        // print out information about all Employee objects
        for (MemberInEmployment e : staff)
            System.out.println("name= " + e.getName() + "id= " + e.getId() + "salary= " + e.getSalary());
    }
}

class MemberInEmployment
{
    private static int nextId;
    private int id;
    private String name =""; // instance field initialization
    private double salary;

    // static initialization block
    static
    {
        var generator = new Random();
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // object initialiazation block
    {
        id = nextId;
        nextId++;
    }

    // three overloaded constructors public Employee(String n, double s)
    public MemberInEmployment(String n, double s)
    {
        name = n;
        salary = s;
    }
    public MemberInEmployment(double s)
    {
        // calls the Employee(String, double) constructor
        this("Employee # " + nextId, s);
    }

    // the default constructor
    public MemberInEmployment()
    {
        // name initialized to ""--see above
        // salary not explicitly set--initialized to 0
        // id initilized in initalization block
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}