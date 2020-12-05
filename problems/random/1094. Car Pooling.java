//https://leetcode.com/problems/car-pooling/

class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int pass = 0;
        int[] dp = new int[1001];
        for (int[] trip : trips)
        {
            dp[trip[1]] += trip[0];
            dp[trip[2]] -= trip[0];
        }
        for (int i = 1; i < dp.length; i++)
        {
            pass += dp[i];
            if (pass > capacity)
                return false;
        }
        return true;
    }
}
