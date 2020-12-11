//https://leetcode.com/problems/sum-of-all-odd-length-subarrays/



class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int size = arr.length;
        for (int i = 0; i < size; i++)
        {
            int occurence = ((i+1)*(arr.length-i)+1)/2;
            sum += arr[i] * occurence;
        }
        return sum;
    }
}
