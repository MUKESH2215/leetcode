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
    int RPL(TreeNode tptr,int sum_so_far)
    {
        if(tptr==null) return sum_so_far;
        int right_sum=RPL(tptr.right,sum_so_far);
        tptr.val=tptr.val+right_sum;
        int left_sum=RPL(tptr.left,tptr.val);
        return left_sum;
    }
    public TreeNode bstToGst(TreeNode root) {
        RPL(root,0);
        return root;
    }
}