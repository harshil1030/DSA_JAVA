public class nodeatend {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
           // this.next=next;
        }
    }

    public void display(){
        ListNode current=head;
        while(current != null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void insertlast(int value){
        ListNode newNode=new ListNode(value); //creating new node and pass the value in the 
        // constructor of the listnode

       if(head==null){   //if there is no node in the Linked List then we will assign a newNode to the head.
        head = newNode;
        return ;
       }
       ListNode current=head; //temporory ListNode   //startes from head Node
       while(null != current.next){     //traversed 
        current=current.next;   //iterating current to the next position like 1 2 3
           //                                                                 ^   ^
           //                                                                 |   | 
           //                                                             current current                        
        }
          current.next=newNode; //assigned a New Node at Last when we finally reached to the Last Node of Linked List
    }

    public static void main(String[] args) {
        linkedlistcycle sll =new linkedlistcycle();
        
        sll.insertlast(15);
        sll.insertlast(12);
        sll.insertlast(10);
        
        sll.display();
    }
}
