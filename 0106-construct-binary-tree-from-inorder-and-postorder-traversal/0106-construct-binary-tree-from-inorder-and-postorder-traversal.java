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
    public TreeNode helper(int[] i,int[] p,int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        int inorderindex=0;
        int rootval=p[preval--];
        TreeNode root=new TreeNode(rootval);
        for(int j=s;j<=e;j++)
        {
            if(i[j]==rootval)
            {
                inorderindex=j;
            }
        }
        root.right=helper(i,p,inorderindex+1,e);
        root.left=helper(i,p,s,inorderindex-1);
        return root;
    }

}