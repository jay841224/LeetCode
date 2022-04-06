import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public static boolean isValidSudoku(char[][] board) {
        // col
        for (int row = 0; row < 9; row++) {
            Set<Character> colsSet = new HashSet<>();
            List<Character> normalList = new ArrayList<>();
            for (int col = 0; col < 9; col++) {
                Character character = board[row][col];
                if (character != '.') {
                    colsSet.add(character);
                    normalList.add(character);
                }
            }
            if (colsSet.size() != normalList.size()) {
                return false;
            }
        }
        // row
        for (int col = 0; col < 9; col++) {
            Set<Character> colsSet = new HashSet<>();
            List<Character> normalList = new ArrayList<>();
            for (int row = 0; row < 9; row++) {
                Character character = board[row][col];
                if (character != '.') {
                    colsSet.add(character);
                    normalList.add(character);
                }
            }
            if (colsSet.size() != normalList.size()) {
                return false;
            }
        }

        // square
        int realRow = 0;
        int realCol = 0;
        while (true) {
            Set<Character> colsSet = new HashSet<>();
            List<Character> normalList = new ArrayList<>();
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    Character character = board[row + realRow][col + realCol];
                    if (character != '.') {
                        colsSet.add(character);
                        normalList.add(character);
                    }
                }
            }
            if (colsSet.size() != normalList.size()) {
                return false;
            }
            realCol += 3;
            if (realCol > 6) {
                realCol = 0;
                realRow += 3;
            }
            if (realRow > 6) {
                break;
            }
        }
        return true;
    }
}