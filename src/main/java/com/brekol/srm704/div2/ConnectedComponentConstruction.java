package com.brekol.srm704.div2;

import java.util.Arrays;

public class ConnectedComponentConstruction {

    public String[] construct(int[] s) {

        String[][] matrix = new String[s.length][s.length];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], "N");
        }

        for (int i = 0; i < s.length; i++) {
            int need = s[i] - 1;
            for (int j = i + 1; j < s.length; j++) {
                if (s[j] > 1 && need > 0) {
                    s[j]--;
                    need--;
                    matrix[i][j] = "Y";
                    matrix[j][i] = "Y";
                }
            }
            if (need > 0) {
                return new String[0];
            }
        }

        String[] result = new String[s.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = Arrays.stream(matrix[i]).reduce("", String::concat);
        }
        return result;


    }
}
