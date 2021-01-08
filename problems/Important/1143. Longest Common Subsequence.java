//https://leetcode.com/problems/longest-common-subsequence/
class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()+1][text2.length()+1];
        int ans = 0;
        for (int i = 1; i <= text1.length(); i++)
        {
            for (int j = 1; j <= text2.length(); j++)
            {
                if (text1.charAt(i-1) == text2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1]+1;
                else
                {
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j]);
                    dp[i][j] = Math.max(dp[i][j],dp[i][j-1]);
                }
                
                ans = Math.max(ans,dp[i][j]);
            }
        }
        return ans;
    }
}


/*

abb dbb

i = 0 j = 0: a d
i = 0 j = 1: a b
i = 0 j = 2  a c

b d
b b => dp[1][1] = 1
b b => dp[1][2] = dp[1][1] +1= 2

b d
b b => dp[2][1] = dp[2][0] + 1 = 1
b b => dp[2][2] = dp[2][1] + 1 = 2

*/
