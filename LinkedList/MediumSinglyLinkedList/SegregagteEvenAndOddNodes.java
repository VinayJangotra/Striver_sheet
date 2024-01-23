/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

 public class Solution
 {
     public static Node segregateEvenOdd(Node head)
     {
         Node dummy = new Node(-1);
         Node curr=dummy;
         Node temp=head;
         Node temp2=head;
         while(temp != null){
            if(temp.data%2==0){
                Node node = new Node(temp.data);
                curr.next=node;
                curr= curr.next;
            }
             temp=temp.next;
         }
         while(temp2 != null){
             if(temp2.data%2 != 0){
                 Node node = new Node(temp2.data);
                 curr.next= node;
                 curr= curr.next;
             }
             temp2= temp2.next;
         }
         return dummy.next;
     }
 }
 