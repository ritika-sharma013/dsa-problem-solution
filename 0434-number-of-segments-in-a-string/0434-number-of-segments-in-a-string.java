class Solution {
    public int countSegments(String s) {
        s = s.trim().replaceAll("\\s+", " ");
        int n = s.length();
        int count = 0;
    if(n==0) return 0;  
      for(int i = 0; i<n; i++){
        if(s.charAt(i) == ' '){
            count++;
        }
      }
    return count +1;
    }
}