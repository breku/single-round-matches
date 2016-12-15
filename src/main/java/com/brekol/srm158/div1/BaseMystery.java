package com.brekol.srm158.div1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brekol on 15.12.16.
 */
public class BaseMystery {

    public int[] getBase(String equation) {
        final String[] numbers = equation.split("\\+|=");
        List<Integer> validBases = new ArrayList<>();
        for (int base = 2; base <= 20; base++) {
            if (valid(base, numbers)) {
                validBases.add(base);
            }
        }
        return validBases.stream().mapToInt(Integer::valueOf).toArray();
    }

    private boolean valid(int base, String[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            try {
                Integer.parseInt(numbers[i], base);
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return Integer.parseInt(numbers[0], base) + Integer.parseInt(numbers[1], base) == Integer.parseInt(numbers[2], base);
    }
}
