class Solution {
    public boolean hasDuplicate(int[] nums){
        int n = nums.length;
      //  boolean flag=false;
        for(int i=0;i<n;i++){
            int n1 = nums[i];
            for(int j=0;j<n;j++){
                if(i==j){
                    continue;
                }
                if(n1==nums[j]){
                    return true;

                }
                
            }
        }
       return false;
    }
}