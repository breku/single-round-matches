package com.brekol.srm165.div2;

public class BritishCoins {

    public int[] coins(int pence) {
        int[] result = new int[3];
        result[0] = pence / 240;
        result[1] = (pence - (result[0] * 240)) / 12;
        result[2] = (pence - (result[0] * 240) - (result[1] * 12));
        return result;
    }
}
