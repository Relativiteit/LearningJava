package collections.hashset;
// enhanced for loop
// basic for loop
// basic while loop
// for each
// streaming + foreach() + lambda

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteration {
    public static void main(String[] args) {
        {
            Set<String> icecream = new HashSet<>();

            icecream.add("vanilla");
            icecream.add("chocolate");
            icecream.add("strawberry");
            icecream.add("mint");
            icecream.add("caramel");
            icecream.add("pistachio");

            System.out.println(icecream);

            // enhanced for loop
            for(String flavor:icecream){
                System.out.println(flavor);

            }

            // basic for loop
            /*for(int i = 0; i=<icecream.size(); i++){
                // System.out.println(icecream[i]); can't do that in set only arrays
                System.out.println(icecream.get());
             */

            // basic for loop
            for(Iterator<String> iterator = icecream.iterator(); iterator.hasNext();)
            {String flavor = (String) iterator.next();
                System.out.println("flavors of the month => " + flavor);
            }
            // basic while loop
            Iterator<String> iterator = icecream.iterator();
            while(iterator.hasNext()){
                String flavor = (String) iterator.next();
                System.out.println("while => " + flavor);

            }

            // foreach
            icecream.forEach( flavor -> System.out.println("foreach => " + flavor));

            // streaming + foreach() + lambda
            icecream.stream().filter(flavor -> !"mint".equals(flavor))
                    .forEach(flavor-> System.out.println("Stream+forEach+Lambda => " + flavor));


    }
}};
