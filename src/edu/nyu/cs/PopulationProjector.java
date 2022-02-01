package edu.nyu.cs;

import java.util.Scanner;

/**
 * This question is based on Question 1-11 in Liang's Intro to Java textbook.
 * 
 * Complete this program such that it:
 *  - calculates and displays the projected population for each of the next five years.
 *
 * The U.S. Census Bureau projects population based on the following assumptions:
 *  - Current population: 332,403,650
 *  - Each year has 365 days
 *  - One birth every 7 seconds
 *  - One death every 13 seconds
 *  - One new immigrant every 45 seconds
 * 
 * Hint:
 *  - There are no fractional people.  All population projections must be integers.
 *  - In Java, if two integers perform division, the result is an integer - the fractional part is truncated.  
 *  - To get an accurate result, one of the values in the division must be a number with a decimal place.
 * 
 * Sample output.  The numbers are placeholder only and are not correct.  
 * Your program should format the output exactly like this: 
 *  Here are the projected population numbers for the next five years:
 *  - Year 2023: 333505890
 *  - Year 2024: 345678825 
 *  - Year 2025: 358766234 
 *  - Year 2026: 365805245 
 *  - Year 2027: 373925136 
 */
public class PopulationProjector {

    /**
     * The main function is automatically called first in a Java program.
     * Complete the assignment within this function.
     * 
     * @param args An array of any command-line arguments.  Java requires the main function include this, even if not used.
     * @throws Exception Allows us to not worry about Exceptions in this function. Java requires the main functino include this, even if not used.
     */
    public static void main(String[] args) throws Exception {
        double year0 = 332403650; // current population
        double birthsPerYear = (1.0 / 7) * 60 * 60 * 24 * 365; // one every 7 seconds
        double deathsPerYear = (1.0 / 13) * 60 * 60 * 24 * 365; // one every 13 seconds
        double immigrantsPerYear = (1.0 / 45) * 60 * 60 * 24 * 365; // one every 45 seconds
        // System.out.println("Births per year: " + birthsPerYear);
        // System.out.println("Deaths per year: " + deathsPerYear);
        // System.out.println("Immigrants per year: " + immigrantsPerYear);

        int year1 = (int) (year0 + birthsPerYear + immigrantsPerYear - deathsPerYear);
        int year2 = (int) (year1 + birthsPerYear + immigrantsPerYear - deathsPerYear);
        int year3 = (int) (year2 + birthsPerYear + immigrantsPerYear - deathsPerYear);
        int year4 = (int) (year3 + birthsPerYear + immigrantsPerYear - deathsPerYear);
        int year5 = (int) (year4 + birthsPerYear + immigrantsPerYear - deathsPerYear);

        System.out.println("Here are the projected population numbers for the next five years:");
        System.out.println("- Year 2023: " + year1);
        System.out.println("- Year 2024: " + year2);
        System.out.println("- Year 2025: " + year3);
        System.out.println("- Year 2026: " + year4);
        System.out.println("- Year 2027: " + year5);
    }


}
