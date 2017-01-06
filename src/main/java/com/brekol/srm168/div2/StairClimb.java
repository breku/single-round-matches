package com.brekol.srm168.div2;

public class StairClimb {

    public int stridesTaken(int[] flights, int stairsPerStride) {

        int result = 0;
        for (int i = 0; i < flights.length; i++) {
            final double ceil = Math.ceil(flights[i] / (double) stairsPerStride);
            result += ceil;
            if (i < flights.length - 1) {
                result += 2;
            }
        }
        return result;
    }

}
