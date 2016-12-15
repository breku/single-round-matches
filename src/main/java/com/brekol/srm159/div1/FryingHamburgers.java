package com.brekol.srm159.div1;

/**
 * Created by brekol on 15.12.16.
 */
public class FryingHamburgers {
    public int howLong(int panSize, int hamburgers) {
        if (hamburgers == 0) {
            return 0;
        }
        int totalHamburgeroMinutes = hamburgers * 10;

        final int hamburgeroMinutesPerOneCook = panSize * 5;
        int r = 0;
        while (totalHamburgeroMinutes > 0) {
            totalHamburgeroMinutes -= hamburgeroMinutesPerOneCook;
            r += 5;
        }
        return r;
    }
}
