package collections.interfaces;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args )
    {
        List<String> list = new ArrayList<>();
        // List allows duplicates
     /*   list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element2");

        // List allows null elements
        list.add(null);

        System.out.println(list);
*/
        // insertion order
        list.add("element1");
        list.add("element2");
        list.add("element4");
        list.add("element3");
        list.add("element5");
        System.out.println(list);

        // get elements from list using indexes
        System.out.println(list.get(0));
        System.out.println(list.get(2));

    }
}
