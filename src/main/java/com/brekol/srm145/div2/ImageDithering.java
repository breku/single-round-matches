package com.brekol.srm145.div2;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by brekol on 06.12.16.
 */
public class ImageDithering {

    public int count(String dithered, String[] screen) {
        int count = 0;
        final char[] ditheredChars = dithered.toCharArray();
        final Set<Character> dithSet = new HashSet<>();
        for (int i = 0; i < dithered.length(); i++) {
            dithSet.add(ditheredChars[i]);
        }

        for (int i = 0; i < screen.length; i++) {

            final char[] rowChars = screen[i].toCharArray();

            for (int j = 0; j < rowChars.length; j++) {
                if (dithSet.contains(rowChars[j])) {
                    count++;
                }
            }
        }
        return count;
    }


}
