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

 public class Solution {
    public static int getDif(Node head1, Node head2){
        int len1=0,len2=0;
        while(head1 != null || head2 != null){
            if(head1 != null){
                ++len1;
                head1=head1.next;
            }
            if(head2 != null){
                ++len2;
                head2= head2.next;
            }
        }
        return len1-len2;
    }
    public static int findIntersection(Node firstHead, Node secondHead) {
      int dif= getDif(firstHead,secondHead);
      if(dif<0){
          while(dif++ !=0)secondHead=secondHead.next;
      }
      else{
          while(dif-- !=0)firstHead= firstHead.next;
      }
      while(firstHead != null){
          if(firstHead.data == secondHead.data){
              return firstHead.data;
          }
          firstHead=firstHead.next;
          secondHead=secondHead.next;
      }
      return firstHead.data;
    }
}