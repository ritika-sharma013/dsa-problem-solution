class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        int i = 1;
        while(i<n){
            if(s.charAt(i) == 'a' && s.charAt(i-1)=='b') {
                return false;
            }
            i++;
        }
        return true;
    }
}

 



