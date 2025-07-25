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
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List l1=new ArrayList<>();
        if(root==null) return l1;
        l1.add(root.val);
        for(Node x:root.children)
        l1.addAll(preorder(x));
        return l1;
    }
}