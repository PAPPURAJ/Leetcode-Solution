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

    boolean trav(TreeNode n1, TreeNode n2){
        if(n1==null && n2==null)return true;
        if((n1==null & n2!=null)|| (n1!=null & n2==null) ||(n1.val!=n2.val))return false;
        return trav(n1.left,n2.right) && trav(n1.right,n2.left);
    }

    public boolean isSymmetric(TreeNode root) {
        return trav(root, root);
    }
}
