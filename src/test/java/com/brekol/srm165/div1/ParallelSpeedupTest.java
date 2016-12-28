package com.brekol.srm165.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class ParallelSpeedupTest {

    private ParallelSpeedup uut = new ParallelSpeedup();

    @Test
    public void test0() {
        // when
        final int result = uut.numProcessors(12, 1);

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.numProcessors(50, 3);

        // then
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.numProcessors(9, 10);

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void test3() {
        // when
        final int result = uut.numProcessors(3333, 2);

        // then
        Assertions.assertThat(result).isEqualTo(12);
    }

    @Test
    public void test4() {
        // when
        final int result = uut.numProcessors(1000000, 4);

        // then
        Assertions.assertThat(result).isEqualTo(63);
    }

}
