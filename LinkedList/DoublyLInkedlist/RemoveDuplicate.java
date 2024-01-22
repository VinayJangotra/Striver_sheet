/********************************************************

    Following is the class structure of the Node class:
    
    class Node
    {
        public:
            int data;
            Node next;
            Node(int data)
            {
                this.data = data;
                this.next = null;
            }
    };

********************************************************/

public class Solution {
    public static Node uniqueSortedList(Node head) {
        Node curr=head;
        while(curr.next!=null){
            if(curr.data==curr.next.data){
            Node temp=curr.next.next;
            curr.next=temp;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}