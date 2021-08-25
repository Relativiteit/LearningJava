package collections.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {
    public static void main(String[] args) {
        // create hashmap

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, new Student("Binu", "Badarudeen"));
        studentMap.put(2, new Student("Ravi", "Nair"));
        studentMap.put(3, new Student("Wakanda", "Forever"));
        System.out.println(studentMap); // will show the hashes

        System.out.println(studentMap.values());





    }
}
