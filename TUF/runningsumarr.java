import java.util.Arrays;

public class runningsumarr {
    public static int[] prefixsum(int nums[])
    {
        int n = nums.length;
        int arr[] = new int[n];

        arr[0] = nums[0];

        for(int i=1; i<arr.length; i++)
        {
            arr[i] = arr[i-1] + nums[i];
        }
        return arr;
    }


    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int result[] = prefixsum(nums);
        System.out.println(Arrays.toString(result));
    }
}
