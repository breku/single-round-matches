package com.brekol.srm163.div2;

public class Inchworm {

    public int lunchtime(int branch, int rest, int leaf) {
        int result = 1;

        for (int i = 0; i <= branch; i += rest) {
            if (i != 0 && i % leaf == 0) {
                result++;
            }
        }
        return result;

    }
}
