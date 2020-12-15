//https://leetcode.com/problems/longest-palindrome/
/*
Wrong thinking: longest palindrom = sum of all even + maximum of odd freq. Because if we have 2 odd: 3 and 5 and we choose 5 => we ignore 2 letter in 3

Correct: palindrome is consit of pair and 1 unique => if we have 5 and 7, we get 4 and 6 and 1 unique => 4 = 5/2*2, 6 = 7/2*2

*/

class Solution {
    
    
    
    
    public int longestPalindrome(String s) {
        int[] count = new int[128];
        for (char c : s.toCharArray())
            count[c]++;
        
        int ans = 0;
        for (int freq : count)
        {
            ans += freq/2*2;
        }
        return Math.min(ans + 1, s.length());
    }
}
