//https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    int ans;
    
    public void helper(TreeNode node, int curr)
    {
        if (node != null)
        {
            curr = (curr << 1) | node.val;
            if (node.left == null && node.right == null)
                ans += curr ;
            else
            {
                helper(node.left,curr);
                helper(node.right,curr);
            }
        }
    }
    
    
    public int sumRootToLeaf(TreeNode root) {
        ans = 0;
        helper(root,0);
        return ans;
        
    }
}
