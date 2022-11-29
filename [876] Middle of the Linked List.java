class Solution {

    public ListNode middleNode(ListNode head) {
        int total=0;
        ListNode t=head;
        while(t!=null){
            total++;
            t=t.next;
        }
        
        total=total/2;
        t=head;
        while(total--!=0)
            t=t.next;
        return t;    
        
    }
}
