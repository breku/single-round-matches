package com.brekol.srm155.div1;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by brekol on 11.12.16.
 */
public class PaternityTestTest {

    private PaternityTest uut = new PaternityTest();

    @Test
    public void test() {
        // given

        // when
        final int[] ints = uut.possibleFathers("ABABAB", "ABABAB", new String[]{"ABABAB", "ABABCC", "ABCCDD", "CCDDEE"});

        // then
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void test2() {
        // given

        // when
        final int[] ints = uut.possibleFathers("ABCD", "ABCX", new String[]{ "ABCY", "ASTD", "QBCD" } );

        // then
        System.out.println(Arrays.toString(ints));
    }


}