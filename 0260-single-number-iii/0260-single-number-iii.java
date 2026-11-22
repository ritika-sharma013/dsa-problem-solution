class Solution {
    public int[] singleNumber(int[] nums) {
    
    ArrayList<Integer> ans = new ArrayList<Integer>();
    int n = nums.length;

    HashMap<Integer, Integer> map = new HashMap<>();
      for(int x:nums){
        map.put(x, map.getOrDefault(x,0)+1);
      }

      for(int x : nums){
        if(map.get(x)==1){
            ans.add(x);
        }
      }
int[] result = new int[ans.size()];

for (int i = 0; i < ans.size(); i++) {
    result[i] = ans.get(i);
}

return result;

    }
}