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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode temp = new ListNode();
        temp.next = head;
        int count =1;
        ListNode prev = temp;
        while(count < left){
          prev= prev.next;
          count++;
        }
        ListNode current = prev.next;
        ListNode next = current.next;
        while(count<right){
          current.next = next.next;
          next.next = prev.next;
          prev.next = next;
          next = current.next;
          count++;
        }
        return temp.next;
    }
}