class Solution {
    public int minimizeSum(int[] arr) {
        

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE, min3 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            // Largest 3
            if (arr[i] > max1) {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            } 
            else if (arr[i] > max2) {
                max3 = max2;
                max2 = arr[i];
            } 
            else if (arr[i] > max3) {
                max3 = arr[i];
            }

            // Smallest 3
            if (arr[i] < min1) {
                min3 = min2;
                min2 = min1;
                min1 = arr[i];
            } 
            else if (arr[i] < min2) {
                min3 = min2;
                min2 = arr[i];
            } 
            else if (arr[i] < min3) {
                min3 = arr[i];
            }
        }

        return Math.min(
            Math.min(max1 - min3, max3 - min1),
            max2 - min2
        );
    }
}




