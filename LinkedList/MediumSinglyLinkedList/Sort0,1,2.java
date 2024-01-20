
public class Solution {
    public static Node deleteMiddle(Node head) {
        int count=0;
        Node temp = head;
        if(head==null || head.next == null)return null;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==2){
            head.next=null;
            return head;
        }
        Node prev=head;
        Node node = head;
        int n=count/2;
        while(n-->1){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return node; 
    }
}