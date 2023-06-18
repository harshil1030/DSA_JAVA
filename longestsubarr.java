public class longestsubarr {
    
    public static int longestSubarray(int[] A) { 
        int i = 0, j, count = 1;
        for (j = 0; j < A.length; j++) { 
            if (A[j] == 0) count--;            //agar array of j equal hai 0 to count-- karo
            if (count < 0 && A[i++] == 0) count++;  // iska matlab hai ki agar count 0 se kam hai to i++ karo
        }
        return j - i - 1;
    }
    //overall yeh kehna chahta hai ki agar 0 se kam hai to i++ karo aur agar 0 hai to count-- karo
    //kyo karo kyoki agar 0 hai to count-- karo aur agar count 0 se kam hai to i++ karo


    public static void main(String[] args) {
        int [] A={1,1,0,1,1,1};
        System.out.println(longestSubarray(A));

    }

}
