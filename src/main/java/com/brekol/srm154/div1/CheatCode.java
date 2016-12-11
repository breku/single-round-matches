package com.brekol.srm154.div1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by brekol on 11.12.16.
 */
public class CheatCode {

    public int[] matches(String keyPresses, String[] codes) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < codes.length; i++) {
            if (match(keyPresses, codes[i])) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();

    }

    private boolean match(String keyPresses, String code) {
        String regex = makeRegexFormCode(code);
        return keyPresses.matches(regex);
    }

    private String makeRegexFormCode(String code) {
        String result = ".*";
        final char[] chars = code.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            result += chars[i];
            if (i + 1 == chars.length || chars[i + 1] != chars[i]) {
                result += "+";
            }
        }
        result += ".*";
        return result;
    }

}
