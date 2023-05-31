import java.util.Stack;

public class stackimp {
    public static void main(String[] args) {
        
        //Calling the Instance of Class Stack From java.util.stack
        Stack<Integer> s=new Stack<Integer>();

        //Pushing the Element From the Stack 
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println("The Stack is : "+ s);

        //Popping an Element From the Stack 
        Integer sp = (Integer) s.pop();
        System.out.println("Popped Element :" + sp);
        System.out.print("The stack after pop is: " + s);

        //Searching Element in The Stack 

        Integer pos=(Integer) s.search(10);

        if(pos==-1){
        System.out.print("\nThe Search Element is not found in Stack");
        }
        else{
            System.out.print("\nThe Element 9 is Found at " + pos + "th position in Stack");
        }
        
    }
}
