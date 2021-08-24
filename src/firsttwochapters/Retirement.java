package firsttwochapters;

import java.util.*; // import everything from util

/**
 * Retirement calculator for the dreamers who believe in retirement in 2021.
 * */


public class Retirement {
    public static void main(String[] args)
    { //read inputs
        Scanner in = new Scanner(System.in);

        System.out.print("How much money do you need to retire?");
        double goal = in.nextDouble();

        System.out.print("How much money will you contribute every year?");
        double payment= in.nextDouble();

        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();

        double balance = 0;
        double years = 0;

        //update account balance while goal isn't reached
        while (balance > goal)
        {
            // add this year's payment and interest
            balance += payment;
            double interest = balance * interestRate / 100;
            balance += interest;
            years++;

        }
        System.out.println("You can retire in " + years + " years.");
    }
}
