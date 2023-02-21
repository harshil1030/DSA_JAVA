public class findsingleelement {

    public static int findsingleelement(int [] arr){
        int element=0;
        for(int i=0;i<arr.length;i++){
            element=element ^ arr[i];
        }
        return element;
    }
    public static void main(String[] args) {
        int [] arr={1,1,2,3,3,4,4,5,5};
        int i;

        System.out.print("Array Elements are : ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        int element= findsingleelement(arr);
        System.out.println("\nThe Single Occuring Element is : " + element);

    }
}
