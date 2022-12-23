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
    
    boolean out=true;
    
    void trav(TreeNode a, TreeNode b){
        if(a==null && b==null)return;
        else if(a==null && b!=null){
            out=false;
            return;
            }
        else if(a!=null && b==null){
            out=false;
            return;
            }
        else if(a.val!=b.val){
            out=false;
            return;
            }
       trav(a.left,b.left);
       trav(a.right,b.right);
          
        }
    
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        trav(p,q);
            
            return out;
      
        
    }
}
