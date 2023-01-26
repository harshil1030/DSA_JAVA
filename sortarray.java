//Sorting an Array Medium Leetcode Array Problems..
public class sortarray {

    public static void sortaarray(int[] arr){
        int i,j;
        int temp;

        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }   
            }
        }
        System.out.print("\nSorted Array   :");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {  //Main Method 
        int[] myarray={5,4,3,2,1};
        int i;
        System.out.print("Original Array :");
        for(i=0;i<myarray.length;i++){
            System.out.print(myarray[i]+" ");
        }

        sortaarray(myarray);                           //Calling above Method.
        
    }
}
