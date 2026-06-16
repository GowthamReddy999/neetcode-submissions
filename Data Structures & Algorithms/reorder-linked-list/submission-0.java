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
    public void reorderList(ListNode head) {

        ListNode mid = middle(head);
        ListNode rev = reverse(mid);
        ListNode temp = head;
        ListNode temp1 = rev;


        while(temp1 != null){
            ListNode next = temp.next;
            ListNode next1 = temp1.next;
            temp.next = temp1;
            temp1.next=next;
            temp=next;
            temp1=next1;
        }
         
    }

    public ListNode middle(ListNode head){
        ListNode kun = head,tha = head,h=null;

        while(kun != null && kun.next != null){
            tha = tha.next;
            kun = kun.next.next;    
        }
         h = tha.next;
        tha.next = null;

        return h;
    }

    public ListNode reverse(ListNode head){

        ListNode curr = head,prev= null,next=null;

        while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        }

        return prev;
    }
    
}
