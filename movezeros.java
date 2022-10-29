public class movezeros {
    
    public static void movezerosatend(int[] arr ,int n){
        int i;
        int j=0;                               //focus on zeroth elements.
        int temp;
        for(i=0;i<n;i++){                     //focus on non zero Elemnts.
            if(arr[i]!=0 && arr[j]==0){      //if i'th element is non zero and j'th element is zero then Swap OPeration is followed.
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){                    //if j'th elememt is non zero then Increment pointer j by 1.
                j++;
            }
        }

        System.out.print("\nFinal Array     :");
        for(j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
  
    
    public static void main(String[] args) {
        int[] myarray={0,1,0,4,12};

        System.out.print("Original Array  :");
        for(int i=0;i<myarray.length;i++){
            System.out.print(myarray[i]+" ");
        } 
        movezerosatend(myarray, 5);
        
     
    }
}
