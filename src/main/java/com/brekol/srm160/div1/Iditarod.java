package com.brekol.srm160.div1;

public class Iditarod {

    public int avgMinutes(String[] times) {

        double sum = 0;
        for (int i = 0; i < times.length; i++) {
            sum += getMinutes(times[i]);
        }
        return (int) Math.round(sum / times.length);
    }

    private double getMinutes(String time) {
        final int start = 8 * 60;
        final String[] splittedTime = time.split(":| |, ");
        int h = Integer.parseInt(splittedTime[0]);
        final int m = Integer.parseInt(splittedTime[1]);
        final String pmOrAm = splittedTime[2];
        final int day = Integer.parseInt(splittedTime[4]);


        if (h == 12 && pmOrAm.equals("AM")) {
            h = 0;
        } else if (pmOrAm.equals("PM") && h != 12) {
            h += 12;
        }
        return (day - 1) * 24 * 60 + (h * 60 + m) - start;
    }


}
