class Solution {
    public int[] twoSum(int[] nums, int target) {
            int[] n2 = new int[2];
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            for(int k=0;k<nums.length;k++){
            for(int j=0;j<nums.length;j++){
                if(i == j){
                    continue;
                }
                int n1=n+nums[j];
                if(n1==target){
                   // int[] n2 = new int[2];
                    n2[0]=j;
                    n2[1]=i;
                   // return n2;

                }
               

            }
            }
        }
        return n2;
    }

}
