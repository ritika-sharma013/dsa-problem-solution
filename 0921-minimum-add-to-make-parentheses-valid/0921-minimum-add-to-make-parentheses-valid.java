class Solution {
    public int minAddToMakeValid(String s) {

        int count = 0;
        int ans = 0;

        for(char ch : s.toCharArray()){
            if(ch=='('){
                count++;
            }
            else{  // ch==')'
            if(count >0) count--;
            else{
                ans++;
            }
            }
        }
        return count+ans;
}
}