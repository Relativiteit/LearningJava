package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortList {
    public static void main(String[] args)
    {
       /* // create list
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);

        Collections.sort(list); // ascending order
        System.out.println(list);

        Collections.reverse(list); // descending order
        System.out.println(list);*/
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(10, "Binu", 35, 120000));
        employees.add(new Employee(20, "Ravi", 36, 110000));
        employees.add(new Employee(30, "Bas", 25, 55000));
        employees.add(new Employee(40, "Neville", 27, 320000));

        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getName().compareTo((o1.getName())));
            }



        });
        // lambda expression
       /* (o1, o2) -> (o2.getName().compareTo(o1.getName()));
        Collections.sort(employees, (o1, o2) -> (o2.getName().compareTo(01.getName()))); */




        Collections.sort(employees, new Mysort()); // ascending order
        System.out.println(employees);

        Collections.sort(employees, new Mysort()); // descending order
        System.out.println(employees);




       /* (o1, o2) ()->(int) (o2.getSalary()- o1.getSalary());
        Collections.sort(employees); */

    }
}


class Mysort implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

       // return (int) (o1.getSalary() - o2.getSalary()); ascending
        return (int) (o2.getSalary() - o1.getSalary()); // descending

    }
}