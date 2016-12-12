package com.brekol.srm156.div1;

/**
 * Created by brekol on 12.12.16.
 */
public class BombSweeper {

    public double winPercentage(String[] board) {

        char[][] chars = getChars(board);

        int okChars = 0;
        int bombs = 0;
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {

                if (ok(chars, i, j)) {
                    okChars++;
                }

                if (chars[i][j] == 'B') {
                    bombs++;
                }

            }
        }

        if (bombs == 0) {
            return 100;
        }

        return (okChars * 100.0d / (bombs + okChars)) - 1e-9;

    }

    private boolean ok(char[][] chars, int i, int j) {
        for (int k = -1; k < 2; k++) {
            for (int l = -1; l < 2; l++) {
                try {
                    if (chars[i + k][j + l] == 'B') {
                        return false;
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
        return true;
    }

    private char[][] getChars(String[] board) {
        char[][] chars = new char[board.length][board[0].length()];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length(); j++) {
                chars[i][j] = board[i].charAt(j);
            }
        }
        return chars;
    }
}
