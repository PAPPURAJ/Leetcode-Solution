class Solution {
    int trav(Node n, int p){
        if(n==null)return p;
        int max=p;
        for(int i=0;i<n.children.size();i++){
            max=Math.max(max, trav(n.children.get(i), p+1));
        }
        return max;
    }


    public int maxDepth(Node root) {
        if(root==null) return 0;
        return trav(root,1);
    }
}
