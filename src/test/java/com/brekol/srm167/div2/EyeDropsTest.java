package com.brekol.srm167.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class EyeDropsTest {

    private EyeDrops uut = new EyeDrops();

    @Test
    public void test0() {
        // when
        final double result = uut.closest(8, 2);

        // then
        Assertions.assertThat(result).isEqualTo(720.0);
    }

    @Test
    public void test1() {
        // when
        final double result = uut.closest(9, 3);

        // then
        Assertions.assertThat(result).isEqualTo(450.0);
    }

    @Test
    public void test2() {
        // when
        final double result = uut.closest(23, 1);

        // then
        Assertions.assertThat(result).isEqualTo(1440.0);
    }

    @Test
    public void test3() {
        // when
        final double result = uut.closest(9, 8);

        // then
        Assertions.assertThat(result).isEqualTo(128.57142857142856);
    }

}
