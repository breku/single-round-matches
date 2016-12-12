package com.brekol.srm156.div2;

import org.junit.Test;

/**
 * Created by brekol on 12.12.16.
 */
public class DiskSpaceTest {

    DiskSpace uut = new DiskSpace();

    @Test
    public void test() {
        // given

        // when
        final int i = uut.minDrives(new int[]{300, 525, 110}, new int[]{350, 600, 115});

        // then
        System.out.println(i);
    }

}