package firsttwochapters;

import java.util.*;

public class Retirement2 {

    public static void main(String[] args){

    Scanner in = new Scanner(System.in);

        System.out.print("How much money will you contribute every year");
    double payment = in.nextDouble();

        System.out.print("interest rate in %:");
    double interestRate = in.nextDouble();

    double balance = 0;
    int year = 0;

    String input;

    //update account balance while user isn't ready to retire
    do {
        // add this years's payment and interest
        balance += payment;
        double interest = balance * interestRate / 100;
        balance += interest;

        year++;
        // print current balance
        System.out.print("Ready to retire? (Y/N)");

    }
        while (in.equals("Y"));

    }
}
