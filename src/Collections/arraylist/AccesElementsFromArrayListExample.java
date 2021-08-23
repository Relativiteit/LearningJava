package Collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AccesElementsFromArrayListExample {
    public static void main(String [] args)
    {
        List<String> topProgrammingLanguages = new ArrayList<>();

        System.out.println("Is the list empty " + topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("Go");
        topProgrammingLanguages.add("Javascript");
        // print size of arrayList
        System.out.println("Here are the top " +topProgrammingLanguages.size()+ " in the world!");

        // Retrieve the element at a given index
        String bestProgrammingLang = topProgrammingLanguages.get(1);
        System.out.println("best programming lang in the world is " + bestProgrammingLang);

        // modifying elements in the given index

        topProgrammingLanguages.set(4, "pascal");
        System.out.println(topProgrammingLanguages);




    }
}
