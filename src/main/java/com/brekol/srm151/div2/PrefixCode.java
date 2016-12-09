package com.brekol.srm151.div2;

/**
 * Created by brekol on 09.12.16.
 */
public class PrefixCode {

    public String isOne(String[] words) {

        for (int i = 0; i < words.length; i++) {

            for (int j = 0; j < words.length; j++) {
                if (i != j) {

                    if (words[i].length() > words[j].length() && words[i].substring(0, words[j].length()).equals(words[j])) {
                        return "No, " + j;
                    }

                }
            }
        }
        return "Yes";

    }
}
