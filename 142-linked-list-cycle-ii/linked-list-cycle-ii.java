// /**
//  * Definition for singly-linked list.
//  * class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode(int x) {
//  *         val = x;
//  *         next = null;
//  *     }
//  * }
//  */
// import java.util.ArrayList;

// public class Solution {
//     public ListNode detectCycle(ListNode head) {
//         if(head == null || head.next == null){
//             return null;
//         }
        
//         // Change the ArrayList to store ListNode references
//         ArrayList<ListNode> list = new ArrayList<>();
//         ListNode temp = head;
        
//         // Iterate through the linked list
//         while(temp != null){
//             // Check if the list already contains this node (not the value)
//             if(list.contains(temp)){
//                 return temp; // Return the node where the cycle begins
//             }
//             // Add the current node to the list
//             list.add(temp);
//             temp = temp.next;
//         }
//         return null; // No cycle detected
//     }
// }

public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if (fast == null || fast.next == null) return null;
        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
}
