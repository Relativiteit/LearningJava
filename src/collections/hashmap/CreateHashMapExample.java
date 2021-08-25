package collections.hashmap;

import java.util.*;

// add keyvalue
// check if empty
public class CreateHashMapExample {

    public static void main(String[] args) {
        Map<String, Integer> numberMapping = new HashMap<>();
        // add keyvalue
        numberMapping.put("one", 1);
        numberMapping.put("two", 2);
        numberMapping.put("three", 3);
        numberMapping.put("four", 4);
        numberMapping.put("five", 5);
        numberMapping.put("six", 6);

        System.out.println(numberMapping);
        // adding null keys
        numberMapping.put(null, 7);
        System.out.println(numberMapping);
       /* can only add 1 null key
        numberMapping.put(null, 8);
        System.out.println(numberMapping); */

        // check if empty
        System.out.println(numberMapping.isEmpty());

        // Find size of a Hashmap
        System.out.println(numberMapping.size());

        // Check if a key exists in the HashMap
        if(numberMapping.containsKey("four")){
            System.out.println("exits");
        }else{
            System.out.println("Does not exists");
        }

        // Check if a value exists in the HashMap
        if(numberMapping.containsValue(4)){
            System.out.println("numbers is available");
        }else{
            System.out.println("Numbers is not available");
        }

        // get value by key
        Integer v1 = numberMapping.get("one");
        // String stringV1 =numberMapping.get("one"); not possible
        System.out.println(v1);
        // System.out.println(stringV1);


        // remove a keys from the HashMap
        numberMapping.remove("one");
        System.out.println(numberMapping);

        // get only keys from HashMap use set because keys can't be duplicates
        Set<String> keys =  numberMapping.keySet();
        System.out.println(keys);

        // get only values from HashMap
        Collection<Integer> valuesInNumbers = numberMapping.values();
        System.out.println(valuesInNumbers);


        // iteration over hashmap
        // For each
        for(Map.Entry<String, Integer> sheep: numberMapping.entrySet()){
            System.out.println("key => " + sheep.getKey() + " Value => " + sheep.getValue());

        }

        // using iterator
        Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key -> " + entry.getKey() + "value -> "+ entry.getValue());

            // forEach
           numberMapping.forEach((K, V)-> {
                System.out.printf("K " +K);
                System.out.println(" V" +V);
            });


        }





    }
}
