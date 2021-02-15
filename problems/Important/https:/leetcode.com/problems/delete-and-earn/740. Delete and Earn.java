//https://leetcode.com/problems/delete-and-earn/
class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] mem = new int[10001];
        int max = 0;
        for (int n : nums)
        {
            mem[n]++;
            max = Math.max(max, n);
        }
        int[] dp = new int[10001];
        dp[1] = mem[1];
        for (int i = 2; i <= max; i++)
        {
            dp[i] = Math.max(dp[i-2] + mem[i]*i, dp[i-1]);
             
        }
        return dp[max];
    }
}
