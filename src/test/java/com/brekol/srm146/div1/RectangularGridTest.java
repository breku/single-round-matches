package com.brekol.srm146.div1;

import org.fest.assertions.Assertions;
import org.junit.Test;

/**
 * Created by brekol on 07.12.16.
 */
public class RectangularGridTest {
    private RectangularGrid uut = new RectangularGrid();

    @Test
    public void test() {
        // given

        // when
        final long result = uut.countRectangles(3, 3);

        // then
        Assertions.assertThat(result).isEqualTo(22);
    }

}