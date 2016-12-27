package com.brekol.srm163.div1;

import java.util.Arrays;

public class Rochambo {


    public int wins(String opponent) {
        final String[] opponentSings = opponent.split("");
        int result = 0;
        if (opponentSings[0].equals("S")) {
            result++;
        }
        if (opponentSings[1].equals("S")) {
            result++;
        }

        for (int i = 2; i < opponentSings.length; i++) {
            final String prev1 = opponentSings[i - 1];
            final String prev2 = opponentSings[i - 2];
            final String expected = getExpected(prev1, prev2);
            if (expected.equals(opponentSings[i])) {
                result++;
            }
        }

        return result;
    }

    private String getExpected(String prev1, String prev2) {
        if (prev1.equals(prev2)) {
            return prev1;
        }
        if (Arrays.asList("R", "S").contains(prev1) && Arrays.asList("R", "S").contains(prev2)) {
            return "P";
        }

        if (Arrays.asList("P", "S").contains(prev1) && Arrays.asList("P", "S").contains(prev2)) {
            return "R";
        }

        return "S";

    }
}
