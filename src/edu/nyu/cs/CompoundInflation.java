package edu.nyu.cs;

import java.util.Scanner;

/**
 * This question is inspired by Question 2-13 in Liang's Intro to Java textbook and current economic events.
 * 
 * Complete this program such that it:
 *  - prompts the user to enter an amount the user adds to their savings account each month
 *  - (use the Scanner class's nextLine() function to get user input as a String)
 *  - displays the equivalent value of the account, in today's dollars, after the sixth month of savings mixed with heavy inflation
 *  - (note that today's dollars are worth more than future dollars, since dollars lose their purchasing power each month by the monthly inflation rate)
 *
 * Assume the following:
 *  - a 10% annual inflation rate 
 *  - (i.e. the value of each dollar decreases every month at a monthly rate of 0.10/12 = 0.008333333333333)
 *  - use (int) Math.round(someNumberWithDecimalPlaces) to round all displayed numbers to the nearest dollar... do not output any decimal places.
 *  - assume the user will enter a valid number with or without a decimal place... don't worry about handling any other type of user input
 * 
 * Sample output, including example user input. Your program should format the output exactly like this: 
 *  Please enter your monthly savings rate: 120
 *  If you save $120 per month with 10% annual inflation, after 6 months, your account will hold an amount equivalent to $114 today.
 */
 public class CompoundInflation {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter your monthly savings rate: ");
        String response = scn.nextLine();
        double month0 = Double.parseDouble(response);
        int month0Nice = (int) Math.round(month0);
        // calculate value after 6 months
        double month1 = month0 * (1 - 0.10/12);
        double month2 = month1 * (1 - 0.10/12);
        double month3 = month2 * (1 - 0.10/12);
        double month4 = month3 * (1 - 0.10/12);
        double month5 = month4 * (1 - 0.10/12);
        double month6 = month5 * (1 - 0.10/12);
        int month6Nice = (int) Math.round(month6);
        // output the result
        System.out.println("If you save $" + month0Nice + " per month with 10% annual inflation, after 6 months, your account will hold an amount equivalent to $" + month6Nice + " today.");
    }
}
