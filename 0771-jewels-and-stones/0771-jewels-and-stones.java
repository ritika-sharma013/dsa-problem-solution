class Solution {
    public int numJewelsInStones(String je, String s) {
        int n = je.length();
        int m = s.length();

        int cnt = 0;

        for(int i = 0; i<n ; i++){
            for(int j = 0 ; j<m ; j++){

                if(je.charAt(i) == s.charAt(j)) cnt++;
            }
        }
        return cnt;
    }
}