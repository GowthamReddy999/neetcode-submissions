class MinStack {

    Stack<Integer> s1;
    Stack<Integer> ms;
    public MinStack() {
        s1 = new Stack<>();
        ms = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(ms.isEmpty()){
            ms.push(val);
        }
        else{
            if(val<=ms.peek()){
                ms.push(val);
            }
            
        }

    }
    
    public void pop() {

        int val = s1.pop();
        if(ms.peek() == val) ms.pop();

    }
    
    public int top() {
        if(s1.isEmpty()){
            return -1;
        }
        else{
            return s1.peek();
        }
    }
    
    public int getMin() {
        if(ms.isEmpty()){
            return -1;
        }
        else{
            return ms.peek();
        }
    }
}
