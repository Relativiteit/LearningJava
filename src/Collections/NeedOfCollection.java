package Collections;
import java.util.*;

public class NeedOfCollection {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        int d = 30;
        int e = 30;
        int f = 30;
        int g = 30;
        int h = 30;
        int i = 30;
        int j = 30;

        int[] arArray;
        arArray = new int[10000];

        // limitations of an array
        // 1. Arrays are fixed in size
        // 2. Arrays can hold only homogenous data elements

        Student[] students = new Student[10];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();
        // students[0] = new Book(); Cant add to array because it's data is homogenous

        Object[] objects = new Object[10];
        objects[0] = new Student();
        objects[1] = new Student();
        objects[2] = new Book();
        // 3. Ready made APIs support is not available in array



    }
}

class Book {

}

class Student {

}

