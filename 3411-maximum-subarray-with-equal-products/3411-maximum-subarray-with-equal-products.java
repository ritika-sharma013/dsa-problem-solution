class Solution {
    public int maxLength(int[] nums) {

        int ans = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {

            long prod = 1;
            int g = 0;
            long l = 1;

            for (int j = i; j < n; j++) {

                if (prod > 25200L / nums[j]) {
                    break;
                }

                prod *= nums[j];

                g = gcd(g, nums[j]);
                l = lcm(l, nums[j]);

                if (prod == (long) g * l) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }

        return ans;
    }

    // GCD
    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM
    public long lcm(long a, long b) {
        return (a / gcd((int)a, (int)b)) * b;
    }
}