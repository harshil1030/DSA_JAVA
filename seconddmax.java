public class seconddmax {
    
    public static int secmax(int[] arr){
        int max=Integer.MIN_VALUE;
        int secomax=Integer.MIN_VALUE;
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]>max){
                secomax=max;
                max=arr[i];
            }
            else if(arr[i]>secomax && arr[i]!=max){
                secomax=arr[i];
            }
        }
        return secomax;
    }


    public static int secndmax(int arr[],int total){
        int i,j,temp;
        for(i=0;i<total;i++){
            for(j=i+1;j<total;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr[total-2];
    }
    
    public static void main(String[] args) {
        int []myarray={12,34,2,34,33,1};

        secmax(myarray);  
        System.out.println(secmax(myarray));

      //  secndmax(myarray,6);
       // System.out.println(secndmax(myarray,6));    


    }
}
