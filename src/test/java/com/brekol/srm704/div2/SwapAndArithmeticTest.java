package com.brekol.srm704.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class SwapAndArithmeticTest {

    private SwapAndArithmetic uut = new SwapAndArithmetic();

    @Test
    public void test0() {
        // when
        final String result = uut.able(new int[]{3, 1, 2});

        // then
        Assertions.assertThat(result).isEqualTo("Possible");
    }

    @Test
    public void test1() {
        // when
        final String result = uut.able(new int[]{1, 2, 4});

        // then
        Assertions.assertThat(result).isEqualTo("Impossible");
    }

    @Test
    public void test2() {
        // when
        final String result = uut.able(new int[]{1, 1, 1, 1, 1, 1});

        // then
        Assertions.assertThat(result).isEqualTo("Possible");
    }

    @Test
    public void test3() {
        // when
        final String result = uut.able(new int[]{1000, 704, 1});

        // then
        Assertions.assertThat(result).isEqualTo("Impossible");
    }

    @Test
    public void test4() {
        // when
        final String result = uut.able(new int[]{7, 3, 11, 5, 1, 9});

        // then
        Assertions.assertThat(result).isEqualTo("Possible");
    }

}
