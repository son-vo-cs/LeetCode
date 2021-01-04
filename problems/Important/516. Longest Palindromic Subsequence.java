//https://leetcode.com/problems/longest-palindromic-subsequence/
class Solution {
    public int longestPalindromeSubseq(String s) {
        int size = s.length();
        int[][] dp = new int[size][size];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size-i; j++)
            {
                if (i == 0)
                    dp[j][j] = 1;
                else
                {
                    int end = j+i;
                    if (s.charAt(j) == s.charAt(end))
                        dp[j][end] = 2 + dp[j+1][end-1];
                    else
                        dp[j][end] = Math.max(dp[j+1][end],dp[j][end-1]);
                }
            }
        }
        return dp[0][size-1];
    }
}
