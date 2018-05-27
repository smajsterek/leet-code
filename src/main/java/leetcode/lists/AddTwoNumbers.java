package leetcode.lists;

import leetcode.util.ListNode;

/**
 * @author smajsterek on 24.05.2018
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode start = head;
        int carry = 0;
        int val1 = 0;
        int val2 = 0;
        int sum = 0;
        while (l1 != null || l2 != null) {
            val1 = l1 != null ? l1.val : 0;
            val2 = l2 != null ? l2.val : 0;
            sum = val1 + val2 + carry;
            head.next = new ListNode(sum % 10);
            carry = sum / 10;
            head = head.next;
            if(l1 != null){
                l1 = l1.next;
            }
            if(l2 != null){
                l2 = l2.next;
            }
        }

        if (carry != 0) {
            head.next = new ListNode(carry);
        }
        return start.next;
    }
}
