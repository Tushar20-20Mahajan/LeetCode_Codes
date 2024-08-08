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
   PriorityQueue<Integer> list = new PriorityQueue<Integer>();

    for(int i=0;i<lists.length;i++){
        ListNode current = lists[i];
        while(current!=null){
            list.add(current.val);
            current = current.next;
        }
    }
    ListNode dummy = new ListNode(0);
    ListNode temp = dummy;
    while(!list.isEmpty()){
        temp.next = new ListNode(list.poll());
        temp = temp.next;
    } 
    return dummy.next;   
    }
}