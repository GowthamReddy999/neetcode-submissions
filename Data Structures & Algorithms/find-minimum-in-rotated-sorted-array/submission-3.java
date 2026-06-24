class Solution {
    public int findMin(int[] nums) {
        int min = (int)1e9;
        //min = Integer.MAX_value;
        for(int i=0;i<nums.length;i++){
            if(min>nums[i]){
                min=nums[i];
            }

        }
        return min;
    }
}
