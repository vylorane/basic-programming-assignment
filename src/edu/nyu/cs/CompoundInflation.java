package edu.nyu.cs;

// Note that Scanner is an object; can get string, int, or line from a user
import java.util.Scanner;
import static java.lang.Math.pow;

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
 *  - use System.out.println() to output all text, not System.out.print()
 * 
 * Sample output, including example user input. Your program should format the output exactly like this: 
 *  Please enter your monthly savings rate: 
 *  120
 *  If you save $120 per month with 10% annual inflation, after 6 months, your account will hold an amount equivalent to $114 today.
 */
public class CompoundInflation {
    
    public static void main(String[] args) {
        
        // complete this function to solve the problem
        Scanner scnr = new Scanner(System.in);

        // enter savings
        System.out.println("How much do you save each month? : ");

        // savings input as a string
        String savings = scnr.nextLine();
        
        scnr.close();

        // int user input
        double principleSavings = Double.parseDouble(savings); // convert string to double 

        double rate = 0.00833;
        // double n = 12;
        double t = 6;

        // formula = principle(1-0.00833)^6

        double interest = (1-rate);
        interest = pow(interest,t);
        interest = principleSavings * interest;



        System.out.println("If you save " + principleSavings + "$ with 10% annual inflation, after six months your account will hold an amount equivalent to " + Math.round(interest) + "$ today.");
    }
}
