class Solution {
    public int evalRPN(String[] tokens) {

    Stack<Integer> stack = new Stack<>();

    for(String s : tokens){
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
            if(!stack.isEmpty()){
                int b = stack.pop();
                int a = stack.pop();
                int total = 0;

                if(s.equals("+")){
                    total = a + b;
                }
                if(s.equals("-")){
                    total = a - b;
                }
                if(s.equals("*")){
                    total = a * b;
                }
                if(s.equals("/")){
                    total = a / b;
                }

                
                stack.push(total);

            }
            
            }
            else{
                int n = Integer.parseInt(s);
                stack.push(n);
        }
    }
    if(!stack.isEmpty()){
    int val = stack.pop();
    return val;
    }
    else{
        return 0;
    }
    
        
    }
}
