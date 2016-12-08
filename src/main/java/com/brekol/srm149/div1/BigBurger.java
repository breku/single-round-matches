package com.brekol.srm149.div1;

import java.util.Arrays;

/**
 * Created by brekol on 08.12.16.
 */
public class BigBurger {

    public int maxWait(int[] arrival, int[] service) {
        int[] t = new int[arrival.length];
        t[0] = 0;

        for (int i = 1; i < arrival.length; i++) {
            t[i] = t[i - 1] + service[i - 1] - (arrival[i] - arrival[i - 1]);
        }
        return Arrays.stream(t).max().getAsInt();
    }
}
