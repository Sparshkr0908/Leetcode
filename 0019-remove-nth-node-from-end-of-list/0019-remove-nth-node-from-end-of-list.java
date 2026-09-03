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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        if(n == size){
            return head.next;
        }


        temp = head;
        int idx = size - n - 1;

        
        for(int i = 0; i<idx; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;

        return head;
    }
}