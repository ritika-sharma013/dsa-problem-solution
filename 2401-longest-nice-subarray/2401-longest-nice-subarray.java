class Solution {
    public int longestNiceSubarray(int[] nums) {
            int n = nums.length;
            int maxlen = 0;
            for(int i =0; i<n; i++){
                // used mask. In order to add the element. 
                int mask = 0;
                for(int j = i; j<n; j++){
                
                // comparing mask and element 
                   if((mask & nums[j]) != 0){
                    break;
                   }
                // Bitwise OR 
                   mask |= nums[j];
                   maxlen = Math.max(maxlen, j-i+1); // calculating max len 
                }
            }
            return maxlen;
           }
        }


// TC - O(n * 30 ) nums[i] is max to max 10^9 which fits in 30 bits.

