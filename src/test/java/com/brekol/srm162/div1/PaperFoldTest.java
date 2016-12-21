package com.brekol.srm162.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class PaperFoldTest {

    private PaperFold uut = new PaperFold();

    @Test
    public void test0() {
        // when
        final int result = uut.numFolds(new int[]{8, 11}, new int[]{6, 10});

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.numFolds(new int[]{11, 17}, new int[]{6, 4});

        // then
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.numFolds(new int[]{11, 17}, new int[]{5, 4});

        // then
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void test3() {
        // when
        final int result = uut.numFolds(new int[]{1000, 1000}, new int[]{62, 63});

        // then
        Assertions.assertThat(result).isEqualTo(-1);
    }

    @Test
    public void test4() {
        // when
        final int result = uut.numFolds(new int[]{100, 30}, new int[]{60, 110});

        // then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void test5() {
        // when
        final int result = uut.numFolds(new int[]{1895, 6416}, new int[]{401, 1000});

        // then
        Assertions.assertThat(result).isEqualTo(5);
    }

}
