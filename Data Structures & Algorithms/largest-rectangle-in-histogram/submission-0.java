class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> stack = new Stack<>();
       int n = arr.length;
        int[] next = new int[n];
        int[] prev = new int[n];


        for(int i=0;i<n;i++){

            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                prev[i] = -1;
            }
            else{
                prev[i] = stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){

            while(!stack.isEmpty() && arr[stack.peek()]>=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                next[i] = n;
            }
            else{
                next[i] = stack.peek();
            }
            stack.push(i);
        }
            int ans = 0;
        for(int i=0;i<n;i++){

            int width = (next[i]-prev[i]-1);
            int area = arr[i] * width;
            ans = Math.max(ans,area);
        }
        return ans;


        
    }
}
