class Solution {

    int trav(TreeNode n,String b){
        if(n.left==null && n.right==null)
            return Integer.parseInt(b+String.valueOf(n.val),2);
        int p=0,q=0;
        if(n.left!=null) p=trav(n.left, b+String.valueOf(n.val));
        if(n.right!=null) q=trav(n.right, b+String.valueOf(n.val));  
        return p+q;

    }

    public int sumRootToLeaf(TreeNode root) {
        return trav(root,"");   
    }
}
