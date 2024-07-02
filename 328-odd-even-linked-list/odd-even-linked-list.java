class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        
        ListNode temp1 = head;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (temp1 != null) {
            current.next = new ListNode(temp1.val);
            current = current.next;
            if (temp1.next != null) {
                temp1 = temp1.next.next;
            } else {
                break;
            }
        }

        ListNode temp2 = head.next;
        while (temp2 != null) {
           current.next = new ListNode(temp2.val);
            current = current.next;
            if (temp2.next != null) {
                temp2 = temp2.next.next;
            } else {
                break;
            }
        }

       
        
        

        return dummy.next;
    }
}