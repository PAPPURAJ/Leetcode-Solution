//Easy process

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode out=new ListNode(),t=out;

        while(head!=null){
            if(head.val!=val){
                 out.next=new ListNode(head.val);
                 out=out.next;
            }
               
                head=head.next;
        }
 
         return t.next;    
        
    }
}






//Fast processs

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
    public ListNode removeElements(ListNode head, int val) {
        ListNode out=new ListNode(),t=out;

        while(head!=null){
            if(head.val!=val){
                 out.next=new ListNode(head.val);
                 out=out.next;
            }
               
                head=head.next;
        }
 
         return t.next;    
        
    }
}
