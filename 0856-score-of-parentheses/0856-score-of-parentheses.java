class Solution {
    public int scoreOfParentheses(String s) {

        int n = s.length();
        Stack<Integer> st = new  Stack<>();
        int score = 0;

        for(int i=0; i<n; i++){
            
            if(s.charAt(i) == '('){  //fresh start of parenthesis 
            st.push(score);
            score =0;
            }
            else{  // if ')' bracket comes -> then, we'll check if i-1 == '(' - simplest case
            if(s.charAt(i-1) == '('){
                score = st.pop() + 1; //1 according to rule 
            }
            else{ //Nested parenthesis case 

            score = st.pop() + 2*score;

            }

            }
        }
      return score;
    }
}