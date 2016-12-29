package com.brekol.srm166.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class WorkshopTest {

    private Workshop uut = new Workshop();

    @Test
    public void test0() {
        // when
        final int result = uut.pictureFrames(new int[]{1, 2, 3, 4, 5});

        // then
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.pictureFrames(new int[]{8, 5, 3});

        // then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.pictureFrames(new int[]{4, 23, 76, 22, 87, 3, 1, 99});

        // then
        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    public void test3() {
        // when
        final int result = uut.pictureFrames(new int[]{10000, 9999, 9998, 9997, 9996, 1, 2, 3, 4, 5});

        // then
        Assertions.assertThat(result).isEqualTo(43);
    }

    @Test
    public void test4() {
        // when
        final int result = uut.pictureFrames(new int[]{100});

        // then
        Assertions.assertThat(result).isEqualTo(0);
    }

}
