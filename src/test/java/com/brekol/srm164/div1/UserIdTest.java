package com.brekol.srm164.div1;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class UserIdTest {

    private UserId uut = new UserId();

    @Test
    public void test0() {
        // when
        final String result = uut.id(new String[]{"bjones", "bjones03", "bmjones", "old34id"}, "Bob", "", "Jones");

        // then
        Assertions.assertThat(result).isEqualTo("bjones01");
    }

    @Test
    public void test1() {
        // when
        final String result = uut.id(new String[]{"bjones", "bjones03", "bmjones", "old34id"}, "Bob Mack", "Hertobise", "Jone's");

        // then
        Assertions.assertThat(result).isEqualTo("bhjones");
    }

    @Test
    public void test2() {
        // when
        final String result = uut.id(new String[]{"bjonesto", "bjones01", "bjonesto", "old34id"}, "BoB-Mack", "Mo", "Jonestone");

        // then
        Assertions.assertThat(result).isEqualTo("BAD DATA");
    }

    @Test
    public void test3() {
        // when
        final String result = uut.id(new String[]{"momorris", "mmmm", "momorr01"}, "'m m", "", "O'Morrisy");

        // then
        Assertions.assertThat(result).isEqualTo("momorr02");
    }

    @Test
    public void test4() {
        // when
        final String result = uut.id(new String[]{}, "'m m", "J.J", "O'Morrisy");

        // then
        Assertions.assertThat(result).isEqualTo("BAD DATA");
    }

}
