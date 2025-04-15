public class question4 {
    
        public static boolean canSplitEqualSum(int[] arr) {
            int total = 0, leftSum = 0;
            for (int num : arr) total += num;
            for (int i = 0; i < arr.length - 1; i++) {
                leftSum += arr[i];
                if (leftSum == total - leftSum) return true;
            }
            return false;
        }
    
        public static void main(String[] args) {
            int[] arr = {2, 4, 1, 3, 5};
            System.out.println("Can split? " + canSplitEqualSum(arr));
        }
    }
    

