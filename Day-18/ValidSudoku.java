// 36. Valid Sudoku

import java.util.HashSet;
import java.util.Set;

class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' }, { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' }, { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' }, { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' }, { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        System.out.println(isValidSudoku(board));
    }

    private static boolean isValidSudoku(char[][] board) {
        // Check rows are unique
        for (int i = 0; i < 9; i++) {
            Set<Character> s = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (!s.contains(board[i][j]) && board[i][j] != '.') {
                    s.add(board[i][j]);
                } else if (board[i][j] != '.') {
                    return false;
                }
            }
        }

        // Check cols are unique
        for (int i = 0; i < 9; i++) {
            Set<Character> s = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (!s.contains(board[j][i]) && board[j][i] != '.') {
                    s.add(board[j][i]);
                } else if (board[j][i] != '.') {
                    return false;
                }
            }
        }

        // Check if boxes are unique

        int start[][] = { { 0, 0 }, { 0, 3 }, { 0, 6 }, { 3, 0 }, { 3, 3 }, { 3, 6 }, { 6, 0 }, { 6, 3 }, { 6, 6 } };
        for (int s[] : start) {
            Set<Character> s1 = new HashSet<>();
            for (int i = s[0]; i < s[0] + 3; i++) {
                for (int j = s[1]; j < s[1] + 3; j++) {
                    if (!s1.contains(board[i][j]) && board[i][j] != '.') {
                        s1.add(board[i][j]);
                    } else if (board[i][j] != '.') {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}