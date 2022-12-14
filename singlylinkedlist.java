import java.util.LinkedList;


//import java.util.Scanner;
//Lecture no: 35 
//Topic: Represent a Singly linked List in java.
//there are total 3 types of Linked List 
//1.Singly Linked List 2.Doubly linked list 3.Circular Linked List




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



    // Printing Elements of Linkedlist 
    public void print(int ssl){
        ListNode current=head;
        System.out.println("\nElements in Singly Linked List are :\n ");
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }



     //Finding the Length of linked list.

    public void count(int ssl){
        int count=0;

        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;
        }
        System.out.println(count);
    }
   
    // Reversing the Linked List 
    
    public ListNode reverseList(ListNode head){
        ListNode prev=null;

        while(head!=null){
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }





    public void addnode(int value){
        ListNode newnode=new ListNode(value);
        newnode.next=head;
        head=newnode;
    }


    //Printing the length of linked list

    public int length(int sll){

        //if(head=null){
        //    return 0;
      //  }

        int count=0;
        ListNode current=head;
        while(current!=null){
            count++;
            current=current.next;

        }
        return count;
    }





    public static void main(String[] args) {
        singlylinkedlist sll = new singlylinkedlist();

        sll.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);
        ListNode fifth=new ListNode(15);
        ListNode sixth=new ListNode(19);


        LinkedList<String> animals=new LinkedList<>();

        animals.add("Dog");
        animals.add("cat");
        animals.add("cow");

        System.out.println("Animals :" +animals);
        

        //now we will connect them to form a Chain

       sll.head.next=second; //10-->1 
       second.next=third;    //10-->1-->8
       third.next=fourth;    //10-->1-->8-->11
       fourth.next=fifth;
       fifth.next=sixth;
       sixth.next=null;

     //  System.out.println("Length :" +length(sll));


        //Creating Linked List Using Simple Way 
       
        



      // Scanner sl=new Scanner(System.in);
      // System.out.println("Enter the Elements you want to Enter in LL :");
      // String input= sl.nextLine();
       
    sll.print(0);
      //caling Methods 
    //    sll.print(0);   
    //    sll.count(0);
    //    sll.addnode(17);





    }
}
