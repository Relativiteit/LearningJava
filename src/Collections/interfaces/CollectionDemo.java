package Collections.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDemo {
    public static void main(String[] args)
    {
        Collection<String> bikeCollection = new ArrayList<>();
        bikeCollection.add("HondaVT750");
        bikeCollection.add("SuzukiSV650");
        bikeCollection.add("YamahaMT07");
        System.out.println(bikeCollection);

        bikeCollection.remove("HondaVT750");
        System.out.println(bikeCollection);
        // you can see the available API syntax: collection name.

        bikeCollection.forEach((element) -> {
            System.out.println(element);
        });
        bikeCollection.stream().iterator();


        System.out.println(bikeCollection);
        // print size of array
        System.out.println(bikeCollection.size());
        // to array wrapped in arrays to string method
        System.out.println(Arrays.toString(bikeCollection.stream().toArray()));

        System.out.println(bikeCollection.isEmpty());
        bikeCollection.clear();
        System.out.println(bikeCollection.isEmpty());
        System.out.println(bikeCollection);



    }
}
