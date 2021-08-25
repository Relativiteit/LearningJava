package collections.linkedlist;

import java.util.LinkedList;

// how to get the first element in the LInkedList
// get the last element in the LinkedList
//  get the elemnt at a give index in the LInkedLIst
// get all the elements from LinkedList
public class RetrieveLinkedListExample {
    public static void main(String[] args)
    {
        LinkedList<String> bikes = new LinkedList<>();
        bikes.add("Trek");
        bikes.add("Canyon");
        bikes.add("Giant");
        bikes.add("Cervello");
        bikes.add("Specialized");

        // get first element
        String firstelement = bikes.getFirst();
        System.out.println(firstelement);

        // get last element
        String lastelement = bikes.getLast();
        System.out.println(lastelement);

        // get element at index
        String indexelement = bikes.get(2);
        System.out.println(indexelement);

        // get all elements for each
        for(String bike:bikes){
            System.out.println(bike);
        }
    }
}
