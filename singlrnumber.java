public class singlrnumber {

// using XOR for Optimal Solution.
//0 0    0
//0 1    1
//1 0    1
//1 1    0

    public static void singleNumber(int[] numbers) {
        int result = 0;
        for (int number: numbers) {
           result ^= number; // Logical XOR operator 
        }
        System.out.println(result);       //return result;
      }
    public static void main(String[] args) {
        int arr[]={4,1,1,2,2};
        singleNumber(arr);
    }
}

