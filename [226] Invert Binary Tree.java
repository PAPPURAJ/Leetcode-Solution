class Solution {

    void trav(TreeNode in,TreeNode out){
        out.val=in.val;
        if(in.left!=null){
             out.right=new TreeNode();
             trav(in.left,out.right );
        }
           
        if(in.right!=null){
             out.left=new TreeNode(); 
             trav(in.right,out.left );
        }  

    }

    public TreeNode invertTree(TreeNode root) {
        if(root==null)return root;
        TreeNode out=new TreeNode();
        trav(root,out);
        return out;
    }
}
