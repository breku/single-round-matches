package com.brekol.srm151.div1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brekol on 09.12.16.
 */
public class ArchimedesTest {

    private Archimedes uut = new Archimedes();

    @Test
    public void test(){
        // given

        // when
        final double v = uut.approximatePi(8);
        System.out.println(v);

        // then
    }

}