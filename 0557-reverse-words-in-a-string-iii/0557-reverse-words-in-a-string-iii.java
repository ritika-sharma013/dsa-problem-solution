class Solution {
    public String reverseWords(String s) {
        int n = s.length();
        char[] arr = s.toCharArray();
        int start = 0;
        for(int i = 0; i<=n; i++){

            if(i== n || arr[i] == ' '){
            reversefn(arr, start, i-1);
            start = i+1;
            }
        }
     

        return new String(arr);

    }
     static void reversefn(char[] arr, int i, int j){
        int n = arr.length;
       
       while(i<j){
    char temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
       i++;
       j--;
       }
       
    }
}