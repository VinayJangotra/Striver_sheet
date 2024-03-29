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

     Node(int data, Node next, Node prev)
     {
         this.data = data;
         this.next = next;
         this.prev = prev;
     }
 };

 *****************************************************************/

 public class Solution
 {
     public static Node deleteLastNode(Node head) {
         if(head==null || head.next == null)return null;
         Node node = head;
         while(head.next.next != null){
             head= head.next;
         }
         Node temp=head.next;
         temp.prev=null;
         head.next=null;
         return node;
     }
 }