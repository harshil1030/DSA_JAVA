//Finding Minimum Element from an Array
public class minarray {
    public static int minimumfromarray(int[] arr){ // int[] arr ko yeh method ne naya name diya

        int min=arr[0];                //box mai ek element ko assigned kar diya taki hum use compare kar paye.
        int i;
        for(i=1;i<arr.length;i++){    // Line mai sabko check karo 
            if(arr[i]<min){           //naya wala element(arr[i]) kam hai min assigned element se
                min=arr[i];           // to hi minimum box mai element ko rakho
            }
        }
        return min;                   //box(balti) main method ko dekhar aao.
    }   

    public static void main(String[] args) {
        int[] myarray={5,9,3,15,1,2};    // array declare kiya

        minimumfromarray(myarray);       // yaha baithe baithe method ko awaz lagaya(myarray name se)
        System.out.println(minimumfromarray(myarray));  //print





        
    }

}
