class Solution {
    ArrayList<Integer> al=new ArrayList<>();

    void trav(TreeNode t){
        if(t.left!=null)
            trav(t.left);
        if(t.right!=null)
            trav(t.right);
        al.add(t.val);    
    }


    public TreeNode increasingBST(TreeNode root) {
            trav(root);
            int size=al.size();
            if(size==0)
                return root;
            Collections.sort(al);
            TreeNode out=new TreeNode(al.get(0)),p=out;
            for(int i=1;i<size;i++){
               
                    p.right=new TreeNode(al.get(i));
                    p=p.right;
                
            }   
       return out; 
    }
}
