class Node{
    int index;
    int distance;
    Node(int i,int d){
        this.index = i;
        this.distance = d;

    }

}
class Solution {
    public int[][] kClosest(int[][] points, int k) {

    
    PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> Integer.compare(b.distance,a.distance));
        int x=0,y=0;
    for(int i=0;i<points.length;i++){
        x = points[i][0];
        y = points[i][1];

        int distance = x*x + y*y;

        pq.add(new Node(i,distance));

        if(pq.size()>k){
            pq.poll();
        }
        
    }
    int[][] ans = new int[k][2];
        int count = 0;
    while(!pq.isEmpty() && count<k){
        
        Node newnode = pq.poll();

        ans[count][0] = points[newnode.index][0];
        ans[count][1] = points[newnode.index][1];
        count++;

    }
    return ans;


            

    }
}
