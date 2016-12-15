package com.brekol.srm158.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class TireRotationTest {

    private TireRotation uut = new TireRotation();

    @Test
    public void test0() {
        // when
        final int result = uut.getCycle("ABCD", "ABCD");

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.getCycle("ABCD", "DCAB");

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.getCycle("ABCD", "CDBA");

        // then
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void test3() {
        // when
        final int result = uut.getCycle("ABCD", "ABDC");

        // then
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test4() {
        // when
        final int result = uut.getCycle("ZAXN", "XNAZ");

        // then
        Assertions.assertThat(result).isEqualTo(4);
    }

}
