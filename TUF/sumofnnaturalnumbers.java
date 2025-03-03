public class sumofnnaturalnumbers {

        public static void sum(int n,int x)
        {
             if(n<1)
             {
                System.out.println(n);
                return;
             }
             sum(n-1,x+1);
        }
        public static void main(String[] args){
            sum(10,0);
        }
}
