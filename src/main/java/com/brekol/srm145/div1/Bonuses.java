package com.brekol.srm145.div1;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by brekol on 06.12.16.
 */
public class Bonuses {

    public int[] getDivision(int[] points) {
        int[] result = new int[points.length];

        final int pointsSum = IntStream.of(points).sum();
        for (int i = 0; i < points.length; i++) {
            double employePercent = points[i] * 100.0d / pointsSum;
            result[i] = (int)employePercent;
        }
        final int percentSum = IntStream.of(result).sum();
        int percentLeft = 100 - percentSum;


        while (percentLeft > 0){
            final int max = Arrays.stream(points).max().getAsInt();
            for (int i = 0; i < points.length; i++) {
                if(max == points[i]){
                    result[i]++;
                    points[i] = -1;
                }
            }
            percentLeft--;
        }
        return result;
    }
}
