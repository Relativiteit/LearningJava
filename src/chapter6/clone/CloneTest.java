package chapter6.clone;

/**
 * This program demonstrates cloning
 * @author Alejo Cain
 */
public class CloneTest {
    public static void main(String[] args)
        throws CloneNotSupportedException
    {
        var original = new Employee("John o.  Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("Original= " + original);
        System.out.println("copy= " + copy );

    }
}
