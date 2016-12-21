package com.brekol.srm161.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class CardCountTest {

    private CardCount uut = new CardCount();

    @Test
    public void test0() {
        // when
        final String[] result = uut.dealHands(6, "012345012345012345");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"000", "111", "222", "333", "444", "555"});
    }

    @Test
    public void test1() {
        // when
        final String[] result = uut.dealHands(4, "111122223333");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"123", "123", "123", "123"});
    }

    @Test
    public void test2() {
        // when
        final String[] result = uut.dealHands(1, "012345012345012345");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"012345012345012345"});
    }

    @Test
    public void test3() {
        // when
        final String[] result = uut.dealHands(6, "01234");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"", "", "", "", "", ""});
    }

    @Test
    public void test4() {
        // when
        final String[] result = uut.dealHands(2, "");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"", ""});
    }

}
