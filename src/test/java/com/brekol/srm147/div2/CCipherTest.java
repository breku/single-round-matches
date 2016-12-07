package com.brekol.srm147.div2;

import org.fest.assertions.Assertions;
import org.junit.Test;

/**
 * Created by brekol on 07.12.16.
 */
public class CCipherTest {
    private CCipher uut = new CCipher();

    @Test
    public void test() {
        // given

        // when
        final String result = uut.decode("VQREQFGT", 2);

        // then
        Assertions.assertThat(result).isEqualTo("TOPCODER");
    }

    @Test
    public void test2() {
        // given

        // when
        final String result = uut.decode("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 10);

        // then
        Assertions.assertThat(result).isEqualTo("QRSTUVWXYZABCDEFGHIJKLMNOP");
    }

}