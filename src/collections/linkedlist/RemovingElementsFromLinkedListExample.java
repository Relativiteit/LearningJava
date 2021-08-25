package collections.linkedlist;

// remove first
// remove last
// remove first occurrence of a given element in LinkedList
// clear LinkedList completely

import java.util.LinkedList;

public class RemovingElementsFromLinkedListExample {
    public static void main(String[] args)
    {
        LinkedList<String> bicicleta = new LinkedList<>();
        bicicleta.add("Trek");
        bicicleta.add("Canyon");
        bicicleta.add("Giant");
        bicicleta.add("Cervello");
        bicicleta.add("Specialized");

        System.out.println("initial bike list" + bicicleta );
        // remove first
        String elementfirst = bicicleta.removeFirst();
        System.out.println(bicicleta);

        // remove last
        String elementlast = bicicleta.removeLast();
        System.out.println(elementlast);

        // remove first occurance
        bicicleta.add(3,"Cervello");
        bicicleta.removeFirstOccurrence("Cervello");
        System.out.println(bicicleta);

        // clear all
        bicicleta.clear();
        System.out.println(bicicleta);



    }
}
