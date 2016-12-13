package com.brekol.srm157.div1;

import org.junit.Test;

/**
 * Created by brekol on 12.12.16.
 */
public class SalaryTest {

    private Salary uut = new Salary();

    @Test
    public void test() {
        // given

        // when


        final int r = uut.howMuch(new String[]{"01:05:47","16:48:12"}, new String[]{"09:27:30","21:17:59"}, 2000);

        // then
        System.out.println(r);
    }

}