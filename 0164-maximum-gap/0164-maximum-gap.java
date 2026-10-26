class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        int i = 0;
        int j = i+1;
        int gap = 0; 

        while(j<n){
           gap = Math.max(gap, Math.abs(nums[i]-nums[j]));
           i++;
           j++;
        }
        return gap;
    }
}