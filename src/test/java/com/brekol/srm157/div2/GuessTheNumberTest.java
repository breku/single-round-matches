package com.brekol.srm157.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class GuessTheNumberTest {

    private GuessTheNumber uut = new GuessTheNumber();

    @Test
    public void test0() {
        // when
        final int result = uut.noGuesses(9, 6);

        // then
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.noGuesses(1000, 750);

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.noGuesses(643, 327);

        // then
        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    public void test3() {
        // when
        final int result = uut.noGuesses(157, 157);

        // then
        Assertions.assertThat(result).isEqualTo(8);
    }

    @Test
    public void test4() {
        // when
        final int result = uut.noGuesses(128, 64);

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

}
