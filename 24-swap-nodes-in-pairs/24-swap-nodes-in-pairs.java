/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        while(curr != null && curr.next != null){
            next = curr.next;
            if(prev == null) head = next;
            else prev.next = next;
            curr.next = next.next;
            next.next = curr;
            prev = curr;
            curr = curr.next;
        }
        return head;
    }
}