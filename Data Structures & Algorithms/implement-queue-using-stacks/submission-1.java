class MyQueue {
    

    Stack<Integer> stack;
    Stack<Integer> tempStack;
    public MyQueue() {
        stack = new Stack<>();
        tempStack = new Stack<>();

    }
    
    public void push(int x) {
        while(!stack.isEmpty()){
            tempStack.push(stack.pop());

        }
        stack.push(x);
         while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());

        }
    }
    
    public int pop() {
        if(!stack.isEmpty()){
            return stack.pop();
        }
        return -1;
        
    }
    
    public int peek() {
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return -1;
    }
    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */