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
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//         ListNode s = headA;
//         ListNode f = headB;
//         while(s!=f){
//             if(s==null){
//                 s = headA;
//             }else{
//                 s=s.next;
//             }
//             if(f==null){
//                 f = headB;
//             }else{
//                 f=f.next;
//             }

//         }
//         return s;
//     }
// }
public class Solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode s = headA;
    ListNode f = headB;
    while (s != f) {
      // If s reaches the end of listA, move it to headB
      s = s == null ? headB : s.next;
      // If f reaches the end of listB, move it to headA
      f = f == null ? headA : f.next;
    }
    return s; // At this point, either s and f are null (no intersection) or point to the intersection node
  }
}