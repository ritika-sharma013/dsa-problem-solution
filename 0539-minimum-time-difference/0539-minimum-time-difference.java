class Solution {
    public int findMinDifference(List<String> timePoints) {

        List<Integer> time = new ArrayList<>();

        for (String s : timePoints) {
            int h = Integer.parseInt(s.substring(0, 2));
            int m = Integer.parseInt(s.substring(3, 5));

            time.add(h * 60 + m);
        }

        Collections.sort(time);

        int ans = 1440;

        for (int i = 1; i < time.size(); i++) {
            ans = Math.min(ans, time.get(i) - time.get(i - 1));
        }

        // Circular difference: last -> first
        ans = Math.min(ans, 1440 - time.get(time.size() - 1) + time.get(0));

        return ans;
    }
}