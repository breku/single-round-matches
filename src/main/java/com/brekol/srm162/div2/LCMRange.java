package com.brekol.srm162.div2;

public class LCMRange {

    public int lcm(int first, int last) {

        for (int i = 1; ; i++) {
            int counter = 0;
            for (int j = first; j <= last; j++) {
                if (i % j == 0) {
                    counter++;
                }
                if (last - first + 1 == counter) {
                    return i;
                }
            }
        }
    }
}
