class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b,a));

        for(int stone : stones){
            pq.add(stone);
        }

        while(pq.size()>1){
        int y = pq.poll();
        int x = pq.poll();
        if(x == y){
            x = 0;
            y = 0;
        }
        
        if(x < y){
            int tol = y - x;

            pq.add(tol);
        }
}
    return pq.isEmpty() ? 0 : pq.peek();
    }
}
