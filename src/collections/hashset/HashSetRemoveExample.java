package collections.hashset;

import java.util.HashSet;
import java.util.Set;

// remove() element
// removeAll()
// clear()
public class HashSetRemoveExample {
    public static void main(String[] args) {
        {
            Set<Integer> numbers = new HashSet<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(7);
            numbers.add(8);
            numbers.add(9);
            numbers.add(10);


            // remove() element
            boolean remove = numbers.remove(1);
            System.out.println("Result => " + remove);
            System.out.println(numbers);

            // removeAll()
            Set<Integer> evenNumbers = new HashSet<>();
            evenNumbers.add(2);
            evenNumbers.add(4);
            evenNumbers.add(6);
            evenNumbers.add(8);
            evenNumbers.add(10);
            evenNumbers.add(12);

            System.out.println(evenNumbers);
            boolean removeAll = numbers.removeAll(evenNumbers);
            System.out.println("evenNumbers are removed " + removeAll);
            System.out.println(numbers);

            // clear()
            numbers.clear();
            System.out.println(numbers);



        }
    }
}
