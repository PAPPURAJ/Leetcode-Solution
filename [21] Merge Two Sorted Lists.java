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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null && list2==null)return list1;
        ListNode out=new ListNode(),t=out;

        while(list1!=null || list2!=null){
            if(list1!=null && list2!=null && list1.val<list2.val){
                t.val=list1.val;
                list1=list1.next;
               
            }else if(list1!=null && list2!=null && list1.val>=list2.val) {
                t.val=list2.val;
                list2=list2.next;
            }else if(list1!=null) {
                t.val=list1.val;
                list1=list1.next;
            }else{
                t.val=list2.val;
                list2=list2.next;
            }
            if(list2!=null || list1!=null){
                t.next=new ListNode();
            t=t.next;
            }
            
        }
        return out;
        
    }
}
