package chapter5.reflection;
import java.util.*;

import java.lang.reflect.Array;

public class CopyOfTest {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception");
        b = (String[]) badCopyOf(b, 10);
    }
        /**
         * this method attempts to grow an array by allocating a new array
         * @param a the array to grow
         * @param newLength the new length
         * @return a larger array that contains all elements of a
         * However, array has type Object[], not the same type as a
         */

        public static Object[] badCopyOf(Object[] a, int newLength) // new
        {
            var newArray = new Object[newLength];
            System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
            return newArray;
        }

        /**
         * This method growes an array by allocating a new array of the system
         * copying all elements.
         * @param a the array to grow. this can be an object array or a type array
         * @return a larger array that contain s all elements of a.
         */
        public static Object goodCopyOf (Object a,int newLength)
        {
            Class cl = a.getClass();
            if (!cl.isArray()) return null;
            Class componentType = cl.getComponentType();
            int length = Array.getLength(a);
            Object newArray = Array.newInstance(componentType, newLength);
            System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
            return newArray;
        }
    }




