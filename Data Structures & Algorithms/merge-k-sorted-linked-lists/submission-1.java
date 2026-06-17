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
    public ListNode mergeKLists(ListNode[] lists) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(ListNode lis : lists){
            while(lis != null){
                pq.add(lis.val);
                lis=lis.next;
            }
        }
        
        

        ListNode node = new ListNode(-1);
        ListNode temp = node;
        while(!pq.isEmpty()){
            int nodes = pq.poll();
            ListNode n = new ListNode(nodes);
            temp.next=n;
            temp=temp.next;

            
        }
        return node.next;

    }
}
