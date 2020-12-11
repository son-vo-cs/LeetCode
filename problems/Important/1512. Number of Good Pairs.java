//https://leetcode.com/problems/number-of-good-pairs/
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] mem = new int[101];
        for (int num : nums)
            mem[num]++;
        int ans = 0;
        // System.out.println(mem[1]);
        for (int i = 1; i < mem.length; i++)
            if (mem[i] > 1)
                ans += mem[i]*(mem[i]-1)/2;
        return ans;
    }
}

/*
[1,1,1] => 2+1 = 3 = 1 + .. + n-1 = (n-1)*n/2
[1,1,1,1] => 3+2+1 = 6
[1,1,1,1,1] => 4+3+2+1 = 10

*/
