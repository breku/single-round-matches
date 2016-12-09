package com.brekol.srm151.div1;

/**
 * Created by brekol on 09.12.16.
 */
public class Archimedes {

    public double approximatePi(int numSides) {
        double beta = 360.0d / numSides;
        double alfa = (180.0d - beta) / 2;

        return (numSides * Math.sin(Math.toRadians(beta))) / (2 * Math.sin(Math.toRadians(alfa)));
    }
}
