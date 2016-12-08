package com.brekol.srm148.div1;

import org.fest.assertions.Assertions;
import org.junit.Test;

/**
 * Created by brekol on 07.12.16.
 */
public class CircleGameTest {

    private CircleGame uut = new CircleGame();

    @Test
    public void test() {
        // given

        // when
        final int result = uut.cardsLeft("KKKKKAQT23");

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

}