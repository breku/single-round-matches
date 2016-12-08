package com.brekol.srm148.div2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by brekol on 08.12.16.
 */
public class DivisorDigits {

    public int howMany(int number) {

        final List<Integer> divisors = Arrays.stream(String.valueOf(number).split("")).map(Integer::valueOf).collect(Collectors.toList());

        int result = 0;
        for (Integer divisor : divisors) {
            if (divisor != 0 && number % divisor == 0) {
                result++;
            }
        }
        return result;

    }
}
