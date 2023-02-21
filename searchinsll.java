public class searchinsll {
   private ListNode head;
   private static class ListNode{
       private int data;
       private ListNode next;

       public ListNode(int data){
           this.data=data;
           this.next=null;
       } 
   }

   public boolean search(ListNode head,int key){
        ListNode current =head;

        while(current != null){
            if(current.data==key){
                return true;
            }
            current=current.next;
        }
        return false;
   }

    public void print(int ssl){
         ListNode current=head;
         System.out.println("\nElements in Singly Linked List are :\n ");
         while(current!=null){
              System.out.print(current.data+"-->");
              current=current.next;
         }
         System.out.println("null");
    }

   public static void main(String[] args) {
    searchinsll sll=new searchinsll();
    sll.head=new ListNode(10);
    ListNode second=new ListNode(1);
    ListNode third=new ListNode(8);
    ListNode fourth=new ListNode(11);
    ListNode fifth=new ListNode(15);
    ListNode sixth=new ListNode(19);

    sll.head.next=second; //10-->1
    second.next=third;    //10-->1-->8
    third.next=fourth;    //10-->1-->8-->11 
    fourth.next=fifth;    //10-->1-->8-->11-->15
    fifth.next=sixth;     //10-->1-->8-->11-->15-->19-->null
    
    sll.print(0);
    System.out.println(sll.search(sll.head, 8));     //search for 8 in the list

   }

}
