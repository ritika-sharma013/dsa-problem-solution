class Solution {
    public int numOfSubarrays(int[] arr) {

        long MOD = 1_000_000_007L;

        long even = 1; // Empty prefix sum is even
        long odd = 0;

        long count = 0;
        int sum = 0;

        for (int num : arr) {

            sum += num;

            if (sum % 2 == 0) {
                count += odd;
                even++;
            } else {
                count += even;
                odd++;
            }

        }

        return (int)(count % MOD);
    }
}