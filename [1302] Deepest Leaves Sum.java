class Solution {

    int count=0,sum=0;

    void count(TreeNode root,int level){
        if(count<level)
            count=level;
        if(root.left!=null)
            count(root.left,level+1);
        if(root.right!=null)
            count(root.right,level+1);    
    }

    void trav(TreeNode root,int level){
        if(count==level)
            sum+=root.val;
        if(root.left!=null)
            trav(root.left,level+1);
        if(root.right!=null)
            trav(root.right,level+1);    
    }
    public int deepestLeavesSum(TreeNode root) {
        count(root,1);
        trav(root,1);
        return sum;
    }
}v
