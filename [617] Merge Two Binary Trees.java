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
    public TreeNode mergeTrees(TreeNode l, TreeNode r) {
        if(l==null)return r;
        if(r==null) return l;
        l.val+=r.val;
        l.left=mergeTrees(l.left, r.left);
        l.right=mergeTrees(l.right, r.right);
        return l;
    }
}
