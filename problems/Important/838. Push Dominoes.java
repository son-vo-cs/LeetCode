//https://leetcode.com/problems/push-dominoes/
class Solution {
    public String pushDominoes(String dominoes) {
        char[] ans = dominoes.toCharArray();
        int size = dominoes.length();
        int[] forces = new int[size];
        
        int force = 0;
        for (int i = 0; i < size; i++)
        {
            if (ans[i] == 'R') force = size;
            else if (ans[i] == 'L') force = 0;
            else force = Math.max(force-1,0);
            forces[i] += force;
        }
        force = 0;
        for (int i = size-1; i >= 0; i--)
        {
            if (ans[i] == 'L') force = size;
            else if (ans[i] == 'R') force = 0;
            else force = Math.max(force-1,0);
            forces[i] -= force;
        }
        for (int i = 0 ; i < size; i++)
        {
            if (forces[i] > 0)
                ans[i] = 'R';
            else if (forces[i] < 0)
                ans[i] = 'L';
        }
        return String.valueOf(ans);
    }
}

/*

". L . R 1 1 1 L R 1 1 L . ."
*/
