/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

 public class Solution
 {
     public static Node reverseDLL(Node head)
     { 
         if(head==null || head.next==null)return head;
         Node last=null;
         Node curr=head;
         while(curr != null){
             last=curr.prev;
             curr.prev=curr.next;
             curr.next=last;
             curr=curr.prev;
         }
         return last.prev;
     }
 }

public static Node reverseDLL(Node  head)
{
    if(head==null || head.next==null){
        return head;
    }
    Node back=null;
    Node curr=head;
    while(curr!=null){
        back=curr.prev;
        curr.prev=curr.next;
        curr.next=back;
        curr=curr.prev;
    }
    return back.prev;
}
