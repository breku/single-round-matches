package com.brekol.srm161.div1;

import java.util.ArrayList;
import java.util.List;

public class IsHomomorphism {

    public String[] numBad(String[] source, String[] target, int[] mapping) {


        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < source.length; i++) {
            for (int j = 0; j < mapping.length; j++) {
                if (mapping[source[i].charAt(j) - '0'] != target[mapping[i]].charAt(mapping[j]) - '0') {
                    pairs.add(String.format("(%s,%s)", i, j));
                }
            }
        }
        return pairs.stream().toArray(String[]::new);
    }
}
