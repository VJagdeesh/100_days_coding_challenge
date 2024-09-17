// 977. Squares of a Sorted Array

class SquaresOfASortedArray {
    public static void main(String[] args) {
        int[] arr = { -7, -3, 2, 3, 11 };
        SquaresOfASortedArrayUtil(arr);
    }

    private static void SquaresOfASortedArrayUtil(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        int ans[] = new int[arr.length];
        int l = 0;
        int r = arr.length - 1;
        int i = arr.length - 1;
        while (l <= r) {
            if (arr[l] < arr[r]) {
                ans[i] = arr[r];
                r--;
                i--;
            } else {
                ans[i] = arr[l];
                l++;
                i--;
            }
        }
        for (int j : ans) {
            System.out.print(j + " ");
        }
    }
}