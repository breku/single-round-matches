package com.brekol.srm164.div1;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class UserId {

    public String id(String[] inUse, String first, String middle, String last) {


        final Pattern valid = Pattern.compile("[a-zA-Z\\s']*");
        if (!valid.matcher(first).matches() || !valid.matcher(middle).matches() || !valid.matcher(last).matches() || first.length() < 2) {
            return "BAD DATA";
        }


        final String firstNew = getWithoutSpecialChars(first);
        final String middleNew = getWithoutSpecialChars(middle);
        final String lastNew = getWithoutSpecialChars(last);

        final List<String> inUseList = Arrays.asList(inUse);
        String x = getFirstRule(firstNew, lastNew);

        if (!inUseList.contains(x)) {
            return x;
        }
        if (middleNew.length() > 0) {
            x = getSecondRule(firstNew, middleNew, lastNew);
            if (!inUseList.contains(x)) {
                return x;
            }
        }
        return getThirdRule(inUseList, firstNew, lastNew);

    }

    private String getThirdRule(List<String> inUse, String firstNew, String lastNew) {
        String concat = firstNew.substring(0, 1).concat(lastNew);
        if (concat.length() > 6) {
            concat = concat.substring(0, 6);
        }
        String newId = String.format("%s%s%s", concat, 0, 1);

        int counter = 1;
        while (inUse.contains(newId)) {
            newId = String.format("%s%s%s", concat, counter / 10, counter);
            counter++;
        }
        return newId;
    }


    private String getSecondRule(String firstNew, String middleNew, String lastNew) {
        final String concat = firstNew.substring(0, 1).concat(middleNew.substring(0, 1)).concat(lastNew);
        if (concat.length() > 8) {
            return concat.substring(0, 8);
        }
        return concat;
    }

    private String getFirstRule(String firstNew, String lastNew) {
        final String concat = firstNew.substring(0, 1).concat(lastNew);
        if (concat.length() > 8) {
            return concat.substring(0, 8);
        }
        return concat;
    }

    private String getWithoutSpecialChars(String s) {
        return Arrays.stream(s.split("'|\\s|")).map(String::toLowerCase).reduce("", String::concat);
    }
}
