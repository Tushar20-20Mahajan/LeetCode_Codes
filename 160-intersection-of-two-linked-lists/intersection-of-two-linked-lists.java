/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode s = headA;
        ListNode f = headB;
        while(s!=f){
            if(s==null){
                s = headA;
            }else{
                s=s.next;
            }
            if(f==null){
                f = headB;
            }else{
                f=f.next;
            }

        }
        return s;
    }
}