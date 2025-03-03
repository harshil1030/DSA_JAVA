public class numbersusingrecursion{

    public static void sample(int a, int b)
    {
        if(a>b)
        {
            return;
        }
        System.out.println(a);
        sample(a+1,b);
    }

    public static void main(String[] args) {
        //System.out.println(sample(1,10));
        sample(1,10);
    }
}
