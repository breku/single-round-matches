package com.brekol.srm166.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class BinaryCardinalityTest {

    private BinaryCardinality uut = new BinaryCardinality();

    @Test
    public void test0() {
        // when
        final int[] result = uut.arrange(new int[]{4});

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{4});
    }

    @Test
    public void test1() {
        // when
        final int[] result = uut.arrange(new int[]{31, 15, 7, 3, 2});

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{2, 3, 7, 15, 31});
    }

    @Test
    public void test2() {
        // when
        final int[] result = uut.arrange(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1});

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{1, 2, 4, 8, 3, 5, 6, 9, 10, 7});
    }

    @Test
    public void test3() {
        // when
        final int[] result = uut.arrange(new int[]{811385, 340578, 980086, 545001, 774872, 855585, 13848, 863414, 419523, 190151, 784903, 127461});

        // then
        Assertions.assertThat(result).isEqualTo(new int[]{13848, 340578, 545001, 855585, 419523, 811385, 127461, 190151, 774872, 863414, 784903, 980086});
    }

}
