//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];
        int[] mem = new int[101];
        for (int num : nums)
            mem[num]++;
        int accumulate = 0;
        for (int i = 0; i < mem.length; i++)
        {
            if (mem[i] > 0)
            {
                int temp = mem[i];
                mem[i] = accumulate;
                accumulate += temp;
            }
                
        }
        for (int i = 0; i < size; i++)
            ans[i] = mem[nums[i]];
        return ans;
    }
}
