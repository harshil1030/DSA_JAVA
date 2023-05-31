import java.util.Stack;

public class stackstring {



    public static void main(String[] args) {
        Stack<String> games=new Stack<String>();
        games.add("Call of Duty");
        games.add("Super Mario");
        games.add("Valorent");

        // System.out.println(games.pop());
        // System.out.println(games.pop());

        System.out.println(games.peek());
        System.out.println(games);
        
    }
}
