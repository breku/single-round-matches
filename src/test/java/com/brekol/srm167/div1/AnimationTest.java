package com.brekol.srm167.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class AnimationTest {

    private Animation uut = new Animation();

    @Test
    public void test0() {
        // when
        final String[] result = uut.animate(2, "..R....");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"..X....", "....X..", "......X", "......."});
    }

    @Test
    public void test1() {
        // when
        final String[] result = uut.animate(3, "RR..LRL");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"XX..XXX", ".X.XX..", "X.....X", "......."});
    }

    @Test
    public void test2() {
        // when
        final String[] result = uut.animate(2, "LRLR.LRLR");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"XXXX.XXXX", "X..X.X..X", ".X.X.X.X.", ".X.....X.", "........."});
    }

    @Test
    public void test3() {
        // when
        final String[] result = uut.animate(10, "RLRLRLRLRL");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"XXXXXXXXXX", ".........."});
    }

    @Test
    public void test4() {
        // when
        final String[] result = uut.animate(1, "...");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"..."});
    }

    @Test
    public void test5() {
        // when
        final String[] result = uut.animate(1, "LRRL.LR.LRR.R.LRRL.");

        // then
        Assertions.assertThat(result).isEqualTo(new String[]{"XXXX.XX.XXX.X.XXXX.", "..XXX..X..XX.X..XX.", ".X.XX.X.X..XX.XX.XX", "X.X.XX...X.XXXXX..X", ".X..XXX...X..XX.X..", "X..X..XX.X.XX.XX.X.", "..X....XX..XX..XX.X", ".X.....XXXX..X..XX.", "X.....X..XX...X..XX", ".....X..X.XX...X..X", "....X..X...XX...X..", "...X..X.....XX...X.", "..X..X.......XX...X", ".X..X.........XX...", "X..X...........XX..", "..X.............XX.", ".X...............XX", "X.................X", "..................."});
    }

}
