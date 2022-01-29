package edu.nyu.cs;

import java.util.Scanner;

/**
 * This question is based on Question 1-10 in Liang's Intro to Java textbook.
 * 
 * Complete this program such that it:
 *  - asks the user how many kilometers they have run
 *  - asks the user how many minutes it took them to run that distance
 *  - displays the average speed of the runner in miles per hour
 * 
 * You must complete and use the given functions in your solution.
 */
public class RunningSpeedCalculator {

  /**
   * The main function is automatically called first in a Java program.
   * Do not modify this function... rather complete the code in the other functions such that this function outputs the correct result.
   * 
   * @param args An array of any command-line arguments.  Java requires the main function include this, even if not used.
   * @throws Exception Allows us to not worry about Exceptions in this function. Java requires the main functino include this, even if not used.
   */
  public static void main(String[] args) throws Exception {

    double distanceInKilometers = getDistanceInKmFromUser(); // get the distance the user ran, in km
    double timeInMinutes = getTimeInMinutesFromUser(); // get the time the user ran, in minutes
    double avgSpeedInMilesPerHour = getAverageSpeedInMilesPerHour(distanceInKilometers, timeInMinutes); // get the speed in miles per hour
    System.out.println("Your average speed was " + avgSpeedInMilesPerHour + " miles per hour."); // display the speed

  }

  /**
   * Asks the user to enter the distance they have run, in kilometers.
   * Assume the user responds with just a number, either a simple integer or a floating point number.
   * Notes:
   *  - use the Double.parseDouble(someString) function to convert a String to a double
   * @return The distance run, in kilometers, as a double.
   */
  public static double getDistanceInKmFromUser() {
    Scanner scn = new Scanner(System.in);
    System.out.println("Please enter the distance you ran, in km: ");
    String response = scn.nextLine();
    double distanceInKilometers = Double.parseDouble(response);
    return distanceInKilometers;
  }

  /**
   * Asks the user to enter how long it took them to run, in minutes.
   * Assume the user responds with just a number, either a simple integer or a floating point number.
   * Notes:
   *  - use the Double.parseDouble(someString) function to convert a String to a double
   * @return The duration of the run, in minutes, as a double.
   */
  public static double getTimeInMinutesFromUser() {
    Scanner scn = new Scanner(System.in);
    System.out.println("How long did it take you, in minutes? ");
    String response = scn.nextLine();
    double timeInMinutes = Double.parseDouble(response);
    return timeInMinutes;
  }

  /**
   * Calculate's the user's average speed, in miles per hour.
   * @param distanceInKilometers The distance the user ran, in kilometers.
   * @param timeInMinutes The time in minutes it took the user to run that distance.
   * @return The user's average speed, in miles per hour, as a double  (note that 1 mile is 1.6 kilometers.)
   */
  public static double getAverageSpeedInMilesPerHour(double distanceInKilometers, double timeInMinutes) {
    double distanceInMiles = distanceInKilometers / 1.6; // convert to miles
    double timeInHours = timeInMinutes / 60; // convert to hours
    double avgSpeed = distanceInMiles / timeInHours;
    return avgSpeed;
  }

}
