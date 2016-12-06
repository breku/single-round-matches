package com.brekol.srm144.div1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by brekol on 05.12.16.
 */
public class BinaryCode {

    public String[] decode(String input) {

        final List<Integer> inputIntegers = Arrays.stream(input.split("")).map(Integer::parseInt).collect(Collectors.toList());

        final String s1 = initResult(inputIntegers, 0);
        final String s2 = initResult(inputIntegers, 1);

        return new String[]{s1, s2};
    }

    private String initResult(List<Integer> inputIntegers, int startInt) {
        List<Integer> result = new ArrayList<>();
        result.add(startInt);
        int currentSum;
        for (int i = 1; i < inputIntegers.size(); i++) {
            int need = inputIntegers.get(i - 1);
            if (i == 1) {
                currentSum = startInt;
            } else {
                currentSum = result.get(i - 1) + result.get(i - 2);
            }

            if (need - currentSum > 1) {
                return "NONE";
            }

            if (currentSum < need) {
                result.add(1);
            } else {
                result.add(0);
            }
        }
        return result.stream().map(String::valueOf).reduce("", (x, y) -> x + y);
    }
}
