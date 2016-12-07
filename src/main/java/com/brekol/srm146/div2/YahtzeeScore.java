package com.brekol.srm146.div2;

/**
 * Created by brekol on 07.12.16.
 */
public class YahtzeeScore {

    public int maxPoints(int[] toss) {

        int max = 0;
        for (int i = 0; i <= 6; i++) {
            int result = 0;
            for (int j = 0; j < toss.length; j++) {
                if (toss[j] == i) {
                    result += toss[j];
                }
            }
            if (result > max) {
                max = result;
            }
        }
        return max;
    }
}
