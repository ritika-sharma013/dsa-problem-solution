class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            count+=nums[i]-nums[0];
        }
        return count;
    }
}