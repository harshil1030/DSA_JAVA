//Representation of Singly linked List
public class sll{

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
        }
    }

    public void display(){
        ListNode current=head;
        while(current != null){
            System.out.print(current.data+"-->");
            current=current.next;   
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {

        sll sl=new sll();                       //dabba just like trains
        sl.head=new ListNode(10);
        ListNode sec =new ListNode(12);
        ListNode third=new ListNode(13);
        ListNode fourth=new ListNode(15);

        sl.head.next=sec;        //dabba ne Jodo a--b--
        sec.next=third;
        third.next=fourth;
        fourth.next=null;

        sl.display();
    }
}
