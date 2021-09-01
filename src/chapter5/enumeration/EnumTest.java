package chapter5.enumeration;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class EnumTest {

    public static void main(String[] main)
    // logic down here
    {
        var in = new Scanner(System.in);
        System.out.print("enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE)");
        String input = in.next().toUpperCase();
        // System.out.println(in.next());   way to print input fast
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size= " + size);
        System.out.println("abbreviation=" + size.getAbbreviation());
        if (size == Size.EXTRA_LARGE)
            System.out.println("Good job HUlK you payed attention to the sizes.");
    }

}

enum Size
{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private Size(String abbreviation) { this.abbreviation = abbreviation;}
    public String getAbbreviation() { return abbreviation; }

    private String abbreviation;

}
