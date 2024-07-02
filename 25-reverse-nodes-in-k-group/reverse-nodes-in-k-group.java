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



/*node class of the linked list

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

*/

class Solution
{
    public static ListNode reverseKGroup(ListNode node, int k)
    {
        //Your code here
        if(node==null || node.next==null ){
            return node;
        }
        ArrayList<Integer> elements = new ArrayList<>();
        ListNode temp = node;
        while(temp!=null){
            elements.add(temp.val);
            temp=temp.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        if(elements.size()%k==0){
            for(int i=0;i<elements.size();i=i+k){
                for(int j =i+k-1;j>=i;j--){
                    list.add(elements.get(j));
                    
                }
            }
        }
        else{
            int s = elements.size()%k;
             for(int i=0;i<elements.size()-s;i=i+k){
                for(int j =i+k-1;j>=i;j--){
                    list.add(elements.get(j));
                    
                }
            }
            
            for(int i=elements.size()-s;i<elements.size();i++){
                list.add(elements.get(i));
            }
            
        }
        
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for(int i=0;i<list.size();i++){
            current.next=new ListNode(list.get(i));
            current = current.next;
        }
        
        return dummy.next;
        
        
    }
}