class Solution {
    public ListNode swapPairs(ListNode head) {
        ArrayList<Integer> v=new ArrayList<>();
        ListNode t=head;

        if(head==null)
            return head;
        else if(head.next==null)
            return new ListNode(head.val);

        while(t!=null){
            v.add(t.val);
            t=t.next;
        }

        ListNode out=new ListNode(v.get(1)),t2=out;
        int l=v.size();

        for(int i=1;i<l;i++){
            t2.next=new ListNode(i%2==0?(i+1==l?v.get(i):v.get(i+1)):v.get(i-1));
            t2=t2.next;
        }
        return out;

    }
}
