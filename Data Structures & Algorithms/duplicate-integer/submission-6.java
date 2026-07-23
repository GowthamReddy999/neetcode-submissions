class Solution {
    public boolean hasDuplicate(int[] nums) {

        ArrayList<Integer> users = new ArrayList<>();

       for(int n : nums){

        if(users.contains(n)){
            return true;
        }
        users.add(n);
       }
       return false;
        
    }
}