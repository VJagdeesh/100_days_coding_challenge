// 74. Search a 2D Matrix

class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int t = matrix.length * matrix[0].length;
        int l = 0;
        int r = t - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            int i = mid / matrix[0].length;
            int j = mid % matrix[0].length;
            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        System.out.println(searchMatrix(matrix, target)); // prints: true
    }
}