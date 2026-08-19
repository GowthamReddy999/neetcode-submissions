/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {

        if(node == null){
            return node;
        }

        HashMap<Node,Node> h = new HashMap<>();
        Queue<Node> q = new LinkedList<>();

        h.put(node,new Node(node.val,new ArrayList<>()));
        q.add(node);


        while(!q.isEmpty()){
            Node t = q.remove();

            for(Node n:t.neighbors){

            if(!h.containsKey(n)){
              h.put(n,new Node(n.val,new ArrayList<>()));
              q.add(n);

            }
                h.get(t).neighbors.add(h.get(n));
            }

        }
        return h.get(node);



        
    }
}