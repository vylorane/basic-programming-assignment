package edu.nyu.cs;

import java.util.Scanner;

/**
 * This question is based on Question 1-11 in Liang's Intro to Java textbook.
 * 
 * The U.S. Census Bureau projects population based on the following assumptions:
 *  - One birth every 7 seconds
 *  - One death every 13 seconds
 *  - One new immigrant every 45 seconds
 * 
 * This program can project the population for any year in the future.
 *
 * Complete this program such that it:
 *  - asks the user for how many years into the future they want to see the projected population
 *  - displays the projected population for each year, from the current year until the number of years in the future that the user entered.
 * 
 * You must complete and use the given functions in your solution.
 */
public class PopulationProjector {

    /**
     * The main function is automatically called first in a Java program.
     * Do not modify this function... rather complete the code in the other functions such that this function outputs the correct result.
     * 
     * @param args An array of any command-line arguments.  Java requires the main function include this, even if not used.
     * @throws Exception Allows us to not worry about Exceptions in this function. Java requires the main functino include this, even if not used.
     */
    public static void main(String[] args) throws Exception {

        int years = getYearsFromUser(); // get the number of years into the future to project
        displayProjections(years);

    }

    /**
     * Asks the user to enter the number of years into the future for which they would like population projections.
     * Assume the user responds with just an integer.
     * Notes:
     *  - use the Integer.parseInt(someString) function to convert a String to an integer.
     * @return The number of years, as an int
     */
    public static int getYearsFromUser() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Number of years: ");
        String response = scn.nextLine();
        int years = Integer.parseInt(response);
        return years;
    }

    /**
     * Displays the projections for each year, starting from the current year, up until the numbe of years in the future specified by the argument.
     * This function must call and use the returned result of the getProjectionForYear() function for each year in the projections.
     * Assume the following:
     *    - current U.S. population is 334,091,832
     *    - one birth every 7 seconds
     *    - one death every 13 seconds
     *    - one new immigrant every 45 seconds
     * 
     * For each year, this function must display a line of text in the following format (numbers displayed here are placeholder only and are not the corect projections):
     *    Year 2022 - 334091832
     *    Year 2023 - 360227313
     *    Year 2024 - 382164552
     *    etc...
     * 
     * @param years How many years into the future to make population projections
     */
    public static void displayProjections(int years) {
        int currentYear = 2022;
        for (int year = currentYear; year <= currentYear + years; year++) {
            int projection = getProjectionForYear(year);
            System.out.println(year + " - " + projection);
        }
    }

    /**
     * Calculates the projected U.S. population for a given year.
     * @param year The year for which to calculate the projected population
     * @return The projected population for the given year, as an int
     */
    public static int getProjectionForYear(int year) {

    }

}
