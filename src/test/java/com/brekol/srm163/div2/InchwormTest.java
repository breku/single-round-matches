package com.brekol.srm163.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class InchwormTest {

    private Inchworm uut = new Inchworm();

    @Test
    public void test0() {
        // when
        final int result = uut.lunchtime(11, 2, 4);

        // then
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.lunchtime(12, 6, 4);

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.lunchtime(20, 3, 7);

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void test3() {
        // when
        final int result = uut.lunchtime(21, 7, 3);

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test4() {
        // when
        final int result = uut.lunchtime(15, 16, 5);

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void test5() {
        // when
        final int result = uut.lunchtime(1000, 3, 7);

        // then
        Assertions.assertThat(result).isEqualTo(48);
    }

    @Test
    public void test6() {
        // when
        final int result = uut.lunchtime(1000, 7, 3);

        // then
        Assertions.assertThat(result).isEqualTo(48);
    }

}
