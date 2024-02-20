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
    public ListNode RemoveNthFromEnd(ListNode head, int n) {
        if(head == null) return head;
        ListNode temp1 = head, temp2 = head;
        for(int i=0;i<n;i++){
            if(temp2 == null) return head;
            temp2 = temp2.next;
        }

        if(temp2 == null) return head.next;

        while(temp2.next!=null){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        temp1.next = temp1.next.next;
        return head;
    }
}