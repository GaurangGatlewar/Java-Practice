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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        if(list2.val < list1.val){
            ListNode temp = list1;
            list1 = list2;
            list2 = temp;
        }
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        while((temp1.next!=null) && (temp2!=null)){
            if(temp1.next.val>temp2.val){
                ListNode temp = temp1.next;
                temp1.next = temp2;
                temp2 = temp;
            }
            temp1 = temp1.next;
        }
        if(temp1.next==null) temp1.next=temp2;
        return list1;
    }
}