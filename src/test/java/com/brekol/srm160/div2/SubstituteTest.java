package com.brekol.srm160.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class SubstituteTest {

    private Substitute uut = new Substitute();

    @Test
    public void test0() {
        // when
        final int result = uut.getValue("TRADINGFEW", "LGXWEV");

        // then
        Assertions.assertThat(result).isEqualTo(709);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.getValue("ABCDEFGHIJ", "XJ");

        // then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.getValue("CRYSTALBUM", "MMA");

        // then
        Assertions.assertThat(result).isEqualTo(6);
    }

}
