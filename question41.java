public class question41 {
    
        public static int maxSubArray(int[] nums) {
            int maxSoFar = nums[0];
            int currentSum = nums[0];
    
            for (int i = 1; i < nums.length; i++) {
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                maxSoFar = Math.max(maxSoFar, currentSum);
            }
    
            return maxSoFar;
        }
    
        public static void main(String[] args) {
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            int result = maxSubArray(arr);
            System.out.println("Maximum Subarray Sum: " + result);  // Output: 6 (subarray [4,-1,2,1])
        }
    }
    

