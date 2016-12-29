package com.brekol.srm167.div2;

public class EyeDrops {


    public double closest(int sleepTime, int k) {


        final double firstInterval = 24.0d / k;
        if (isOk(sleepTime, firstInterval)) {
            return firstInterval * 60;
        }

        final int dayTime = 24 - sleepTime;
        final double interval = dayTime / (k - 1.0);
        return interval * 60;
    }

    public boolean isOk(int sleepTime, double firstInterval) {
        for (int i = 0; i < 24; i += firstInterval) {
            if (i > 24 - sleepTime) {
                return false;
            }
        }
        return true;
    }
}
