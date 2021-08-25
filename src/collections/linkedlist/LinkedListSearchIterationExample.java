package collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
// check if in list
// first occurrence
// last occurrence
// iterator
// for each
// for each advance loop
// simple loop

public class LinkedListSearchIterationExample {

    public static void main(String[] args) {
        LinkedList<String> sauce = new LinkedList<>();

        sauce.add("ketchup");
        sauce.add("mustard");
        sauce.add("mayonaise");
        sauce.add("bbq");
        sauce.add("cocktail");
        sauce.add("sate");

        // check if element is in list

        boolean sate = sauce.contains("sate");

        System.out.println(sate);

        // first  occurrence
        int index = sauce.indexOf("bbq");
        System.out.println(index);

        // find last occurrence
        sauce.add(4,"cocktail");
        int lastindex = sauce.lastIndexOf("cocktail");
        System.out.println(lastindex);

        // iterator
        Iterator<String> iterator = sauce.iterator();
        while (iterator.hasNext()) {
            String drink = (String) iterator.next();
            System.out.println("iterator "+ drink);

        }
        // for each
        sauce.forEach((drink) -> {
            System.out.println("forEach lambda " + drink);

        });

        // for each advance loop
        for(String drink: sauce) {
            System.out.println("advanced " + drink);
        }
        // simple loop not pretty ...
        for(int i=0; i< sauce.size(); i++){
            System.out.println("simple loop " + sauce.get(i));

        }

    }
}
