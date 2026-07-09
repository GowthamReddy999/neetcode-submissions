class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        int val,val1;
        while(!q1.isEmpty()){
            val = q1.poll();
            q2.add(val);
        }

        q1.add(x);
         while(!q2.isEmpty()){
            val1 = q2.poll();
            q1.add(val1);
        }
    }
    
    public int pop() {
        if(!q1.isEmpty()){
            int val = q1.poll();
            return val;
        }
        return -1;
        
    }
    
    public int top() {
         if(!q1.isEmpty()){
            int val = q1.peek();
            return val;
        }
        return -1;
    }
    
    public boolean empty() {
        
        return q1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */