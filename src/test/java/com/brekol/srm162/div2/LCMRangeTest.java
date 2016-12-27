package com.brekol.srm162.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class LCMRangeTest {

    private LCMRange uut = new LCMRange();

    @Test
    public void test0() {
        // when
        final int result = uut.lcm(1, 5);

        // then
        Assertions.assertThat(result).isEqualTo(60);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.lcm(4, 5);

        // then
        Assertions.assertThat(result).isEqualTo(20);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.lcm(1, 12);

        // then
        Assertions.assertThat(result).isEqualTo(27720);
    }

}
