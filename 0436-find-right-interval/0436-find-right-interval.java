class Solution {
    public int[] findRightInterval(int[][] A) {

        int n = A.length;
        int[] ans = new int[n];
        Arrays.fill(ans,-1);

        for(int i = 0; i< n; i++){
            int best = Integer.MAX_VALUE;
            for(int j =0; j<n; j++){
                if(A[j][0] >= A[i][1] && A[j][0] < best){
                    best = A[j][0];
                    ans[i] = j;
                } 
            }
        }
    return ans;
    }
}