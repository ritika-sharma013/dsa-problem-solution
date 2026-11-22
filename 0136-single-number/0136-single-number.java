class Solution {
    public int singleNumber(int[] nums) {
    //   HashMap<Integer, Integer> map = new HashMap<>();
    //   for(int x:nums){
    //     map.put(x, map.getOrDefault(x,0)+1);
    //   }

    //   for(int x : nums){
    //     if(map.get(x)==1){
    //         return x;
    //     }
    //   }
    //   return -1;

    // OPTIMAL APPROACH 
    int n = nums.length;
    int x = 0;
    for(int i = 0; i<n; i++){
        x = x^nums[i];
    }
    return x;
       }
}