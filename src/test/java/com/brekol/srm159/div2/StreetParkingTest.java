package com.brekol.srm159.div2;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class StreetParkingTest {

    private StreetParking uut = new StreetParking();

    @Test
    public void test0() {
        // when
        final int result = uut.freeParks("---B--S-D--S--");

        // then
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void test1() {
        // when
        final int result = uut.freeParks("DDBDDBDDBDD");

        // then
        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    public void test2() {
        // when
        final int result = uut.freeParks("--S--S--S--S--");

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test3() {
        // when
        final int result = uut.freeParks("SSD-B---BD-DDSB-----S-S--------S-B----BSB-S--B-S-D");

        // then
        Assertions.assertThat(result).isEqualTo(14);
    }

}
