class Solution {
    int out=0;
    void trav(TreeNode node,boolean isLeft){
        if(node==null)return;
        if(isLeft && node.left==null && node.right==null)
            out+=node.val;
        trav(node.left,true);
        trav(node.right,false);
    }

    public int sumOfLeftLeaves(TreeNode root) {
        trav(root, false);
        return out;
    }
}
