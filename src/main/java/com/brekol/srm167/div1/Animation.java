package com.brekol.srm167.div1;

import java.util.ArrayList;
import java.util.List;

public class Animation {
    public String[] animate(int speed, String init) {
        List<String> result = new ArrayList<>();
        result.add(init.replaceAll("L|R", "X"));

        String current = init;
        while (current.indexOf('R') > -1 || current.indexOf('L') > -1) {

            final char[] currentChars = current.toCharArray();
            String newAnimation = getNew(current.length());
            final char[] newAnimationChars = newAnimation.toCharArray();
            for (int i = 0; i < currentChars.length; i++) {
                if (currentChars[i] == 'R') {
                    replaceWithLetter(speed, newAnimationChars, i, 'R');
                }
                if (currentChars[i] == 'L') {
                    replaceWithLetter(-speed, newAnimationChars, i, 'L');
                }
                if (currentChars[i] == 'A') {
                    replaceWithLetter(speed, newAnimationChars, i, 'R');
                    replaceWithLetter(-speed, newAnimationChars, i, 'L');
                }

            }
            current = new String(newAnimationChars);
            result.add(current.replaceAll("L|R|A", "X"));
        }

        return result.stream().toArray(String[]::new);

    }

    private void replaceWithLetter(int speed, char[] newAnimationChars, int i, char letter) {
        try {
            if (newAnimationChars[i + speed] != '.') {
                newAnimationChars[i + speed] = 'A';
            } else {
                newAnimationChars[i + speed] = letter;
            }

        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

    private String getNew(int length) {
        String res = "";
        for (int i = 0; i < length; i++) {
            res += ".";
        }
        return res;
    }
}
