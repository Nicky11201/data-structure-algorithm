/* 15 minutes solution need to improve */

import java.util.*;
public class ValidSudoku {
    public boolean isValidSudoku (char [] [] board) {
        int row = board.length;
        int col = board[0].length;

        boolean answer = true;

        for (int i = 0; i < row; i = i + 1) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < col; j = j + 1) {
                char ch = board [i][j];

                if (ch == '.') {
                    continue;
                }
                if (ch < '1' || ch > '9') {
                    answer = false;
                }


                if (set.contains(ch)) {
                    answer = false;
                }
                set.add(ch);
            }
        }

        for (int i = 0; i < col; i = i + 1) {
            HashSet<Character> set = new HashSet<>();
            for (int j = 0; j < row; j = j + 1) {
                char ch = board [j][i];

                if (ch == '.') {
                    continue;
                }
                if (ch < '1' || ch > '9') {
                    answer = false;
                }


                if (set.contains(ch)) {
                    answer = false;
                }
                set.add(ch);
            }
        }
        int count = 1;
        while (count < 4) {
        int index = 1;
        while (index < 4) {
            HashSet<Character> set = new HashSet<>();
            for (int i = index * 3 - 3; i < index * 3; i = i + 1) {
            for (int j = 0; j < 3; j = j + 1) {
                if (count == 1) {
                char ch = board [i][j];

                if (ch == '.') {
                    continue;
                }
                if (ch < '1' || ch > '9') {
                    answer = false;
                }


                if (set.contains(ch)) {
                    answer = false;
                }
                set.add(ch);
            } else if (count == 2) {
                char ch = board [i][j + 3];

                if (ch == '.') {
                    continue;
                }
                if (ch < '1' || ch > '9') {
                    answer = false;
                }


                if (set.contains(ch)) {
                    answer = false;
                }
                set.add(ch);
            } else if (count == 3) {
                char ch = board [i][j + 6];

                if (ch == '.') {
                    continue;
                }
                if (ch < '1' || ch > '9') {
                    answer = false;
                }


                if (set.contains(ch)) {
                    answer = false;
                }
                set.add(ch);
            }
            }
        }

        index = index + 1;
        }
        count = count + 1;
    }

        return answer;
    }
}
