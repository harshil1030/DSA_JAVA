class rotatelist {


    private ListNode head;    //instance variable of type listnode //holding Linked List
    private static class ListNode{
        private int data; //generic type
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        } 
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


    public ListNode rotateRight(ListNode head, int k) {
      if (head == null || head.next == null|| k==0) return head;
  
      // close the linked list into the ring
      ListNode old_tail = head;
      int n;
      for(n = 1; old_tail.next != null; n++){
          old_tail = old_tail.next;
      }
      old_tail.next = head;
  
      ListNode new_tail = head;
      for (int i = 0; i < n - k % n - 1; i++){
          new_tail = new_tail.next;
      }
        
      ListNode new_head = new_tail.next;
  
      // break the ring
      new_tail.next = null;
  
      return new_head;
    }


    public static void main(String[] args) {
        


        rotatelist sll = new rotatelist();

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


    
         sll.rotateRight(sixth, 3);
         sll.print(0);
    }
  }