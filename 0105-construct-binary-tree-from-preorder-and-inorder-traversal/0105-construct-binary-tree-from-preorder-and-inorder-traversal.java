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
//     public TreeNode buildTree(int[] preorder, int[] inorder) {
//         public TreeNode helper
//     }
// }

// class BuildBT{
    int preindex=0;
    public TreeNode buildTree(int[]p,int[]i)
    {
        return helper(p,i,0,i.length-1);
    }
    public TreeNode helper(int []pre,int []in,int start,int end)
    {
        if(start>end)
        {
            return null;
        }
        int rootval=pre[preindex++];
        TreeNode root=new TreeNode(rootval);
        int inorderindex=0;
        
        for(int i=start;i<=end;i++)
        {
            if(rootval==in[i])
            {
                inorderindex=i;
                break;
            }
        }
        root.left=helper(pre,in,start,inorderindex-1);
        root.right=helper(pre,in,inorderindex+1,end);
        return root;
    }
    public void displaypreOrder(TreeNode n)
    {
        if(n!=null)
            {
               System.out.print(n.val+" ");
                displaypreOrder(n.left);
                displaypreOrder(n.right);
            }
    }
}