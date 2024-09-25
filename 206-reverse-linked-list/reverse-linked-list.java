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
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ArrayList<Integer> list= new ArrayList<>();
//         ListNode temp = head;
//         while(temp!=null){
//             list.add(temp.val);
//             temp=temp.next;
//         }

//         Collections.reverse(list);

//         ListNode dummy = new ListNode(0);
//         ListNode current=dummy;
//         for(int i=0;i<list.size();i++){
//             current.next= new ListNode(list.get(i));
//             current=current.next;
//         }

//         ListNode abc=(dummy.next);
//         return abc;

        
//     }
// }

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        while(head != null){
            ListNode next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        return temp;
    }
}
