package com.brekol.srm159.div2;

/**
 * Created by brekol on 15.12.16.
 */
public class StreetParking {

    public int freeParks(String street) {
        int result = 0;
        final char[] chars = street.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (freePlace(chars, i)) {
                result++;
            }
        }
        return result;

    }

    private boolean freePlace(char[] chars, int i) {
        if ("DSB".contains(String.valueOf(chars[i]))) {
            return false;
        }

        if ((i + 1 < chars.length && chars[i + 1] == 'S') || (i - 1 > 0 && chars[i - 1] == 'S')) {
            return false;
        }

        if ((i + 1 < chars.length && chars[i + 1] == 'B') || (i + 2 < chars.length && chars[i + 2] == 'B')) {
            return false;
        }
        return true;

    }
}
