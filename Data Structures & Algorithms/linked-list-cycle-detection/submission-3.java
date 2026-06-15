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
    public boolean hasCycle(ListNode head) {

       ListNode kundelu = head;
       ListNode thabeal = head;


       while(kundelu != null && kundelu.next != null){
        thabeal=thabeal.next;
        kundelu=kundelu.next.next;

        if(kundelu == thabeal){
            return true;
        }
       }
        return false;
    }
}
