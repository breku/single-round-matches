package com.brekol.srm153.div1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brekol on 09.12.16.
 */
public class InventoryTest {

    private Inventory uut = new Inventory();

    @Test
    public void test(){
        // given

        // when
        final int r = uut.monthlyOrder(new int[]{8773}, new int[]{16});
        System.out.println(r);

        // then
    }

}