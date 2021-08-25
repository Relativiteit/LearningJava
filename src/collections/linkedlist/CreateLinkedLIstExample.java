package collections.linkedlist;

import java.util.LinkedList;

// add()
// add(2, element)
// addFirst()
// addLast()
public class CreateLinkedLIstExample {
    public static void main(String[] args)
    {
        LinkedList<String> goats = new LinkedList<>();
        goats.add("Hank");
        goats.add("Cherry");
        goats.add("Kevin");
        goats.add("Abuella");

        System.out.println("Initial linkedlist -> " + goats);

        // adding an element at the specified position in the LInkedLInst
        goats.add(2, "Fairy");
        System.out.println("After adding fairy the super goat "+goats);

        // adding an element at the beginning of the LinkedList
        goats.addFirst("Smeagle");
        System.out.println(goats);

        // adding an element at the end of the LinkedList
        goats.addLast("Mordor");
        System.out.println(goats);



    }
}
