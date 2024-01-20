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
    public ListNode deleteMiddle(ListNode head) {
        int count=0;
        ListNode temp = head;
        if(head==null || head.next == null)return null;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==2){
            head.next=null;
            return head;
        }
        ListNode prev=head;
        ListNode node = head;
        int n=count/2;
        while(n-->1){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return node;
    }
}