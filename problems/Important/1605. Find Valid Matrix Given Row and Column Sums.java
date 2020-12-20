//https://leetcode.com/problems/find-valid-matrix-given-row-and-column-sums/

class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int r = rowSum.length;
        int c = colSum.length;
        int[][] ans = new int[r][c];
        for (int i = 0, j = 0; i < r && j < c;)
        {
           
                int min = Math.min(rowSum[i],colSum[j]);
                ans[i][j] = min;
                rowSum[i]-=min;
                colSum[j]-=min;
               if (rowSum[i] == 0)
                   i++;
               if (colSum[j] == 0)
                   j++;
                
            
        }
        return ans;
    }
}

