class Solution {
    public String removeOuterParentheses(String s) {

        StringBuilder ans = new StringBuilder();
        int count = 0; 

    // Approach -> Take count variable & operate it according to opening & closing brackts. 
    // Since, outermost character needs to be removed, we put up a condition, if I find '(', but the coutn is not 1 that means its outer bracet & we wont count it. 
    
        for(char ch : s.toCharArray()){
            if(ch=='('){
                if(count>0){
                    ans.append(ch);
                }
                count++;
            }
            else{
                count--;
                if(count > 0){
                    ans.append(ch);
                }
            }
        }

        return ans.toString();
    }
}