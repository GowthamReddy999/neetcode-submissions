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
    public ListNode reverseKGroup(ListNode head, int k) {
        
      
      ListNode temp = head,prev=null;
    while(temp != null){
        ListNode kthNode = fun(temp,k);
        if(kthNode == null){
            prev.next=temp;
            break;
        }
        ListNode nextNode = kthNode.next;
        
        kthNode.next = null;

        reverse(temp);
        if(head==temp){
            head=kthNode;
        }
        else{
            prev.next = kthNode;
        }
        prev = temp;
        temp = nextNode;


    }
    return head;
}
    public ListNode fun(ListNode head,int k){
        ListNode temp = head,prev=null;
        int count = 1;
        while(count < k && temp != null){
            count++;
            prev=temp;
            temp=temp.next;
        }
        return temp;
    }
    public ListNode reverse(ListNode head){
        ListNode curr = head,prev=null,next=null;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        return prev;
    }
}
