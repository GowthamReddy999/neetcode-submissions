class Solution {
    public int removeDuplicates(int[] nums) {

        Set<Integer> hashSet = new LinkedHashSet<>();


        for(int num : nums){
            hashSet.add(num);
            
        }

        int index = 0;
        for(int unique : hashSet){
            nums[index] = unique;
            index++;
        }

         return index;
        
    }
}