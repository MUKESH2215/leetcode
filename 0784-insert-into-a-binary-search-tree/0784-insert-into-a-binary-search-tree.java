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
    public TreeNode insertIntoBST(TreeNode root, int v) {
        return helper(root,v);
        
    }
    public TreeNode helper(TreeNode n,int v)
    {
    
        if(n==null) return new TreeNode(v);
        if(v>n.val)
        {
            n.right=helper(n.right,v);
        }
        else 
        {
            n.left=helper(n.left,v);
        }
        return n;
    }
}

