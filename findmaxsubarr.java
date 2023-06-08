public class findmaxsubarr {
        public static double findMaxAverage(int[] nums, int k) {
          double sum = 0;
          for (int i = 0; i < k; i++)
            sum += nums[i];
          double ans = sum;
      
          for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            ans = Math.max(ans, sum);
          }
          return ans / k;
        }
      
         public static void main(String[] args) {
            int nums[]={10,20,30,40,50,60,70};
            int k=2;
            System.out.println(findMaxAverage(nums,k));
         }
      }

