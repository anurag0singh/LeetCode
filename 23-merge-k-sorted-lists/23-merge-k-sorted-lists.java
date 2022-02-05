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
    static ListNode merge(ListNode list1, ListNode list2){
        if(list1 == null || list2 == null) return list1 == null ? list2 : list1;
        if(list1.val > list2.val){
            ListNode tmp = list1;
            list1 = list2;
            list2 = tmp;
        }
        ListNode prev1 = list1, curr1 = list1.next, curr2 = list2;
        while(curr1 != null && curr2 != null){
            if(curr1.val > curr2.val){
                ListNode tmp = curr2.next;
                curr2.next = curr1;
                prev1.next = curr2;
                prev1 = curr2;
                curr2 = tmp;
            }
            else{
                prev1 = curr1;
                curr1 = curr1.next;
            }
        }
        if(curr2 != null) prev1.next = curr2;
        return list1;
    }
    
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        if(len == 0) return null;
        int interval = 1;
        while(interval < len){
            for(int i = 0; i < len - interval; i += interval*2){
                lists[i] = merge(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }
        return lists[0];
    }
}