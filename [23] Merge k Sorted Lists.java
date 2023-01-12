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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode out=new ListNode(),t=out;
        PriorityQueue<Integer> pq=new PriorityQueue<>((i,j)->(i-j));


            for(ListNode i:lists)
                while(i!=null){
                     pq.add(i.val);
                     i=i.next;
                }
                   
            while(!pq.isEmpty()){
                out.next=new ListNode(pq.poll());
                out=out.next;
            }
            return t.next;    
    }
}
