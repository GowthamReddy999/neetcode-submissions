class Solution {
    public int[] getConcatenation(int[] nums) {

        int n = nums.length;
       
        int[] ans = new int[n+n];
        int j=0;
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            j++;
        }
       
        for(int i=0;i<n;i++){
            ans[j] = nums[i];
            j++;
        }

        return ans;
        
    }
}