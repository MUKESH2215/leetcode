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
    int preval=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(preorder,inorder,0,preorder.length-1);
    }
    public TreeNode helper(int[]pre,int[]in,int s,int e)
    {
        if(s>e)
        {
            return null;
        }
        int inorderindex=0;
        int rootval=pre[preval++];
        TreeNode root=new TreeNode(rootval);
        for(int i=s;i<=e;i++)
        {
            if(rootval==in[i])
            {
                inorderindex=i;
                break;
            }
        }
        root.left=helper(pre,in,s,inorderindex-1);
        root.right=helper(pre,in,inorderindex+1,e);
        return root;
    }
    public void  preorder(TreeNode n)
    {
        if(n!=null)
        {
            System.out.print(n.val);
            preorder(n.left);
            preorder(n.right);
        }
    }
}
