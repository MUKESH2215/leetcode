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
    public int f(TreeNode root,int[] maxi)
    {
        if(root==null) return 0;
        int ls=Math.max(f(root.left,maxi),0);
        int rs=Math.max(f(root.right,maxi),0);
        int curr=ls+rs+root.val;
        if(curr>maxi[0]) maxi[0]=curr;
        return root.val+Math.max(ls,rs);
    }
    public int maxPathSum(TreeNode root) {
        int[] maxi=new int[1];
        maxi[0]=Integer.MIN_VALUE;
        int h=f(root,maxi);
        return maxi[0];
        }
}