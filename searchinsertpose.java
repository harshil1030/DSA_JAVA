public class searchinsertpose {
    public static void main(String[] args) {
        int arr[]={10,20,30,50,60,70,80,90};
        int target = 40;
        int start = 0;
        int end = arr.length;

        while (start<end) {
            int mid = start + (end-start)/2;
            if(target==arr[mid])
            {
                System.out.println(target);
            }      
            if(target>arr[mid])
            {
                start = mid+1;
            }
            else{
                end=mid;
            }
        }
        System.out.println(start);

    }
}
