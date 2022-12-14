class Solution {
    public void reorderList(ListNode head) {
        ListNode l=head;
        ArrayList<Integer> arrayList=new ArrayList<>();
        while(l!=null){
            arrayList.add(l.val);
            l=l.next;
        }
        
        l=head;

        int n=arrayList.size();
        for(int i=0;i<n/2;i++){
            l.val=arrayList.get(i);
            l=l.next;
            l.val=arrayList.get(n-1-i);
            l=l.next;   
        }
        if(n%2==1)l.val=arrayList.get(n/2);
    }
}
