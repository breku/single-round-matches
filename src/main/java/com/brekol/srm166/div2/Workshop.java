package com.brekol.srm166.div2;

import java.util.ArrayList;
import java.util.List;

public class Workshop {

    public int pictureFrames(int[] pieces) {
        List<Integer[]> listOfThrees = new ArrayList<>();
        for (int i = 0; i < pieces.length; i++) {
            for (int j = i + 1; j < pieces.length; j++) {
                for (int k = j + 1; k < pieces.length; k++) {
                    Integer[] three = new Integer[3];
                    three[0] = pieces[i];
                    three[1] = pieces[j];
                    three[2] = pieces[k];
                    listOfThrees.add(three);
                }
            }
        }
        int result = 0;
        for (int i = 0; i < listOfThrees.size(); i++) {
            if (isOk(listOfThrees.get(i))) {
                result++;
            }
        }
        return result;

    }

    private boolean isOk(Integer[] integers) {
        if (integers[0] + integers[1] > integers[2] &&
                integers[1] + integers[2] > integers[0] &&
                integers[0] + integers[2] > integers[1]) {
            return true;
        }
        return false;
    }
}
