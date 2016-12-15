package com.brekol.srm158.div2;

/**
 * Created by brekol on 15.12.16.
 */
public class TireRotation {

    public int getCycle(String initial, String current) {

        final char[] chars = initial.toCharArray();


        if (initial.equals(current)) {
            return 1;
        } else if (new String(new char[]{chars[3], chars[2], chars[0], chars[1]}).equals(current)) {
            return 2;
        }
        if (new String(new char[]{chars[1], chars[0], chars[3], chars[2]}).equals(current)) {
            return 3;
        }
        if (new String(new char[]{chars[2], chars[3], chars[1], chars[0]}).equals(current)) {
            return 4;
        } else {
            return -1;
        }
    }
}
