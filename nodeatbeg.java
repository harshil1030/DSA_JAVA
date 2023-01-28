public class nodeatbeg {                         //Listnode Class OR Structure 
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            //this.next=next;
        }
    }

    public void display(){
        ListNode current = head;   //initially the current pointer is on head
        while(current != null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }

    public void insertFirst(int value){                          //method to add A Listnode at the Beginning of the LinkedList
        ListNode newNode=new ListNode(value); 
        newNode.next=head;
        head=newNode;
    }


    public static void main(String[] args) {
        
        nodeatbeg sll =new nodeatbeg();
        sll.insertFirst(11);
        sll.insertFirst(10);
        sll.insertFirst(9);
        sll.display();
        
    }
   
}
