package com.brekol.srm155.div2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brekol on 11.12.16.
 */
public class QuipuTest {

    Quipu uut= new Quipu();

    @Test
    public void test(){
        // given

        // when
        final int i = uut.readKnots("-XX--XXXX---XXX-");

        // then
        System.out.println(i);
    }

}