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
    int fun(TreeNode tptr)
    {
        if(tptr==null)
        {
            return 0;
        }
        int left_depth=fun(tptr.left);
        int right_depth=fun(tptr.right);
        return 1+Math.max(left_depth,right_depth);
    }
    public int maxDepth(TreeNode root) {
        return fun(root);
        
    }
}