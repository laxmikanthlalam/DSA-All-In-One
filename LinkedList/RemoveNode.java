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
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return null;
        }
        ListNode temp=head;
        int l=0;
        while(temp!=null)
        {
            temp=temp.next;
            l++;
        }
        int k=l-n;
        if(k==0)
        {
            head=head.next;
            return head;
        }
        ListNode temp1=head;
        while(--k>0)
        {
            temp1=temp1.next;
        }
        temp1.next=temp1.next.next;
        return head;
    }
}
