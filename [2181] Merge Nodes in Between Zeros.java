// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode in=head,out=new ListNode(0);
        ListNode t=out;

        while(in.next!=null){
            out.val+=in.val;
            if(in.next.val==0 && in.next.next!=null){
                out.next=new ListNode(0);
                out=out.next;
            }in=in.next;
        }
        
        return t;
    }
}
