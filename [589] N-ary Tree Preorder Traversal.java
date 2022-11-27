
class Solution {

    List<Integer> list=new ArrayList<>();

    void trav(Node n){
        if(n==null)
            return;
        list.add(n.val);
        for(int i=0;i<n.children.size();i++){
            trav(n.children.get(i));
        }
    }

    public List<Integer> preorder(Node root) {
        trav(root);
        return list;
    }
}
