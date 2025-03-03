/*Steps to Do Binary Search  */
// can be applicable to Sorted array only
// find the middle Element  --> mid
// if target > mid => Search in right side of Sorted array 
//if target <mid => Search in Ledt side of Sortes Array 
// mid == target then => tadaaaa 

// middle = start+end/2
//also
// middle = start + (end-start) / 2+

/*Why Binary Search */
// find the number of Comparisions in Worst Case Scenerio

//target moto hoy toh start ne change karo  -> Searching shift towards Right Side --> start = mid + 1;
//target nano hoy toh End ne Change karo  --> Searching Shifts towards Left Side ---> end = mid -1;


public class binarysearch {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,45,50,55,60};

        int target = 58;

        int start=0;
        int end=arr.length-1;

        while(start<=end)                     //means Sorted Array
        {
            int mid = start + (end-start)/2;

            if(target<arr[mid])
            {
                end=mid-1;
            }
            else if (target>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                System.out.println(mid);
                break;
            }
        }
        
               
    }

}
