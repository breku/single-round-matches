package com.brekol.srm149.div2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brekol on 08.12.16.
 */
public class FormatAmtTest {

    private FormatAmt uut = new FormatAmt();

    @Test
    public void test(){
        // given

        // when
        final String amount = uut.amount(49734321, 9);
        System.out.println(amount);

        // then
    }

}