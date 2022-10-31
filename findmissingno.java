public class findmissingno {
    public static int missing(int[] arr) {
        int i;
        int n=arr.length + 1;
        int sum=n*(n+1)/2;
        for(i=0;i<arr.length;i++){
            sum=sum-n;
        }     
        return sum;
    }

    public static void main(String[] args) {

        int[] myarray={1,3,6,8,2,4,7};
        
        missing(myarray);
        System.out.println(missing(myarray));

        
    }
}
