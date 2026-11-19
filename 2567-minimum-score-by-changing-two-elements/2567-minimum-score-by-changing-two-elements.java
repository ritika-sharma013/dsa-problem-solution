class Solution {
    public int minimizeSum(int[] nums) {
        // lowest score = 0 
        // minimize high score 
        int n = nums.length;
        Arrays.sort(nums);

        int sc1 = nums[n - 3] - nums[0];   
        int sc2 = nums[n - 1] - nums[2];   
        int sc3 = nums[n - 2] - nums[1];   

        return Math.min(sc1, Math.min(sc2, sc3));
    }
}