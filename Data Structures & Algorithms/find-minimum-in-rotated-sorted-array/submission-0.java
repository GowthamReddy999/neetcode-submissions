class Solution {
    public int findMin(int[] nums) {
       
       int[] num = nums;
       Arrays.sort(num);
       return num[0];
        
    }
}
