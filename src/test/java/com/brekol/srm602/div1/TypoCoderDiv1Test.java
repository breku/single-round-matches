package com.brekol.srm602.div1;

import org.junit.Test;

/**
 * Created by brekol on 13.12.16.
 */
public class TypoCoderDiv1Test {

    private TypoCoderDiv1 uut = new TypoCoderDiv1();

    @Test
    public void test() {
        // given

        // when
        final int result = uut.getmax(new int[]{100, 200, 100, 1, 1}, 2000);

        // then
        System.out.println(result);
    }

    @Test
    public void test2() {
        // given

        // when
        final int result = uut.getmax(new int[]{1000000000, 1000000000, 10000, 100000, 2202, 1}, 1000);

        // then
        System.out.println(result);
    }

}