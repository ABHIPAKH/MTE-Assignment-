public class question42 {
    
        public static int maxSubArray(int[] nums) {
            int[] dp = new int[nums.length];
            dp[0] = nums[0];
            int max = dp[0];
    
            for (int i = 1; i < nums.length; i++) {
                dp[i] = Math.max(nums[i], nums[i] + dp[i - 1]);
                max = Math.max(max, dp[i]);
            }
    
            return max;
        }
    
        public static void main(String[] args) {
            int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            System.out.println("Max Subarray Sum using DP: " + maxSubArray(nums));
        }
    }
    

