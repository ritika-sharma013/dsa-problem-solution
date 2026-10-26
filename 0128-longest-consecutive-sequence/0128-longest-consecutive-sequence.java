class Solution {
    public int longestConsecutive(int[] nums) {
        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        for (int i : set) {
            if (!set.contains(i - 1)) {
                int current = i;
                int length = 1;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                count = Math.max(count, length);
            }
        }
        return count;
    }
}