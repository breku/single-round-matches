package com.brekol.srm704.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class ConnectedComponentConstructionTest {

    private ConnectedComponentConstruction uut = new ConnectedComponentConstruction();

    @Test
    public void test0() {
        // when
        final String[] result = uut.construct(new int[]{2, 1, 1, 2, 1});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"NNNYN", "NNNNN", "NNNNN", "YNNNN", "NNNNN"});
    }

    @Test
    public void test1() {
        // when
        final String[] result = uut.construct(new int[]{1, 1, 1, 1});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"NNNN", "NNNN", "NNNN", "NNNN"});
    }

    @Test
    public void test2() {
        // when
        final String[] result = uut.construct(new int[]{3, 3, 3});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"NYY", "YNY", "YYN"});
    }

    @Test
    public void test3() {
        // when
        final String[] result = uut.construct(new int[]{4, 4, 4, 4, 4});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{});
    }

    @Test
    public void test4() {
        // when
        final String[] result = uut.construct(new int[]{1});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"N"});
    }

}
