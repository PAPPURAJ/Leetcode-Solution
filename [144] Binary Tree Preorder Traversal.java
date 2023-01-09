/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    void trav(TreeNode t,List<Integer> in){
        if(t==null)
            return ;
        in.add(t.val);
        trav(t.left,in);
        trav(t.right,in);
    }
   
    public List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> in=new ArrayList<>();
         trav(root,in);
         return in;
    }
}
