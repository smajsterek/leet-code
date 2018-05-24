package leetcode;

import leetcode.util.ListNode;

/**
 * @author smajsterek on 24.05.2018
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if( l2 == null){
            return l1;
        }
        ListNode merged = new ListNode(0);
        ListNode result = merged;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                merged.next = l1;
                l1 = l1.next;
            } else {
                merged.next = l2;
                l2 = l2.next;
            }
            merged = merged.next;
        }
        if(l1 == null){
            merged.next = l2;
        } else if( l2 == null){
            merged.next = l1;
        }
        return result.next;
    }
}
