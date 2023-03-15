public class cycleinsll {
    private ListNode head;

      // private Class
      private static class ListNode {
        private int data;
        private ListNode next;

        // constructor
        public ListNode(int data) {
            this.data = data;
        }
    }

    public ListNode getStartingNode(ListNode slow){
        ListNode temp=head;
        while(slow!=temp){
            temp=temp.next;
            slow=slow.next;
        }
        return temp;
    }


    public hello(ListNode head) {
        ListNode fast = head;
        ListNode slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return getStartingNode(slow);
            }

        }
    }


    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;

        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }



    public static void main(String[] args) {
        
        // Object Initialization
        cycleinsll sll = new cycleinsll();

        // Node Declaration
        sll.head = new ListNode(10);
        ListNode sec = new ListNode(15);
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(21);
        

        // connecting
        sll.head = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = sec;

        // sll.display();
        System.out.println(sll.hasCycle(sll.head));
        // sll.display(); 
    }
}
