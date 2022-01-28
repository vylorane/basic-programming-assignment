// DO NOT TOUCH THIS FILE!
package edu.nyu.cs;

// import junit 4 testing framework
import org.junit.Test;
import org.junit.Rule;
import static org.junit.Assert.*;
import org.junit.contrib.java.lang.system.SystemOutRule; // system rules lib - useful for capturing system output

public class AppTest {

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule();

    @Test
    public void testMain() {
        systemOutRule.enableLog(); // start capturing System.out
        String[] args = {};
        try {
            App.main(args);
            String actual = systemOutRule.getLog();
            String expected = "Hello world!";
            assertEquals(expected, actual);
        }
        catch (Exception e) {
            assert false; // fail the test if any exception occurs
        }

    }

}
