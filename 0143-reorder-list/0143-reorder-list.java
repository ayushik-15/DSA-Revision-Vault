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
    public void reorderList(ListNode head) {
        ListNode mid = midNode(head);
        ListNode temp = mid.next;
        mid.next = null;

        ListNode prev = null;
        ListNode curr = temp;
        ListNode next ;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev= curr;
            curr = next;
        }
        ListNode f = head;
        ListNode s = prev;

        while(s!=null){
            ListNode t1 = f.next;
            ListNode t2 = s.next;

            f.next = s;
            s.next = t1;

            f=t1;
            s=t2;
        }
    }
    private ListNode midNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}