class Solution {
    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> Integer.compare(b,a));

        for(int num : nums){
            pq.add(num);
        }

        int n = k;

        while(n>1){
        
        pq.poll();
        n--;
            
        }

        return pq.poll();
        
    }
}
