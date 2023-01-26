public class linkedlistcycle {

    private ListNode head;    //instance variable of type listnode //holding Linked List
    private static class ListNode{
        private int data; //generic type
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        } 
    }

    public boolean hasCycle(listNode head){
        ListNode fast = head;
        ListNode slow = head;
 
        while(fast != null && fast.next != null){ //No Loop as both of them are Null but if  equal then return true;
            slow = slow.next;
            fast = fast.next.next;
 
            if(slow == fast)
                return true;
        }
        return false;   // False if there is no Cycle. 
    }
    public static void main(String[] args) {
        
    }
}
