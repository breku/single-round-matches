package com.brekol.srm146.div1;

/**
 * Created by brekol on 07.12.16.
 */
public class RectangularGrid {

    public long countRectangles(int width, int height) {

        long count = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i != j) {
                    count += (width - (j - 1)) * (height - (i - 1));
                }
            }
        }
        return count;

    }
}
