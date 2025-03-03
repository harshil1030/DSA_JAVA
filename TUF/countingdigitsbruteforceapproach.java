public class countingdigitsbruteforceapproach {

    public static int countdigits(int arr[],int n)
    {
        int count = 0;
        for(int i=0; i < arr.length; i++)
        {
            if(arr[i]==n)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 2;
        int arr[] = {1,2,3,4,2,2,4,52};
        System.out.println("Output :" +countdigits(arr,n));
    }
}
