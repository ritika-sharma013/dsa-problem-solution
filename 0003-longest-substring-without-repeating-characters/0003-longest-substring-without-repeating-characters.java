class Solution {
    public int lengthOfLongestSubstring(String s) {
//   Naive/Brute 
   HashSet<Character> set = new HashSet<>();

        int[] freq = new int[256]; 
 
       int i =0, j=0; 
       int maxlen = 0; 
       while(j<s.length()){ 
 
//  first store the freq 
        freq[s.charAt(j)]++; 

        // Slide the window till the duplicate gets vanished 
         while (freq[s.charAt(j)] > 1) {
                freq[s.charAt(i)]--;
                i++;
            }
        maxlen = Math.max(maxlen, j - i + 1);

        j++;

       } 
       return maxlen; 
    }
}