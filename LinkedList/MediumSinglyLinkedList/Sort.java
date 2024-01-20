class Solution {
    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode temp=new ListNode(0);
        ListNode node= temp;
        while(left != null && right != null){
            if(left.val<right.val){
                temp.next=left;
                temp=temp.next;
                left=left.next;
            }
            else{
                temp.next=right;
                temp=temp.next;
                right=right.next;
            }
            if(left != null){
                temp.next=left;
            }
            if(right != null){
                temp.next=right;
            }
        }
        return node.next;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)return head;
        ListNode mid=middle(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;
        
        return merge(sortList(left),sortList(right));
    }
}