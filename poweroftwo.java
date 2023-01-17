public class poweroftwo {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
         if(n==1){
            return true; //Exception
        }
         if(n%2==1){
            return false;
        }
        return(isPowerOfTwo(n/2));
    }
    public static void main(String[] args) {
        System.out.println("Hello World");
       
    }
}
