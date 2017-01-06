package com.brekol.srm168.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class NumberGuesserTest {

    private NumberGuesser uut = new NumberGuesser();

    @Test
    public void test0() {
        // when
        final int result = uut.guess("087");

        // then
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.guess("099");

        // then
        Assertions.assertThat(result).isEqualTo(9);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.guess("191");

        // then
        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    public void test3() {
        // when
        final int result = uut.guess("689");

        // then
        Assertions.assertThat(result).isEqualTo(4);
    }

}
