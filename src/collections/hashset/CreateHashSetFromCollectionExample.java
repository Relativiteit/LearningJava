package collections.hashset;

// create HashSet from another collection HashSet(Collection c) constructor
// add all the elements from a collection to the HashSet using addALl() method

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateHashSetFromCollectionExample {
    public static void main(String[] args) {
        {
            // first five numbers
           // Set<Integer> firstEvenNUmbers = new HashSet<>();
            List<Integer> firstEvenNUmbers = new ArrayList<>();  // can use a list into HashSet()
            firstEvenNUmbers.add(2);
            firstEvenNUmbers.add(4);
            firstEvenNUmbers.add(6);
            firstEvenNUmbers.add(8);
            firstEvenNUmbers.add(10);

            // create HashSet from another collection HashSet(Collection c) constructor
            Set<Integer> tenEvenNumbers = new HashSet<>(firstEvenNUmbers);
            System.out.println(tenEvenNumbers);

            Set<Integer> nextFiveNumbers = new HashSet<>();
            nextFiveNumbers.add(12);
            nextFiveNumbers.add(14);
            nextFiveNumbers.add(16);
            nextFiveNumbers.add(18);
            nextFiveNumbers.add(20);

            System.out.println(nextFiveNumbers);
            // add all the elements from a collection to the HashSet using addALl() method
            tenEvenNumbers.addAll(nextFiveNumbers);
            System.out.println(tenEvenNumbers);







        }
    }
}
