package com.brekol.srm156.div1;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by brekol on 12.12.16.
 */
public class BombSweeperTest {

    private BombSweeper uut = new BombSweeper();

    @Test
    public void test(){
        // given

        // when
        final double v = uut.winPercentage(new String[]{".....",
                ".....",
                "..B..",
                ".....",
                "....."});

        // then
        System.out.println(v);
    }

}