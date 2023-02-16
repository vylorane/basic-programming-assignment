package edu.nyu.cs;

//import java.util.Scanner;

import java.util.ArrayList;

/**
 * This question is based on Question 1-11 in Liang's Intro to Java textbook.
 * 
 * Complete this program such that it:
 *  - calculates and displays the projected population at the end of each of year from 2023 to 2027.
 *
 * The U.S. Census Bureau projects population based on the following assumptions:
 *  - Population at the start of 2023: 332,403,650
 *  - Each year has 365 days
 *  - One birth every 7 seconds
 *  - One death every 13 seconds
 *  - One new immigrant every 45 seconds
 * 
 * Hint:
 *  - There are no fractional people.  All population projections must be integers.
 *  - In Java, if two integers perform division, the result is an integer - the fractional part is truncated.  
 *  - To get an accurate result, one of the values in the division must be a number with a decimal place.
 *  - use System.out.println() to output all text, not System.out.print()
 * 
 * Sample output. Your program should format the output exactly like this: 
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
        // complete this function to solve the problem

        int year = 2023;

        double initialPopulation = 332403650;
        double birthsPerYear = 31536000 / 7;
        double deathsPerYear = 31536000/ 13;
        double newImmigrants = 31536000 / 45;

       ArrayList<Double> populationList = new ArrayList<>(); // look up generics


        for ( int i = 0; i < 5; i++){
            initialPopulation+= Math.round(birthsPerYear);
            initialPopulation-= Math.round(deathsPerYear);
            initialPopulation+= Math.round(newImmigrants);
            populationList.add(initialPopulation);


        }

        //int populationOne = populationList get(int 0);

        System.out.println("Year " + year + ": " + Math.round(populationList.get(0)));
        System.out.println("Year " + (year+1)+ ": " + Math.round(populationList.get(1)));
        System.out.println("Year " + (year+2)+ ": " + Math.round(populationList.get(2)));
        System.out.println("Year " + (year+3)+ ": " + Math.round(populationList.get(3)));
        System.out.println("Year " + (year+4)+ ": " + Math.round(populationList.get(4)));


    }


}
