public class mergearray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4};
        int arr2[]={5,6,7,8};

        int i;

        int a=arr1.length;
        int b=arr2.length;
        int merged[]=new int[a+b];
        
        for(i=0;i<merged.length;i++){
            System.out.println(merged[i]);
        }
    }
}
