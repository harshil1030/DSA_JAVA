public class reverseanarray {

    public static void reverse(int[] arr, int start, int end)
    {   
        if(start>=end)
        {
           return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }

    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50};
        int start = 0;
        int end = arr.length-1;

        reverse(arr, start, end);
        for (int num : arr) {
            System.out.println(num + " ");
        }
    }
}
