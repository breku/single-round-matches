package com.brekol.srm163.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class RochamboTest {

    private Rochambo uut = new Rochambo();

    @Test
    public void test0() {
        // when
        final int result = uut.wins("PS");

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.wins("PSRRPS");

        // then
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.wins("PSRPSRPRSR");

        // then
        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    public void test3() {
        // when
        final int result = uut.wins("SRPSRPSPRSPRPSRPSRP");

        // then
        Assertions.assertThat(result).isEqualTo(16);
    }

    @Test
    public void test4() {
        // when
        final int result = uut.wins("RPPPRRPSSSRRRSRSPPSSPRRPSRRRRSPPPPSSPSSSSSRSSSRPRR");

        // then
        Assertions.assertThat(result).isEqualTo(18);
    }

}
