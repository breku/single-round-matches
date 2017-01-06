package com.brekol.srm168.div1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberGuesser {

    public int guess(String leftOver) {

        if (Integer.valueOf(leftOver) < 100) {
            for (int possibleRemoved = 1; possibleRemoved < 10; possibleRemoved++) {
                final int newOnFirstPosition = getNewOnFirstPosition(possibleRemoved, leftOver);
                if (isOk(newOnFirstPosition)) {
                    return possibleRemoved;
                }
            }
        } else {
            for (int possibleRemoved = 1; possibleRemoved < 10; possibleRemoved++) {
                for (int position = 0; position < 3; position++) {
                    final int newOnFirstPosition = getNewOnPosition(position, possibleRemoved, leftOver);
                    if (isOk(newOnFirstPosition)) {
                        return possibleRemoved;
                    }
                }
            }
        }
        return -1;
    }

    private int getNewOnPosition(int position, int possibleRemoved, String leftOver) {
        int[] res = new int[4];
        Arrays.fill(res, -1);
        res[position] = possibleRemoved;
        int c = 0;
        for (int i = 0; i < 4; i++) {
            if (res[i] == -1) {
                res[i] = leftOver.charAt(c);
                c++;
            }
        }
        final String reduce = Arrays.stream(res).boxed().map(String::valueOf).reduce("", String::concat);
        return Integer.valueOf(reduce);
    }

    private boolean isOk(int newNumber) {
        for (int i = 1; i < 9999; i++) {
            if (goodNumbers(i, newNumber)) {
                return true;
            }

        }
        return false;
    }

    private boolean goodNumbers(int i, int newNumber) {
        final int sum = i + newNumber;
        if (sameDigits(sum, i)) {
            return true;
        }
        return false;
    }

    private boolean sameDigits(int n1, int n2) {
        final List<String> l1 = Arrays.asList(String.valueOf(n1).replaceAll("0", "").split(""));
        final List<String> l2 = Arrays.asList(String.valueOf(n2).replaceAll("0", "").split(""));
        Collections.sort(l1);
        Collections.sort(l2);
        if (l1.size() == l2.size()) {
            for (int i = 0; i < l1.size(); i++) {
                if (!l1.get(i).equals(l2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;

    }

    private int getNewOnFirstPosition(int possibleRemoved, String leftOver) {
        return Integer.valueOf(possibleRemoved + leftOver);
    }
}
