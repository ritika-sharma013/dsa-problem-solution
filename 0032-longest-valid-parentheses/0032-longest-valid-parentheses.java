class Solution {
    public int longestValidParentheses(String s) {

    int n = s.length();

    int left = 0;
    int count = 0;
    int maxlen =0; 

//  Left pass 
    for(int i =0; i<n; i++){
        char ch = s.charAt(i);
        if(ch=='('){
            count++;
        }
        else{
            count--;
            if(count < 0){
                left = i+1;
                count=0;
            }
            if(count==0){
                maxlen = Math.max(maxlen, i-left+1);
            }
        }
    }
    // reset the count 
    count =0;
    int right = n-1;
    for(int i =n-1; i>=0; i--){
        char ch = s.charAt(i);
        if(ch==')'){
            count++;
        }
        else{
            count--;
            if(count < 0){
               right = i-1;
                count=0;
            }
            if(count==0){
                maxlen = Math.max(maxlen, right-i+1);
            }
        }
    }

 return maxlen;
    }
}

   //     int n = s.length();

    //     Stack<Integer> st = new Stack<>();

    //     st.push(-1);  //Maintai

    //     int maxlen = 0;

    //     for(int i=0; i<n; i++){
            
    //     char ch = s.charAt(i);
    //     if(ch=='('){
    //         st.push(i);
    //     }
    //     else if(ch==')'){
    //         st.pop();

    //         if(st.isEmpty()){
    //             st.push(i);
    //         }
    //         else{
    //             int len = i - st.peek();
    //             maxlen = Math.max(maxlen, len);
    //         }
    //     }
    //     }
    // return maxlen;