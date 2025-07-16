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
    int preval;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        preval=postorder.length-1;
        return helper(inorder,postorder,0,inorder.length-1);
    }
    public TreeNode helper(int[] in,int[] po,int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        int inorderindex=0;
        int rootval=po[preval--];
        TreeNode root=new TreeNode(rootval);
        for(int j=s;j<=e;j++)
        {
            if(in[j]==rootval)
            {
                inorderindex=j;
            }
        }
        root.right=helper(in,po,inorderindex+1,e);
        root.left=helper(in,po,s,inorderindex-1);
        return root;
    }

}