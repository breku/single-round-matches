package com.brekol.srm154.div2;

import org.junit.Test;

/**
 * Created by brekol on 11.12.16.
 */
public class ProfitCalculatorTest {

    private ProfitCalculator uut = new ProfitCalculator();

    @Test
    public void test() {
        // given

        // when
        final int percent = uut.percent(new String[]{"012.99 008.73",
                "099.99 050.00",
                "123.45 101.07"});

        // then
        System.out.println(percent);
    }

}