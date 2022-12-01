/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    TreeNode out;

    void trav(TreeNode in,int v){
        if(in.val==v) out=in;
        else if(in.left!=null)trav(in.left,v);
        if(in.right!=null)trav(in.right,v);
         
    }

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
         trav(cloned,target.val);
         return out;
    }
}
