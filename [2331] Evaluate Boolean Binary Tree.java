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
    

    int calc(TreeNode root){
        return root.left==null?root.val:root.val==2?calc(root.left)|calc(root.right):calc(root.left)&calc(root.right);
    }

    public boolean evaluateTree(TreeNode root) {
        return calc(root)==0?false:true;
    }
}
