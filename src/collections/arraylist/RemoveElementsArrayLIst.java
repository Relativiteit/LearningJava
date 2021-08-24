package collections.arraylist;

import java.util.ArrayList;
import java.util.List;
// remove()
// removeALl()
// clear()
public class RemoveElementsArrayLIst {
    public static void main(String[] args)
    {
        List<String> alcohol = new ArrayList<>();

        alcohol.add("Rum");
        alcohol.add("Beer");
        alcohol.add("Nihonshu");
        alcohol.add("Whodka");
        alcohol.add("Wine");
        alcohol.add("Fermented poop");

        System.out.println(alcohol);
        // remove
        alcohol.remove(1);
        System.out.println(alcohol);

        alcohol.remove("Wine");
        System.out.println("now there are now more weird drinks " + alcohol);

        // Remove all the elemnts that exist in a given collection
        List<String> subAlcoholList = new ArrayList<>();
        subAlcoholList.add("Rum");
        subAlcoholList.add("Nihonshu");
        subAlcoholList.add("Whodka");


        alcohol.removeAll(subAlcoholList);
        System.out.println(alcohol +" is a delicacy for some people in the world " );


        alcohol.clear();
        System.out.println(alcohol);



    }
}
