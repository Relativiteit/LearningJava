package collections.arraylist;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class DifferentWaysToIterateOverList {
    public static void main(String[] args)
    {
        List<String> courses = Arrays.asList("C", "C++", "Java", "Python", "GO");

        // courses.stream().forEach(System.out::println); for each loop
        // basic for loop
        for(int i = 0; i < courses.size(); i++)
        {
            System.out.println(courses.get(i));
    }
        // enhanced for loop
        for(String course : courses) {
            System.out.println(course);
        }

        // basic loop with iterator
        for(Iterator iterator = courses.iterator(); iterator.hasNext();)
        {
            String course = (String) iterator.next();
            System.out.println(course);
        }

        // iterator with while loop
        Iterator<String> iterator = courses.iterator();
        while(iterator.hasNext()) {
            String course = (String) iterator.next();
            System.out.println(course);
        }

        // java 8 stream + lambda
        courses.stream().forEach(course -> System.out.println(course));

        // java 8 foreach + lambda
        courses.forEach((course) -> System.out.println(course));

    }
}
