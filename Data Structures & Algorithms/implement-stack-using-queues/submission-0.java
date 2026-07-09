class MyStack {

    Stack<Integer> stack;
    public MyStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
    }
    
    public int pop() {
        if(!stack.isEmpty()){
            int val = stack.pop();
            return val;
        }
        return -1;
        
    }
    
    public int top() {
         if(!stack.isEmpty()){
            int val = stack.peek();
            return val;
        }
        return -1;
    }
    
    public boolean empty() {
        
        return stack.isEmpty();
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