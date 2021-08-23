package Collections.interfaces;

import java.util.ArrayList;
import java.util.Collection;

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

        bikeCollection.

    }
}
