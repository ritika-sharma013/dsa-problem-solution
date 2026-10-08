class Solution {
    public String minRemoveToMakeValid(String s) {

        StringBuilder ans = new StringBuilder();
        int n = s.length();
        int count = 0;

        for(int i =0; i<n; i++){
            char ch = s.charAt(i);

            if(ch=='('){
                count++;
                ans.append(ch);
            }
           
           else if(ch==')'){
            if(count > 0){
                count--;
                ans.append(ch);
            }
           }
           else{
            ans.append(ch);
           }
        }
        
  // Important test case :- s = "lee(t(c)o)de(" -> So in the first pass we might have checked for closed bracket ')'. But if we've an open brackt '(' at the end which is required to be removed then we have to use a second loop. 

     for(int i = ans.length()-1; i>=0 && count >0 ; i--){
    

        if(ans.charAt(i) == '('){
            ans.deleteCharAt(i);
            count--;
        }
     }
         return ans.toString();
        }
}