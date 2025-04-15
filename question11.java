public class question11 {
    
        public static int[] twoSum(int[] arr, int target) {
            int left = 0, right = arr.length - 1;
            while (left < right) {
                int sum = arr[left] + arr[right];
                if (sum == target) return new int[]{left, right};
                else if (sum < target) left++;
                else right--;
            }
            return new int[]{-1, -1};
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 2, 3, 4, 6};
            int target = 7;
            int[] result = twoSum(arr, target);
            System.out.println("Indexes: " + result[0] + ", " + result[1]);
        }
    }
    

