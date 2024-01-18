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
 };

 *****************************************************************/

 public class Solution {
    public static Node constructLL(int []arr) {
        Node node = new Node(arr[0]);
        Node head= node;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i]);
            node.next=temp;
            node=node.next;
            temp=temp.next;
        }
        return head;
    }
}