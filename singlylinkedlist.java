//Lecture no: 35 
//Topic: Represent a Singly linked List in java.
//there are total 3 types of Linked List 
//1.Sinly Linked List 2.Doubly linked list 3.Circular Linked List

public class singlylinkedlist {
    private ListNode head;    //instance variable of type listnode //holding Linked List
    private static class ListNode{
        private int data; //generic type
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        } 
    }
    public static void main(String[] args) {
        singlylinkedlist sll = new singlylinkedlist();
        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);

        //ne we will connect them to form a Chain

       sll.head.next=second; //10-->1 
       second.next=third;    //10-->1-->8
       third.next=fourth;    //10-->1-->8-->11
    }
}
