package chapter5.reflection;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.reflect.*;

public class ReflectionTest {
    public static void main(String[] args)
    throws ReflectiveOperationException {
        // read class name from command line args or user input
        String name;
        if (args.length > 0) name = args[0];
        else {
            var in = new Scanner(System.in);
            System.out.println("Enter class name ( e.g. java.util.Date)");
            name = in.next();
        }
        // print class name and superclass name ( if!= Object)
        Class cl = Class.forName(name);
        Class supercl = cl.getSuperclass();
        String modifiers = Modifier.toString(cl.getModifiers());
        if (modifiers.length() > 0) System.out.println(modifiers + " ");
        System.out.println("class" + name);
        if (supercl != null && supercl != Object.class) System.out.println(" the name is => " + supercl.getName());

        System.out.println("\n{\n");
        printConstructors(cl);
        System.out.println();
        printMethods(cl);
        System.out.println();
        printFields(cl);
        System.out.println("}");

        /** print all the constructors of a aclass
         * @param cl a class
         */
    }
        public static void printConstructors(Class cl)
        {
            Constructor[] constructors = cl.getDeclaredConstructors();
            for (Constructor c : constructors)
            {
                String name = c.getName();
                System.out.println("    ");
                String modifiers = Modifier.toString(c.getModifiers());
                if (modifiers.length() > 0 ) System.out.println(modifiers + " ");
                System.out.println(name + "(");
            }
        }
        /**
         * Print all methods of a class
         * @param cl a class
         */
    public static void printMethods(Class cl)
        {
            Method[] methods = cl.getDeclaredMethods();
            for (Method m : methods)
            {
                Class retType = m.getReturnType();
                String name = m.getName();

                System.out.println("   ");
                // print modifiers, return type and method name
                String modifiers = Modifier.toString(m.getModifiers());
                if (modifiers.length() > 0 ) System.out.println(modifiers + "   ");
                System.out.println(retType.getName() + " " + name + "(");

                // print parameter types
                Class [] paramTypes = m.getParameterTypes();
                for ( int j = 0 ; j < paramTypes.length; j++)
                {
                    if ( j > 0) System.out.println(", ");
                    System.out.println(paramTypes[j].getName());
                }
                System.out.println(");");
            }
        }

        /**
         * Print all fields of a class
         * @param cl a class
         */
        public static void printFields(Class cl)
        {
            Field[] fields = cl.getDeclaredFields();

            for (Field f : fields)
            {
                Class type = f.getType();
            String name = f.getName();
            System.out.println("   ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length() > 0) System.out.println(modifiers + "hello ");
            System.out.println(type.getName() + " " + name + ";");

        }
        }
    }
