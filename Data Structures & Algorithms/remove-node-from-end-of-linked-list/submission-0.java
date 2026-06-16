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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        int totalNodes =  count(head);
        if(totalNodes == n){
            return head.next;
        }

        ListNode curr = head, prev= null;
        int del = (totalNodes-n)+1;
        int pre = 1;
        
        while(pre < del){
            prev=curr;
            pre++;
            curr=curr.next;
        }
        prev.next = curr.next;
        return head;
        
    }
    public int count(ListNode head){

        ListNode temp = head;
            int c=0;
        while(temp != null){
            temp=temp.next;
            c++;
        }
        return c;
    }
}
