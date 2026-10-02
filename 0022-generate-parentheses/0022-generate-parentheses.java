class Solution { 

    public List<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList<>();
        StringBuilder curr = new StringBuilder();


        backtrack(curr, 0,0, n, res);

        return res;
        
    }
    private void backtrack(StringBuilder curr, int open, int close, int n, List<String> res ){
        // base case 
        if(curr.length() == 2*n){
            if(isvalid(curr.toString())){
                res.add(curr.toString());
                return;
            }
        }
        // If open bracket exceeds n -> ensures that we don’t need to add more opening brackets 
        // than required, keeping the sequence valid.

        if(open < n){
        curr.append('(');  //CHOOSE 
        backtrack(curr,open+1, close, n, res); //EXPLORE 
        curr.deleteCharAt(curr.length()-1);         //BACKTRACK (Un-choose)
        }
        
        // If closing bracket exceeds open -> sequence hindered, parenthesis becomes unbalanced

        if(close < open){
        curr.append(')');
        backtrack(curr, open, close+1, n, res);
        curr.deleteCharAt(curr.length()-1);
        }

    }
    
    private boolean isvalid(String s){
        int count = 0;
        for(int i =0; i< s.length(); i++){
            if(s.charAt(i)=='('){
                count++;
            }else{
                count--;
            }
        }
        if(count < 0){
            return false;
        }
        return count==0;
    }
    
}