package com.brekol.srm159.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class FryingHamburgersTest {

    private FryingHamburgers uut = new FryingHamburgers();

    @Test
    public void test0() {
        // when
        final int result = uut.howLong(2, 3);

        // then
        Assertions.assertThat(result).isEqualTo(15);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.howLong(3, 4);

        // then
        Assertions.assertThat(result).isEqualTo(15);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.howLong(3, 2);

        // then
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    public void test3() {
        // when
        final int result = uut.howLong(100, 0);

        // then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void test4() {
        // when
        final int result = uut.howLong(303, 919);

        // then
        Assertions.assertThat(result).isEqualTo(35);
    }

}
