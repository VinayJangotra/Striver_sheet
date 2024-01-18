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
     public static Node insertAtTail(Node list, int K) {
           if(list==null) return new Node(K);
         Node node = list;
         while(list.next != null){
             list=list.next;
         }
        
         Node temp = new Node(K,null,list);
          list.next=temp;
         return node;
     }
 }