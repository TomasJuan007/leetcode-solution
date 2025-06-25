/**
 * Leetcode - s0003_length_of_longest_substring
 */
package com.leetcode.s300_longest_increasing_subsequence;

// basic util

import com.ciaoshen.leetcode.helper.PropertyScanner;
import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

// leetcode-helper library
// junit
// log4j
// slf4j


/**
 * In most case you DO NOT NEED TO CHANGE ANYTHING in this class.
 */
public class TesterRunner {

    // use this Object to print the log (call from slf4j facade)
    private static final Logger LOGGER = LoggerFactory.getLogger(TesterRunner.class);
    // both log4j and slf4j are included in leetcode-helper.jar
    private static final String LOG4J = "log4j.properties";

    public static void main(String[] args) {
        // use log4j as Logger implementation
        Properties log4jProps = PropertyScanner.load(LOG4J); // PropertyScanner load "log4j.properties" for us
        PropertyConfigurator.configure(log4jProps);

        // run Tester.class
        Result result = JUnitCore.runClasses(Tester.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure);
        }
        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Pass all JUnit test? {}", result.wasSuccessful());
        }
    }

}
