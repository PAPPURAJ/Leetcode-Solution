class Solution {

    public boolean trav(TreeNode root, int targetSum,int s) {
        if(root==null)return false;
        s+=root.val;
        boolean out=false;
        if(targetSum==s && root.left==null && root.right==null)
            return true;  
        if(root.left!=null)
            out=out||trav(root.left, targetSum,s);
        if(root.right!=null)
            out=out||trav(root.right, targetSum,s);
        return out;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        return trav(root,targetSum,0);
    }
}
