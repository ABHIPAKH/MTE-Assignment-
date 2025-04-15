public class question2 {

    
        public static int[] createPrefixSum(int[] arr) {
            int[] prefix = new int[arr.length];
            prefix[0] = arr[0];
            for (int i = 1; i < arr.length; i++) {
                prefix[i] = prefix[i - 1] + arr[i];
            }
            return prefix;
        }
    
        public static int rangeSum(int[] prefix, int L, int R) {
            if (L == 0) return prefix[R];
            return prefix[R] - prefix[L - 1];
        }
    
        public static void main(String[] args) {
            int[] arr = {3, 5, 2, 7, 1};
            int[] prefix = createPrefixSum(arr);
            int L = 1, R = 3;
            System.out.println("Sum from " + L + " to " + R + " is: " + rangeSum(prefix, L, R));
        }
    }
    
