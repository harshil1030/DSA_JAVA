public class resizeanarray {
    public static void resize(int[] arr,int capacity) {
       int i;

        int[] temp=new int[capacity];                          //new temp array declaration.
        for(i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        arr=temp;

        for(i=0;i<arr.length;i++){                            //printing array of new capacity
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] myarray={1,2,3,4,5};                      //initial Array size is only 5;

        resize(myarray, 8);                     //but after increasing the capacity we can store upto 8 elements in an array.

        
    }
}
