//https://leetcode.com/problems/palindromic-substrings/
/*
Given a string, your task is to count how many palindromic substrings in this string.

The substrings with different start indexes or end indexes are counted as different substrings even they consist of same characters.
*/

class Solution {
    public int countSubstrings(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++)
        {
            int center1 = expan(s,i,i);
            int center2 = expan(s,i,i+1);
            result += center1 + center2;
        }
        return result;
    }
    
    
    public int expan(String s, int left, int right)
    {
        int count = 0;
        while (left >= 0 && right <= s.length()-1 && s.charAt(left) == s.charAt(right))
        {
            count++;
            left--;
            right++;
        }
        return count; 
    }
}
