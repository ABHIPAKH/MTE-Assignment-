public class question15 {
    
        public static int kthSmallest(int[][] matrix, int k) {
            int n = matrix.length;
            int low = matrix[0][0];
            int high = matrix[n - 1][n - 1];
    
            while (low < high) {
                int mid = (low + high) / 2;
                int count = countLessEqual(matrix, mid);
    
                if (count < k)
                    low = mid + 1;
                else
                    high = mid;
            }
    
            return low;
        }
    
        private static int countLessEqual(int[][] matrix, int val) {
            int n = matrix.length;
            int i = n - 1, j = 0, count = 0;
    
            while (i >= 0 && j < n) {
                if (matrix[i][j] <= val) {
                    count += i + 1;
                    j++;
                } else {
                    i--;
                }
            }
    
            return count;
        }
    
        public static void main(String[] args) {
            int[][] matrix = {
                {1, 5, 9},
                {10, 11, 13},
                {12, 13, 15}
            };
            int k = 8;
            System.out.println("Kth Smallest Element: " + kthSmallest(matrix, k)); // Output: 13
        }
    }
    

