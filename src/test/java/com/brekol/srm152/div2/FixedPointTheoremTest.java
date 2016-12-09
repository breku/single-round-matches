package com.brekol.srm152.div2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brekol on 09.12.16.
 */
public class FixedPointTheoremTest {

    private FixedPointTheorem uut = new FixedPointTheorem();

    @Test
    public void test(){
        // given

        // when
        final double result = uut.cycleRange(3.05);
        System.out.println(result);

        // then
    }

}