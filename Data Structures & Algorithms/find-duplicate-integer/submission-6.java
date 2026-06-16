class Solution {
    public int findDuplicate(int[] nums) {
        
        int kundelu = 0;
        int tabelu = 0;

        do {

            kundelu = nums[nums[kundelu]];
            tabelu = nums[tabelu];
        }
        while(kundelu != tabelu);

        kundelu = 0;

        while(kundelu != tabelu){
            kundelu = nums[kundelu];
            tabelu = nums[tabelu];
        }

        return kundelu;
    }
}
