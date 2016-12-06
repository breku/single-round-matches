package com.brekol.srm145.div2;

import org.fest.assertions.Assertions;
import org.junit.Test;

/**
 * Created by brekol on 06.12.16.
 */
public class ImageDitheringTest {
    private ImageDithering uut = new ImageDithering();

    @Test
    public void test() {
        // given

        // when
        final int result = uut.count("ACEGIKMOQSUWY", new String[]{"ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX",
                "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWX"});
        // then
        Assertions.assertThat(result).isEqualTo(150);
    }

}