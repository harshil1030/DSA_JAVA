public class queueimp {
    private static int front,rear,capacity;
    private static int queue[];
    
    queueimp(int size){
        front=rear=0;
        capacity=size;
        queue=new int[capacity];
    }

       void enqueue(int data){
        if(capacity==rear){
            System.out.println("Queue is full");
            return;
        }
        else{
            queue[rear]=data;
            rear++;
        }

    }

    public void dequeu(){
        if(front == rear){
            System.out.println("Queue is empty");
            return;
        }
        else{
            for(int i=0;i<rear-1;i++){
                queue[i]=queue[i+1];
            }
        }       
    }

    public void queueDisplay()   
    {   
        int i;   
        if (front == rear) {   
            System.out.printf("Queue is Empty\n");   
            return;   
        }   
        for (i = front; i < rear; i++) {   
            System.out.printf(" %d , ", queue[i]);   
        }   
        return;  
    }
      public static void main(String[] args) {
       queueimp qmp=new queueimp(5);
         qmp.enqueue(10);
         qmp.enqueue(20);
         qmp.enqueue(30);
         qmp.enqueue(40);
         qmp.enqueue(50);       
         qmp.dequeu();
         qmp.queueDisplay();

        
    }    
}
