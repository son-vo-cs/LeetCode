//https://leetcode.com/problems/minimum-depth-of-binary-tree/
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
    int depth = Integer.MAX_VALUE; 
    
    public void helperTraverse(TreeNode root, int d)
    {
        if (root == null)
            return;
        if (root.left == null && root.right == null)
            depth = Math.min(depth,d);
        helperTraverse(root.left,d+1);
        helperTraverse(root.right,d+1);
    }
    
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        helperTraverse(root,1); 
        return depth; 
    }
} 
