package chapter3;/*
Chapter 3 Fundamental Programming Structures in Java
 */

public class CompoundInterest
{
    public static void main(String[] args) { // pass args into main class, do it in the terminal java javac ~
       System.out.println(args);
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set interest rates to 10 ... 15%
        double[] interestRate = new double[NRATES];
        for (int j = 0; j < interestRate.length; j++)
            interestRate[j] = (STARTRATE + j) / 100.0;

        double[][] balances = new double[NYEARS][NRATES];

        // set initial balances to 10000
        for (int j = 0; j < balances[0].length; j++)
        {balances[0][j] = 10000;}

        // compute interest for future years
        for (int i = 1; i < balances[i].length; i++)
        {
            for (int j = 0; j < balances[i].length; j++)
            {
                //get last years balances from previous row
                double oldBalance = balances [i-1][j];

                // compute interest
                double interest = oldBalance * interestRate[j];

                // compute this year's balances
                balances[i][j] = oldBalance + interest;

            }
            System.out.println("Inner loop finished Ravi");
        }
        // print one row of interest rates
        for (int j = 0; j < interestRate.length; j++)
            System.out.printf("%10.2f", interestRate[j]); // check regular expresions between java versions


        System.out.println();

        // print balance table enhanced for loop
        for (double[] row : balances)
        {
            // print table row enhanced for loop
            for (double b : row)
                System.out.printf("%10.2f", b);

            System.out.println();

        }
    }
}

// convert everything into for each loops
// how do you mention the steps in a for loop, how do you reverse a for each loop
// j = interesRate.lenght; j--, traversing through a colleciton in reverse
