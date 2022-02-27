/**
 * Leetcode - s0003_length_of_longest_substring
 */
package com.leetcode.s0003_length_of_longest_substring;
import java.util.*;
import com.ciaoshen.leetcode.util.*;

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

    public int lengthOfLongestSubstring(String input) {
        int result = 0;
        int inputLength = input.length();
        int[] resultByIndex = new int[inputLength];
        Map<Character, Integer> loiByCharMap = new HashMap<>(inputLength);
        for (int i = 0; i < inputLength; i++) {
            char c = input.charAt(i);
            Integer lastOccurIndex = loiByCharMap.get(c);
            int resultCurr;
            int resultPre = i > 0 ? resultByIndex[i - 1] : -1;
            if (lastOccurIndex!=null && lastOccurIndex >= i-resultPre) {
                resultCurr = i - lastOccurIndex;
            } else {
                resultCurr = resultPre + 1;
            }
            resultByIndex[i] = resultCurr;
            loiByCharMap.put(c,i);

            result = Math.max(result, resultCurr);
        }
        return result;
    }

}
