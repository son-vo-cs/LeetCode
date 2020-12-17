class Solution {
    public int maxScore(String s) {
        int ones = 0 ;
        char[] str = s.toCharArray();
        
        for (char c : str)
        {
            if (c == '1')
                ones++;
        }
        
        int ans = ones-1;
        for (int i = 0; i < s.length()-1; i++)
        {   

            char c = str[i];
            if (c == '0')
                ones++;
            else
                ones--;
            ans = Math.max(ans, ones);
            // System.out.println(i + " " + ones);
        }
        return ans;
    }
}
