class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> stack = new Stack<>();

        for(String s : operations){
            if(s.equals("+") || s.equals("D") || s.equals("C")){
                if(s.equals("+")){
                    int b = stack.pop();
                    int a = stack.pop();
                    int total = a + b;
                    stack.push(a);
                    stack.push(b);
                    stack.push(total);
                }
                if(s.equals("D")){
                    int val = stack.pop();
                    int total = val * 2;
                    stack.push(val);
                    stack.push(total);
                }
                if(s.equals("C")){
                    stack.pop();
                    
                }

            }
            else{
                int n = Integer.parseInt(s);
                stack.push(n);
            }

        }
        int val=0;
        if(!stack.isEmpty()){
            while(!stack.isEmpty()){
                val+=stack.pop();
            }
        }
        return val;

    }
}