//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        for (int i = 0; i < prices.length; i++)
        {
            int j = i+1;
            while (j < prices.length && prices[j] > prices[i])
                j++;
            if (j == prices.length)
                ans[i] = prices[i];
            else
                ans[i] = prices[i] - prices[j];
        }
        return ans;
    }
}

/*
Stack<Integer> stack = new Stack<>();
        int[] ans = new int[prices.length];
        
        for (int i = prices.length-1; i >= 0; i--)
        {
            int val = prices[i];
            while (!stack.empty() && stack.peek() > prices[i])
                stack.pop();
            if (!stack.empty())
            {
                val -= stack.peek();
            }
            stack.push(prices[i]);
            ans[i] = val;
        }
        return ans;
*/
