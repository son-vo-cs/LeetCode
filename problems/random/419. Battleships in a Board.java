// https://leetcode.com/problems/battleships-in-a-board/
class Solution {
    public int countBattleships(char[][] board) {
        int result = 0;
        int row = board.length;
        int col = board[0].length;
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                // int up = i-1;
                // int left = j-1;
                if (board[i][j] == 'X')
                {
                    if ((i-1 < 0 || (board[i-1][j] == '.')) && (j-1 < 0 || (board[i][j-1] == '.')))
                        result++;
                }
                // System.out.println(i + "x" + j + ":" + up + "x" + left + ": " + result); 
            }
        } 
        return result; 
    }    
} 
    
 
 
 
 
   
 
