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
    public int maxDepth(Node n) {
        if(n==null) return 0;
        int max=0;
        for(Node a:n.children)
        {
            int h=maxDepth(a);
            if(h>max)
            max=h;
        }
        return max+1;
    }
}
