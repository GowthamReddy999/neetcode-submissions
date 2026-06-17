/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null){
            return null;
        }
    Node temp = head.next;
    Node head1 = new Node(head.val); 
    
    Map<Node,Node> map = new HashMap<>();

    map.put(head,head1);
    Node temp1= head1;

    while(temp != null){
        Node copy = new Node(temp.val);

        temp1.next=copy;

        map.put(temp,copy);

        temp=temp.next;
        temp1=temp1.next;
    }

    temp=head;
    temp1=head1;

    while(temp != null){
        temp1.random = map.get(temp.random);
        temp=temp.next;
        temp1=temp1.next;

    }
    return head1;
        
       
       

    }
}
