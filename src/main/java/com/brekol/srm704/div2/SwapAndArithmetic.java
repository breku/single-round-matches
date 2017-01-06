package com.brekol.srm704.div2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapAndArithmetic {

    public String able(int[] x) {

        List<int[]> sequences = getSequences(x);


        for (int i = 0; i < sequences.size(); i++) {
            if (isSeqPossible(sequences.get(i))) {
                return "Possible";
            }
        }
        return "Impossible";

    }

    private boolean isSeqPossible(int[] x) {
        final int d = x[1] - x[0];

        for (int j = 2; j < x.length; j++) {
            if (x[j] - d != x[j - 1]) {
                return false;
            }
        }
        return true;

    }

    private List<int[]> getSequences(int[] x) {
        List<int[]> result = new ArrayList<>();
        for (int i = 0; i < x.length; i++) {
            getSeq(result, getLeft(x, i), x[i], new int[x.length], 0);
        }
        return result;
    }

    private int[] getLeft(int[] x, int index) {
        if (x.length == 0) {
            return new int[0];
        }
        int[] result = new int[x.length - 1];
        for (int i = 0, j = 0; i < x.length; i++) {
            if (i != index) {
                result[j++] = x[i];
            }
        }
        return result;
    }

    private void getSeq(List<int[]> result, int[] elementsLeft, int newSeqElement, int[] newSeq, int depth) {
        newSeq[depth] = newSeqElement;
        if (elementsLeft.length == 0) {
            result.add(Arrays.copyOf(newSeq, newSeq.length));
            return;
        }
        for (int i = 0; i < elementsLeft.length; i++) {
            getSeq(result, getLeft(elementsLeft, i), elementsLeft[i], newSeq, depth + 1);
        }
    }
}
