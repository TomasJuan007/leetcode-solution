/**
 * Leetcode - s0001_two_sum
 */
package com.leetcode.s0001_two_sum;

import java.util.HashMap;
import java.util.Map;

/**
 * log instance is defined in Solution interface
 * this is how slf4j will work in this class:
 * =============================================
 *     if (log.isDebugEnabled()) {
 *         log.debug("a + b = {}", sum);
 *     }
 * =============================================
 */
class Solution1 implements Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        //保存遍历过程中数字与位置的映射
        Map<Integer, Integer> indexMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            //查找要找的数字是否在之前的遍历保存的位置
            int find = target - nums[i];
            Integer findIdx = indexMap.get(find);
            if (findIdx != null) {
                //要找的数字在之前的遍历已经出现
                result[0] = findIdx;
                result[1] = i;
                return result;
            }
            indexMap.put(nums[i], i);
        }
        return new int[0];
    }

}
