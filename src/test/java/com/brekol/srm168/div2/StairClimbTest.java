package com.brekol.srm168.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class StairClimbTest {

    private StairClimb uut = new StairClimb();

    @Test
    public void test0() {
        // when
        final int result = uut.stridesTaken(new int[]{15}, 2);

        // then
        Assertions.assertThat(result).isEqualTo(8);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.stridesTaken(new int[]{15, 15}, 2);

        // then
        Assertions.assertThat(result).isEqualTo(18);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.stridesTaken(new int[]{5, 11, 9, 13, 8, 30, 14}, 3);

        // then
        Assertions.assertThat(result).isEqualTo(44);
    }

}
