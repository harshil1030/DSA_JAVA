public class movezeros {
    
    public static void movezerosatend(int[] arr ,int n){              //Method 1;
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


    public static void moverzeroatfront(int[] arr,int n){           //Method 2(By myself)
        int i,temp; 
        int j=n-1;                                      //j pointer is set at last index of array

        for(i=n-1;i>0;i--){                             // i pointer is set at last index of array 
            if(arr[i]!=0 && arr[j]==0){                 //condition is same in both the cases...
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){                             //if jth element is non zero then decrease the j pointers value by 1.
                j--;
            }
        }

        System.out.print("\nFinal Array     :");     //printing the final array where the zeros are at Front.
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
          movezerosatend(myarray, 5);            //printing zeros at last
        // moverzeroatfront(myarray, 5);           // printing zeros at front
     
    }
}
