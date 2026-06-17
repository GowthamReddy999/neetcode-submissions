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

        List<Integer> pq = new ArrayList<>();

        for(int i=0;i<lists.length;i++){
            ListNode temp = lists[i];
            while(temp != null){
                pq.add(temp.val);
                temp=temp.next;
            }

        }
        Collections.sort(pq);

        
        

        ListNode node = new ListNode(-1);
        ListNode temp1 = node;
        for(int nodes : pq){
           // int nodes = pq.poll();
            ListNode n = new ListNode(nodes);
            temp1.next=n;
            temp1=temp1.next;

            
        }
        return node.next;

    }
}
