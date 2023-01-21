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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();
        if(root==null)return al;
        Queue<TreeNode> queue=new LinkedList<>(),t=new LinkedList<>();
        queue.add(root);
            List<Integer> l=new LinkedList<>();
        while(!queue.isEmpty()){
            TreeNode tn=queue.poll();
            l.add(tn.val);
            if(tn.left!=null)
                t.add(tn.left);
            if(tn.right!=null)
                t.add(tn.right);
            if(queue.isEmpty()){
                queue=t;
                t=new LinkedList<>();
                al.add(l);
                l=new LinkedList<>();
            }
        }
        return al;        
    }
}
