class Solution {
    public int[] separateDigits(int[] nums) {
         ArrayList<Integer> res = new ArrayList<>();

         for(int x : nums){
            String s = Integer.toString(x);
            for(char ch : s.toCharArray()){
                res.add(ch-'0');
            }
         }
         int[] ans = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
         
        return ans;
    }
}