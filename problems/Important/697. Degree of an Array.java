//https://leetcode.com/problems/degree-of-an-array/

class Solution {
    public int findShortestSubArray(int[] nums) {
        int[] left =  new int[50000];
        int[] right = new int[50000];
        int[] deg =   new int[50000];
        
        int maxDegree = 0;
        int minLength = nums.length;
        
        for (int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            if (left[num] == 0)
                left[num] = i+1;
            right[num] = i+1;
        
            deg[num]++;
            maxDegree = Math.max(maxDegree, deg[num]);
            
        }
        
        for (int n : nums)
        {
            if (maxDegree == deg[n])
                minLength = Math.min(minLength,right[n]-left[n]+1);
        }
        return minLength;
    }
}
