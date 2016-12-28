package com.brekol.srm164.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class JustifierTest {

    private Justifier uut = new Justifier();

    @Test
    public void test0() {
        // when
        final String[] result = uut.justify(new String[]{"BOB", "TOMMY", "JIM"});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"  BOB", "TOMMY", "  JIM"});
    }

    @Test
    public void test1() {
        // when
        final String[] result = uut.justify(new String[]{"JOHN", "JAKE", "ALAN", "BLUE"});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"JOHN", "JAKE", "ALAN", "BLUE"});
    }

    @Test
    public void test2() {
        // when
        final String[] result = uut.justify(new String[]{"LONGEST", "A", "LONGER", "SHORT"});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"LONGEST", "      A", " LONGER", "  SHORT"});
    }

}
