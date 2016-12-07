package com.brekol.srm147.div2;

/**
 * Created by brekol on 07.12.16.
 */
public class CCipher {


    public String decode(String cipherText, int shift) {
        final char[] chars = cipherText.toCharArray();
        char[] result = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {

            final int minus = (int) chars[i] - shift;
            if (minus < (int)'A') {

                result[i] = (char) ((int) 'Z' - ('A' - minus-1));
            } else {
                result[i] = (char) ((int) chars[i] - shift);
            }
        }
        return new String(result);
    }
}
