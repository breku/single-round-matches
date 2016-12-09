package com.brekol.srm152.div1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by brekol on 09.12.16.
 */
public class LeaguePicks {

    public int[] returnPicks(int position, int friends, int picks) {

        int picksLeft = picks;
        int currentPosition = 1;

        int[] friendsTable = new int[friends + 2];
        Arrays.fill(friendsTable, 0);
        friendsTable[position] = 1;

        List<Integer> result = new ArrayList<>();

        boolean goup = true;
        boolean godown = false;
        int number = 1;
        while (picksLeft > 0) {
            if (currentPosition == position) {
                result.add(number);
            }


            if (goup) {
                currentPosition++;
                if (currentPosition == friends) {
                    goup = false;
                    godown = true;
                    currentPosition++;
                }
            } else if (godown) {
                currentPosition--;
                if (currentPosition == 1) {
                    goup = true;
                    godown = false;
                    currentPosition--;
                }
            }

            number++;
            picksLeft--;

        }
        return result.stream().mapToInt(Integer::intValue).toArray();

    }
}
