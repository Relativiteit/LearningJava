package collections.hashset;

import java.util.HashSet;
import java.util.Set;

// create a hashset using the HashSet() constructor
public class CreateHashSetExample {
    public static void main(String[] args)
    {


        // create a hashset using the HashSet() constructor
        Set<String> dogs = new HashSet<>();


        // add new elements using add()

        dogs.add("labrador");
        dogs.add("bordercollie");
        dogs.add("pitbull");
        dogs.add("doberman");
        dogs.add("Daschhund");
        dogs.add("pug");

        // unordered collection
        System.out.println(dogs);

        // can't contain duplicates
        dogs.add("pug");
        System.out.println(dogs);


    }
}
