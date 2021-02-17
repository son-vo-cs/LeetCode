//https://leetcode.com/problems/swap-for-longest-repeated-character-substring/
int[] count = new int[26];
        for (int i = 0; i < text.length(); i++)
            count[text.charAt(i) - 'a']++;
        
        int len1 = 0;
        int len2 = 0;
        int len3 = 0;
        
        char ch1 = '.';
        char ch2 = '.';
        char ch3 = '.';
        int max = 0;
        
        for (int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if (c == ch3)
                len3++;
            else{
                ch1 = ch2;
                ch2 = ch3;
                ch3 = c;
                
                len1 = len2;
                len2 = len3;
                len3 = 1;
            }
            
            if ((ch1 == ch3 &&  len2 == 1 &&  len1+len3 < count[ch3-'a'] ))           
                max = Math.max(max, len1+len3+1);
            else if (len3 < count[ch3-'a'] )
                    max = Math.max(max, len3+1);
            else 
                max = Math.max(max, len3);
            }
        
        return max;
