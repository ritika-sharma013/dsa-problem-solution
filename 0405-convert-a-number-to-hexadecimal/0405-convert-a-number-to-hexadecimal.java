
class Solution {
    public String toHex(int num) {
        StringBuilder ans = new StringBuilder();
        if (num == 0) return "0";
        char[] hex = "0123456789abcdef".toCharArray();
        while (num != 0) {
            ans.append(hex[num & 15]);
            num >>>= 4;
        }
        return ans.reverse().toString();
    }
}