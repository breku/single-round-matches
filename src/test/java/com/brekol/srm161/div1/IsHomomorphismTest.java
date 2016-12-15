package com.brekol.srm161.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class IsHomomorphismTest {

    private IsHomomorphism uut = new IsHomomorphism();

    @Test
    public void test0() {
        // when
        final String[] result = uut.numBad(new String[]{"0000", "0123", "0202", "0321"}, new String[]{"0000", "0123", "0202", "0321"}, new int[]{0, 1, 2, 3});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{});
    }

    @Test
    public void test1() {
        // when
        final String[] result = uut.numBad(new String[]{"0123456", "1234560", "2345601", "3456012", "4560123", "5601234", "6012345"}, new String[]{"0123456", "1234560", "2345601", "3456012", "4560123", "5601234", "6012345"}, new int[]{1, 3, 2, 1, 2, 1, 1});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"(0,0)", "(0,1)", "(0,2)", "(0,3)", "(0,4)", "(0,5)", "(0,6)", "(1,0)", "(1,1)", "(1,2)", "(1,3)", "(1,4)", "(1,5)", "(1,6)", "(2,0)", "(2,1)", "(2,2)", "(2,3)", "(2,4)", "(2,5)", "(3,0)", "(3,1)", "(3,2)", "(3,3)", "(3,4)", "(3,5)", "(4,0)", "(4,1)", "(4,2)", "(4,3)", "(4,4)", "(4,5)", "(4,6)", "(5,0)", "(5,1)", "(5,2)", "(5,3)", "(5,4)", "(5,5)", "(6,0)", "(6,1)", "(6,4)", "(6,6)"});
    }

    @Test
    public void test2() {
        // when
        final String[] result = uut.numBad(new String[]{"012", "120", "210"}, new String[]{"012", "120", "110"}, new int[]{0, 1, 2});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"(2,0)"});
    }

    @Test
    public void test3() {
        // when
        final String[] result = uut.numBad(new String[]{"012", "120", "210"}, new String[]{"012", "120", "210"}, new int[]{1, 2, 0});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"(0,0)", "(0,1)", "(0,2)", "(1,0)", "(1,2)", "(2,0)", "(2,2)"});
    }

    @Test
    public void test4() {
        // when
        final String[] result = uut.numBad(new String[]{"01", "10"}, new String[]{"10", "01"}, new int[]{1, 0});

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{});
    }

}
