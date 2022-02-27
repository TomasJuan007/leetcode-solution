/**
 * Leetcode - s0002_add_two_num
 */
package com.leetcode.s0002_add_two_num;

import java.util.*;
import com.ciaoshen.leetcode.util.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(Parameterized.class)
public class Tester {

    /**=========================== static for every test cases ============================== */

    // Solution instance to test
    private static Solution solution;
    // use this Object to print the log (call from slf4j facade)
    private static final Logger LOGGER = LoggerFactory.getLogger(TesterRunner.class);

    /** Execute once before any of the test methods in this class. */
    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        /* uncomment to switch solutions */
        solution = new Solution1();
        // solution = new Solution2();
    }

    /** Execute once after all of the test methods are executed in this class. */
    @AfterClass
    public static void tearDownAfterClass() throws Exception {}

    /** Initialize test cases */
    @Parameters
    public static Collection<Object[]> testcases() {
        ListNode pa1 = new ListNode(1);
        pa1.next = new ListNode(2);
        ListNode pb1 = new ListNode(9);
        pb1.next = new ListNode(1);
        ListNode e1 = new ListNode(0);
        e1.next = new ListNode(4);

        ListNode pa2 = new ListNode(9);
        pa2.next = new ListNode(7);
        ListNode pb2 = new ListNode(9);
        pb2.next = new ListNode(1);
        pb2.next.next = new ListNode(2);
        ListNode e2 = new ListNode(8);
        e2.next = new ListNode(9);
        e2.next.next = new ListNode(2);
        return Arrays.asList(new Object[][]{
                {pa1,pb1,e1},
                {pa2,pb2,e2}
            // {},     // test case 1 (init parameters below: {para1, para2, expected})
            // {},     // test case 2 (init parameters below: {para1, para2, expected})
            // {}      // test case 3 (init parameters below: {para1, para2, expected})
        });
    }

    /**=========================== for each test case ============================== */

    /** 
     * Parameters for each test (initialized in testcases() method) 
     * You can change the type of parameters
     */
     private ListNode para1;                       // parameter 1
     private ListNode para2;                       // parameter 2
     private ListNode expected;                    // parameter 3 (expected answer)

    /** This constructor must be provided to run parameterized test. */
    public Tester(ListNode para1, ListNode para2, ListNode expected) {
           // initialize test parameters
         this.para1 = para1;
         this.para2 = para2;
         this.expected = expected;
    }

    /** Execute before each test method in this class is executed. */
    @Before
    public void setUp() throws Exception {}

    /** Executed as a test case. */
    @Test
    public void test() {

         Object actual = solution.addTwoNum(para1, para2);

         assertThat(actual.toString(), is(equalTo(expected.toString())));

         if (LOGGER.isDebugEnabled()) {
             LOGGER.debug("addTwoNum({},{})={} pass unit test!",para1,para2,expected);
         }
    }

    /** Execute after each test method in this class is executed. */
    @After
    public void tearDown() throws Exception {}

}
