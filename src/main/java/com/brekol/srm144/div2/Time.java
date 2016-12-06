package com.brekol.srm144.div2;

/**
 * Created by brekol on 06.12.16.
 */
public class Time {

    public String whatTime(int seconds) {

        int hours = seconds / 3600;

        int secondsLeft = seconds - hours * 3600;
        int minutes = secondsLeft / 60;
        secondsLeft = seconds - hours * 3600 - minutes * 60;

        return String.format("%s:%s:%s", hours, minutes, secondsLeft);

    }
}
