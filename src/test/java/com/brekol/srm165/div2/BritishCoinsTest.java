package com.brekol.srm165.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class BritishCoinsTest {

    private BritishCoins uut = new BritishCoins();

    @Test
    public void test0() {
        // when
        final int[] result = uut.coins(533);

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{2, 4, 5});
    }

    @Test
    public void test1() {
        // when
        final int[] result = uut.coins(0);

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{0, 0, 0});
    }

    @Test
    public void test2() {
        // when
        final int[] result = uut.coins(6);

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{0, 0, 6});
    }

    @Test
    public void test3() {
        // when
        final int[] result = uut.coins(4091);

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{17, 0, 11});
    }

    @Test
    public void test4() {
        // when
        final int[] result = uut.coins(10000);

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{41, 13, 4});
    }

}
