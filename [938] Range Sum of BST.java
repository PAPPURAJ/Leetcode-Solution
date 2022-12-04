class Solution {
    int sum=0;

    void trav(TreeNode t, int l, int h){
        if(t==null)return;
        if(t.val>=l && t.val<=h)
             sum+=t.val;
        trav(t.left,l,h);
        trav(t.right,l,h);
    }


    public int rangeSumBST(TreeNode root, int low, int high) {
        trav(root,low,high);
        return sum;
    }
}
