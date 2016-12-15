package com.brekol.srm160.div2;

public class Substitute {

    public int getValue(String key, String code) {

        String result = "";

        final char[] codeChars = code.toCharArray();
        for (int i = 0; i < codeChars.length; i++) {
            final int indexOf = key.indexOf(codeChars[i]);
            if (indexOf != -1) {
                if (indexOf + 1 == key.length()) {
                    result += "0";
                } else {
                    result += (indexOf + 1);
                }
            }
        }
        return Integer.valueOf(result);

    }
}
