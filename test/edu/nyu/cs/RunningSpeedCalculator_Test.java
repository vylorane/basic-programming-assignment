// DO NOT TOUCH THIS FILE!
package edu.nyu.cs;

// import junit 4 testing framework
import org.junit.Test;
import org.junit.Rule;
import static org.junit.Assert.*;
import org.junit.contrib.java.lang.system.SystemOutRule; // system rules lib - useful for capturing system output
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;
// import static org.mockito.Mockito.*;

public class RunningSpeedCalculator_Test {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule();

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();

    @Test
    public void testGetDistanceInKmFromUser() {
        systemInMock.provideLines("10", "20.5"); // sample input
        double[] expecteds = {10, 20.5}; // expected return values, given the input
        double delta = 0.1;

        // iterate through each expected value and check the expected return value
        for (double expected : expecteds) {  
            double actual = RunningSpeedCalculator.getDistanceInKmFromUser();
            assertEquals(expected, actual, delta);
        }
    }

    @Test
    public void testGetTimeInMinutesFromUser() {
        systemInMock.provideLines("10", "20", "15.75");
        double[] expecteds = {10, 20, 15.75}; // expected return values, given the input
        double delta = 0.1;

        // iterate through each expected value and check the expected return value
        for (double expected : expecteds) {
            double actual = RunningSpeedCalculator.getTimeInMinutesFromUser();
            assertEquals(expected, actual, delta);
        }
    }

    @Test
    public void testGetAverageSpeedInMilesPerHour() {
        // check that the function returns the correct speed in miles per hour, given the distance in km and time in minutes
        double[][] mockInputs = {
            {10, 200},
            {20.5, 375.2},
            {15.75, 37.6}
        };
        double[] expecteds = {
            1.875,
            2.05,
            15.71
        };
        double delta = 1;
        int i = 0;
        for (double[] mockInput : mockInputs) {
            double actual = RunningSpeedCalculator.getAverageSpeedInMilesPerHour(mockInput[0], mockInput[1]);
            assertEquals(expecteds[i], actual, delta);
            i++;
        }


    }

}
