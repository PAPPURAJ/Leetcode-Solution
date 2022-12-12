class Solution {

    int trav(TreeNode t,int i){
        if(t==null)return i;
        return Math.max(trav(t.left,i+1), trav(t.right,i+1));
    }


    public int maxDepth(TreeNode root) {
        return trav(root,0);
    }
}
