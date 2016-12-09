package com.brekol.srm153.div1;

/**
 * Created by brekol on 09.12.16.
 */
public class Inventory {


    public int monthlyOrder(int[] sales, int[] daysAvailable) {

        double sum = 0;
        int numberOfMonthsCounted = 0;
        for (int i = 0; i < sales.length; i++) {
            if (daysAvailable[i] != 0) {
                sum += 30.0d * sales[i] / daysAvailable[i];
                numberOfMonthsCounted++;
            }
        }
        double res = sum / numberOfMonthsCounted;
        return (int) Math.ceil(res - 1e-9);

    }

}
