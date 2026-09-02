class Solution {
    public int majorityElement(int[] nums) {
        
           int candiate = 0;
           int count = 0;
        for(int num : nums){

            if(count == 0){
                candiate = num;
            }

            if(num == candiate){
                count++;
            }
            else{
                count--;
            }

        }
        return candiate;
    }
}