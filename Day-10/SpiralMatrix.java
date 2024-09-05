// 54. Spiral Matrix

import java.util.ArrayList;
import java.util.List;

class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List l = spiralMatrixUtil(matrix);
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }

    private static List spiralMatrixUtil(int[][] matrix) {
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        List<Integer> l = new ArrayList<>();
        while (l.size() < matrix[0].length * matrix.length) {
            // l -> r
            for (int i = left; l.size() < matrix[0].length * matrix.length && i <= right; i++) {
                l.add(matrix[up][i]);
            }
            // t -> b
            for (int i = up + 1; l.size() < matrix[0].length * matrix.length && i <= down - 1; i++) {
                l.add(matrix[i][right]);
            }
            // r -> l
            for (int i = right; l.size() < matrix[0].length * matrix.length && i >= left; i--) {
                l.add(matrix[down][i]);
            }
            // b -> t
            for (int i = down - 1; l.size() < matrix[0].length * matrix.length && i >= up + 1; i--) {
                l.add(matrix[i][left]);
            }
            up++;
            down--;
            left++;
            right--;
        }
        return l;
    }
}