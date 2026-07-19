class MedianFinder {
    PriorityQueue<Integer> smaller;
    PriorityQueue<Integer> larger;
    

    public MedianFinder() {
        smaller = new PriorityQueue<>((a,b) -> Integer.compare(b,a));
        larger = new PriorityQueue<>();

    }
    
    public void addNum(int num) {

        smaller.add(num);

        if(!larger.isEmpty() && smaller.peek()>larger.peek()){
            larger.add(smaller.poll());
        }

        if(smaller.size()>larger.size()+1){
            larger.add(smaller.poll());
        }
         if(larger.size()>smaller.size()+1){
            smaller.add(larger.poll());
        }


        
        
    }
    
    public double findMedian() {


        if(smaller.size()>larger.size()){
            return smaller.peek();
        }
        if(larger.size()>smaller.size()){
            return larger.peek();
        }
        return (larger.peek()+smaller.peek())/2.0;
        
        
    }
}
