/**
 * Leetcode - s0001_two_sum
 */
package com.leetcode.s0001_two_sum;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * https://leetcode-cn.com/problems/two-sum/
 */
interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int[] twoSum(int[] nums, int target);
}
