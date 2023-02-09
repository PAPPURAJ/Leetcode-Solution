/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {

    Node join(Node l, Node r){
        l.next=r;
        if(l.left!=null) l.left=join(l.left,l.right);
        if(l.right!=null)l.right=join(l.right,r.left);
        if(r.left!=null) r.left=join(r.left,r.right);
        return l;
    }

    public Node connect(Node root) {
        if(root==null) return root;
        if(root.left!=null) root.left= join(root.left,root.right);
        return root;
        
    }
}
