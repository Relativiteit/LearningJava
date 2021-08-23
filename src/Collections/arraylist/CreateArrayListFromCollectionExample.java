package Collections.arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {
    public static void main (String[] args)
    {
        // create arrayList object
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);
        System.out.println(firstFivePrimeNumbers);

        // create array list object
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);

        // create array list object
        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        System.out.println((nextFivePrimeNumbers));
        // using addAll method to add elements of next
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println(firstTenPrimeNumbers);






    }
}
