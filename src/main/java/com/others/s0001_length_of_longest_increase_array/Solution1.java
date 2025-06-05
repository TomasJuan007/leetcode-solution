/**
 * 最长递增子序列长度
 * 如: [1,5,2,4,3] 结果为: 3，即 [1,2,4] 或 [1,2,3]
 */
package com.others.s0001_length_of_longest_increase_array;

class Solution1 implements Solution {

    @Override
    public int lengthOfLongestArray(int[] input) {
        int len = input.length;
        if (len <= 1) {
            return len;
        }

        int[] dp = new int[len];
        for (int i = 0; i < len; i++) {
            dp[i] = 1;
        }

        int max_result = 1;
        for (int i = len - 2; i >= 0; i--) {
            int max_val = 1;
            for (int j = len - 1; j > i; j--) {
                if (input[j] > input[i]) {
                    max_val = Math.max(max_val, dp[j] + 1);
                    dp[i] = max_val;
                }
            }
            max_result = Math.max(max_result, dp[i]);
        }

        return max_result;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1,5,2,4,3};
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.lengthOfLongestArray(input));
    }
}
