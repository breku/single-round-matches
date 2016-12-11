package com.brekol.srm155.div1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by brekol on 11.12.16.
 */
public class PaternityTest {


    public int[] possibleFathers(String child, String mother, String[] men) {

        final char[] childChars = child.toCharArray();
        final char[] motherChars = mother.toCharArray();

        List<Integer> motherIndexes = new ArrayList<>();
        for (int i = 0; i < childChars.length; i++) {
            if (childChars[i] == motherChars[i]) {
                motherIndexes.add(i);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < men.length; i++) {
            if (match(childChars, men[i].toCharArray(), motherIndexes)) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }

    private boolean match(char[] childChars, char[] fatherChars, List<Integer> motherIndexes) {
        List<Integer> fatherIndexes = new ArrayList<>();
        List<Integer> motherIndexesUsed = new ArrayList<>();
        for (int i = 0; i < childChars.length; i++) {

            if (childChars[i] == fatherChars[i]) {
                fatherIndexes.add(i);
            } else if (motherIndexes.contains(i)) {
                motherIndexesUsed.add(i);
            } else {
                return false;
            }
        }

        if (fatherIndexes.size() >= childChars.length / 2 && motherIndexes.size() >= childChars.length / 2) {
            motherIndexesUsed.addAll(fatherIndexes);
            final List<Integer> collect = motherIndexesUsed.stream().collect(Collectors.toSet()).stream().sorted().collect(Collectors.toList());
            if (collect.size() == childChars.length) {
                for (int i = 0; i < childChars.length; i++) {
                    if (i != collect.get(i)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;

    }
}
