package com.brekol.srm158.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class BaseMysteryTest {

    private BaseMystery uut = new BaseMystery();

    @Test
    public void test0() {
        // when
        final int[] result = uut.getBase("1+1=2");

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
    }

    @Test
    public void test1() {
        // when
        final int[] result = uut.getBase("1+1=10");

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{2});
    }

    @Test
    public void test2() {
        // when
        final int[] result = uut.getBase("1+1=3");

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{});
    }

    @Test
    public void test3() {
        // when
        final int[] result = uut.getBase("ABCD+211=B000");

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{14});
    }

    @Test
    public void test4() {
        // when
        final int[] result = uut.getBase("ABCD+322=B000");

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{15});
    }

    @Test
    public void test5() {
        // when
        final int[] result = uut.getBase("1+0=1");

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
    }

    @Test
    public void test6() {
        // when
        final int[] result = uut.getBase("GHIJ+1111=HJ00");

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{20});
    }

    @Test
    public void test7() {
        // when
        final int[] result = uut.getBase("1234+8765=9999");

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
    }

}
