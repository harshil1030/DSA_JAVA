import java.util.Stack;

public class stackchar {

    public static void main(String[] args) {
        String str="Hello";
        char[] charArray=str.toCharArray();

        for(char c :charArray){
            System.out.println(c);
        }

        Stack<Character> color=new Stack<Character>();   
        color.add('A');
        color.add('B');
        color.add('C'); 
     
        System.out.println(color);
        System.out.println(color.peek());
        

    }
}
