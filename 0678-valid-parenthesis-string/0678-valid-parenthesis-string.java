class Solution {
    public boolean checkValidString(String s) {
       
       int n = s.length();
       int minopen = 0;
       int maxopen = 0;


       for(int i =0; i<n; i++){
        char ch = s.charAt(i);

        if(ch == '('){
            minopen++;
            maxopen++;
        }
        else if(ch == ')'){
            minopen--;
            maxopen--;
        }
       else if(ch == '*'){
            // considering '(' -> maxopen & ')' -> minimum number of unmatched '('
            minopen--;
            maxopen++;
        }
        minopen = Math.max(0, minopen);
        if(maxopen <0){
            return false;
        }
       }
     return minopen==0;
    }
}
