package com.brekol.srm164.div2;

public class Justifier {

    public String[] justify(String[] textIn) {
        int max = getMaxLength(textIn);
        String[] result = new String[textIn.length];
        for (int i = 0; i < textIn.length; i++) {
            result[i] = createJustified(textIn[i], max);
        }
        return result;
    }

    private String createJustified(String s, int max) {
        int numberOfSpaces = max - s.length();
        String res = "";
        for (int i = 0; i < numberOfSpaces; i++) {
            res += " ";
        }
        return res + s;
    }

    private int getMaxLength(String[] textIn) {
        int result = textIn[0].length();
        for (int i = 1; i < textIn.length; i++) {
            if (textIn[i].length() > result) {
                result = textIn[i].length();
            }
        }
        return result;
    }
}
