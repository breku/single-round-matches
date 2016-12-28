package com.brekol.srm166.div1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryCardinality {

    public int[] arrange(int[] numbers) {

        List<Pair> pairs = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            final String binaryNumber = Integer.toString(numbers[i], 2);
            pairs.add(new Pair(binaryNumber, numbers[i]));
        }
        Collections.sort(pairs);
        return pairs.stream().mapToInt(p -> p.dec).toArray();
    }

    private class Pair implements Comparable<Pair> {
        String binary;
        int dec;

        public Pair(String binary, int dec) {
            this.binary = binary;
            this.dec = dec;
        }

        @Override
        public int compareTo(Pair o) {
            if (o.countOnes() > countOnes()) {
                return -1;
            } else if (o.countOnes() < countOnes()) {
                return 1;
            } else
                return Integer.valueOf(dec).compareTo(o.dec);
        }

        int countOnes() {
            return Arrays.stream(binary.split("")).filter(x -> x.equals("1")).toArray().length;
        }
    }
}
