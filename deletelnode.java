public class deletelnode {

    // Instance Variable
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

    public ListNode deletelast() {
        if (head == null || head.next == null) { // if head is null or if head.next i.e only one element in List then
                                                 // return head coz only remaining node in Singly linked List;
            return head;
        }
        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next = null; // break the chain
        return current;
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        // Object Initialization
        deletelnode sll = new deletelnode();

        // Node Declaration
        sll.head = new ListNode(10);
        ListNode sec = new ListNode(15);
        ListNode third = new ListNode(20);
        ListNode fourth = new ListNode(21);

        // connecting
        sll.head = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = null;
x
        sll.display();
        System.out.println(sll.deletelast().data);
        sll.display();

    }
}
