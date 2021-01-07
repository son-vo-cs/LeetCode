//https://leetcode.com/problems/longest-arithmetic-subsequence/
class Solution {
    public int longestArithSeqLength(int[] A) {
        int size = A.length;
        int[][] dp = new int[size][1002];
        int ans = 2;
        for (int i = 1; i < size; i++)
        {
            for (int j = 0; j < i; j++)
            {
                dp[i][A[i]-A[j]+500] = Math.max(2,dp[j][A[i]-A[j]+500]+1);
                ans = Math.max(ans,dp[i][A[i]-A[j]+500]);
            }
        }
        return ans;
        // dp[i][different] = dp[j][different]+1
    }
}
