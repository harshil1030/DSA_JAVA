public class arrays {

    public static void printarray(int[] myarray){
        int n=myarray.length;
        int i;

        System.out.println("Printing Array:");
        for(i=0;i<n-1;i++){
            System.out.println(myarray[i]);
        }
    }

    public static void printrevarray(int[] arr){
       int n=arr.length;
       int i; 
       System.out.println("\nPrinting Reverse Array");
       for(i=n-1;i>=0;i--){
        System.out.println(arr[i]);
       }
    }

    public static void main(String[] args) {

        // int[] array=new int[6];
        // array[0]=1;
        // array[1]=2;
        // array[2]=3;
        // array[3]=4;
        // array[4]=5;
        // array[5]=6;

        int i;
        int[] myarray={5,10,15,20,25,30};
        
        printarray(myarray);
        printrevarray(myarray);
        
        // for(i=0;i<array.length-1;i++){
        //     System.out.println(array[i]);
        // }
        
             
    }

}
