/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> l1=new ArrayList<>();
        if(root==null) return l1;
        for(Node x:root.children)
        {
            l1.addAll(postorder(x));
        }
        l1.add(root.val);
        return l1;
    }
}