package com.brekol.srm157.div1;

/**
 * Created by brekol on 12.12.16.
 */
public class Salary {


    public int howMuch(String[] arrival, String[] departure, int wage) {

        double total = 0;
        for (int i = 0; i < arrival.length; i++) {
            final String arrivalTime = arrival[i];
            final String departureTime = departure[i];
            total += getPay(arrivalTime, departureTime, wage);
        }
        return (int)total;

    }

    private double getPay(String arrivalTime, String departureTime, int wage) {
        final int secA = getSec(arrivalTime);
        final int secD = getSec(departureTime);

        final int secInMiddle = getSecInMiddle(secA, secD);
        final int totalSec = secD - secA;

        return secInMiddle / 3600.0d * wage + (totalSec - secInMiddle) / 3600.0d * 1.5 * wage;

    }

    private int getSecInMiddle(int a, int d) {

        final int sec06 = getSec("06:00:00");
        final int sec18 = getSec("18:00:00");

        if (a >= sec06 && a < sec18 && d >= sec06 && d < sec18) {
            return d - a;
        } else if (a < sec06 && d < sec18 && d > sec06) {
            return d - sec06;
        } else if (a >= sec06 && a < sec18 && d >= sec18) {
            return sec18 - a;
        } else if (a < sec06 && d >= sec18) {
            return sec18 - sec06;
        }
        return 0;

    }

    private int getSec(String time) {
        final Integer h = Integer.valueOf(time.split(":")[0]);
        final Integer m = Integer.valueOf(time.split(":")[1]);
        final Integer s = Integer.valueOf(time.split(":")[2]);
        return h * 60 * 60 + m * 60 + s;

    }
}
