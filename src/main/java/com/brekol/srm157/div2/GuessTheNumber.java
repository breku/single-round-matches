package com.brekol.srm157.div2;

/**
 * Created by brekol on 15.12.16.
 */
public class GuessTheNumber {

    public int noGuesses(int upper, int answer) {

        int numberOfGuesses = 1;
        int min = 1;
        int max = upper;

        int middle = (min + max) / 2;
        while (middle != answer) {

            if (middle < answer) {
                min = middle + 1;
            } else {
                max = middle - 1;
            }
            middle = (min + max) / 2;
            numberOfGuesses++;
        }
        return numberOfGuesses;

    }
}
