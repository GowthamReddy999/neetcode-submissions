class Solution {
    public int findDuplicate(int[] nums) {


        Set<Integer> hashset = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(hashset.contains(nums[i])){
                return nums[i];
            }
            hashset.add(nums[i]);
        }
        return -1;
    }
}
