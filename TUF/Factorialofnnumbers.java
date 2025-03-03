public class Factorialofnnumbers {

    public static int factorial(int n)
    {   
        int sum = 0;
        if(n<0) return 0;
        if(n==0 || n ==1) return 1;

        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
