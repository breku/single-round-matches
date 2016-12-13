package com.brekol.srm602.div1;

import org.fest.assertions.Assertions;
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
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        // given

        // when
        final int result = uut.getmax(new int[]{1000000000, 1000000000, 10000, 100000, 2202, 1}, 1000);

        // then
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void test3(){
        // given

        // when
        final int result = uut.getmax(new int[]{61,666,512,229,618,419,757,217,458,883,23,932,547,679,565,767,513,798,870,31,379,294,929,892,173,127,796,353,913,115,802,803,948,592,959,127,501,319,140,694,851,189,924,590,790,3,669,541,342,272}, 1223);

        // then
        Assertions.assertThat(result).isEqualTo(29);
    }

    @Test
    public void test4(){
        // given

        // when
        final int result = uut.getmax(new int[]{90000,80000,70000,60000,50000,40000,30000,20000,10000}, 0);

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

}