package com.brekol.srm165.div1;

import java.util.ArrayList;
import java.util.List;

public class ParallelSpeedup {

    public int numProcessors(int k, int overhead) {

        int min = k;
        List<Integer> times = new ArrayList<>();
        times.add(0);
        for (int i = 2; ; i++) {

            final Integer prevTime = times.get(i - 2);
            int newTime = (i - 1) + prevTime;
            times.add(newTime);
            int communication = newTime * overhead;

            int totalTime = (int) Math.ceil(k / i) + communication;
            if (totalTime < min) {
                min = totalTime;
            } else {
                return i - 1;
            }
        }

    }
}
