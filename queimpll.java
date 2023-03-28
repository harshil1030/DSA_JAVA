// Queue Implementation Using Linked List 

public class queimpll {
    private Node front,rear;
    private int queueSize;

    private class Node{
        int data;
        Node next;
    }
    
    public queimpll(){
        front = null;   
        rear = null;
        queueSize=0;
    }

    public boolean isEmpty(){
        return(queueSize==0);
    }

    public int dequeu(){
        int data=front.data;
        front=front.next;
        if(isEmpty()){
            rear=null;
        }
        queueSize--;
        System.out.println("Data Removed : "+data);
        return data;
    }

    public void enqueue(int data){
        Node oldNode=rear;
        rear=new Node();
        rear.data=data;
        rear.next=null;
        if(isEmpty()){
            front=rear;
        }
        else{
            oldNode.next=rear;
        }
        queueSize++;
        System.out.println("Data Added: "+data);
    }

    public void print_frontRear(){
        System.out.println("Front data will be :"+front.data);
        System.out.println("Rear Data Will be :"+rear.data);
    }
    public static void main(String[] args) {
        queimpll qmp=new queimpll();

        System.out.println("Enqueue :");
        qmp.enqueue(20);
        qmp.enqueue(30);
        qmp.enqueue(40);
        qmp.enqueue(50);
        qmp.enqueue(60);
        qmp.print_frontRear();
        System.out.println("            ");
        System.out.println("Dequeue :");
        qmp.dequeu();
        qmp.dequeu();
        qmp.dequeu();
        qmp.print_frontRear();


    }
}
