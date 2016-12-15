package com.brekol.srm160.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class IditarodTest {

    private Iditarod uut = new Iditarod();

    @Test
    public void test0() {
        // when
        final int result = uut.avgMinutes(new String[]{"12:00 PM, DAY 1", "12:01 PM, DAY 1"});

        // then
        Assertions.assertThat(result).isEqualTo(241);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.avgMinutes(new String[]{"12:00 AM, DAY 2"});

        // then
        Assertions.assertThat(result).isEqualTo(960);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.avgMinutes(new String[]{"02:00 PM, DAY 19", "02:00 PM, DAY 20", "01:58 PM, DAY 20"});

        // then
        Assertions.assertThat(result).isEqualTo(27239);
    }

}
