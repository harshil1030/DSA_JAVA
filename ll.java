public class ll {
    //private listnode head;
    private ListNode head;  

    private static class listnode{     //creating a class Listnode.. We are creating a simple 
                                      //a structure of a specifi node list i.e listnode
                                    //we are creating a Dabba over here which is known as Listnode.
        private int data;
        private ListNode next;

        public Listnode(int data){
            this.data=data;
            this.next=null;
        }
        
    }


    public static void main(String[] args) {
        LinkedList sll=new LinkedList<>();

        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);
        ListNode fifth=new ListNode(15);
        ListNode sixth=new ListNode(19);

        
       sll.head.next=second; //10-->1 
       second.next=third;    //10-->1-->8
       third.next=fourth;    //10-->1-->8-->11
       fourth.next=fifth;
       fifth.next=sixth;
       sixth.next=null;


    }
  
}
