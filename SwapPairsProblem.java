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
class SwapPairsProblem {
    public ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode();
        result.next=head;
        ListNode node = result;
        
        while(node.next!=null && node.next.next!=null){
            ListNode temp = node.next;
            node.next=node.next.next;
            temp.next=node.next.next;
            node.next.next=temp;
            
            node = node.next.next;
        }
        
        return result.next;
    }
}
