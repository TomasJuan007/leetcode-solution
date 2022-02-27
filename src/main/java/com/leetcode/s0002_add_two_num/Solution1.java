/**
 * Leetcode - s0002_add_two_num
 */
package com.leetcode.s0002_add_two_num;
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

    public ListNode addTwoNum(ListNode num1, ListNode num2) {
        ListNode pre = new ListNode(0);
        ListNode curr = pre;
        int carry = 0;
        while(num1!=null || num2!=null) {
            int e1 = num1==null? 0 : num1.val;
            int e2 = num2==null? 0 : num2.val;
            int sum = e1 + e2;
            int mod = (sum+carry)%10;
            carry = (sum+carry)/10;

            curr.next = new ListNode(mod);
            curr = curr.next;

            if (num1!=null) {
                num1 = num1.next;
            }
            if (num2!=null) {
                num2 = num2.next;
            }
        }
        if (carry>0) {
            curr.next = new ListNode(carry);
        }
        return pre.next;
    }

}
