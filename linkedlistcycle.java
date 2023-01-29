public class linkedlistcycle {

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
        System.out.println("null");
    } 


    public void hascycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast != null && fast.next != null){ //No Loop as both of them are Null but if  equal then return true;
            slow = slow.next;
            fast = fast.next.next;
 
            if(slow == fast)
                System.out.println("True : There is a Cycle in Linked List ");
                //return true;
          
        }
            System.out.println("false : There is No Cycle in Linked List");  
        //return false;   // False if there is no Cycle. 
    }
    // public void insertlast(int value){
    //     ListNode newNode=new ListNode(value); //creating new node and pass the value in the 
    //     // constructor of the listnode

    //    if(head==null){   //if there is no node in the Linked List then we will assign a newNode to the head.
    //     head = newNode;
    //     return ;
    //    }
    //    ListNode current=head; //temporory ListNode   //startes from head Node
    //    while(null != current.next){     //traversed 
    //     current=current.next;   //iterating current to the next position like 1 2 3
    //        //                                                                 ^   ^
    //        //                                                                 |   | 
    //        //                                                             current current                        
    //     }
    //       current.next=newNode; //assigned a New Node at Last when we finally reached to the Last Node of Linked List
    // }

    public static void main(String[] args) {
        linkedlistcycle sll =new linkedlistcycle();
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
       
       
        sll.display();
        sll.hascycle(sll.head);
    }
}
