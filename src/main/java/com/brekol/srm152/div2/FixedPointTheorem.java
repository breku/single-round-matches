package com.brekol.srm152.div2;

/**
 * Created by brekol on 09.12.16.
 */
public class FixedPointTheorem {

    double cycleRange(double R) {
        double x = 0.25;
        for (int i = 0; i < 200000; i++) {
            x = R * x * (1.0d - x);
        }

        double min = x;
        double max = x;
        for (int i = 0; i < 1000; i++) {
            x = R * x * (1.0d - x);
            min = Math.min(x, min);
            max = Math.max(x, max);

        }
        return max - min;
    }
}
