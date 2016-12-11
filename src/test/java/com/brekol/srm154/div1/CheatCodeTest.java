package com.brekol.srm154.div1;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by brekol on 11.12.16.
 */
public class CheatCodeTest {

    private CheatCode uut = new CheatCode();

    @Test
    public void test() {
        // given

        // when
        final int[] result = uut.matches("IDDQDDTSFHHALL", new String[]{"FHHALL", "FHSHH", "IDBEHOLDA", "IDBEHOLDI", "IDBEHOLDL",
                "IDBEHOLDR", "IDBEHOLDS", "IDBEHOLDV", "IDCHOPPERS", "IDCLEV",
                "IDCLIP", "IDDQD", "IDDT", "IDFA", "IDKFA", "IDMYPOS", "IDMUS"});

        // then
        System.out.println(Arrays.toString(result));
    }

}