/**
 * Leetcode - s0002_add_two_num
 */
package com.leetcode.s0002_add_two_num;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    ListNode addTwoNum(ListNode num1, ListNode num2);
}
