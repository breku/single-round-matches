package com.brekol.srm722;


import org.fest.assertions.Assertions;
import org.junit.Test;

public class TCPhoneHomeEasyTest {

	private TCPhoneHomeEasy uut = new TCPhoneHomeEasy();

	@Test
	public void test0() {
		// when
		final int result = uut.validNumbers( 7, new String[] { "0", "1", "911" });

		// then
		Assertions.assertThat(result).isEqualTo(7990000);
	}

	@Test
	public void test1() {
		// when
		final int result = uut.validNumbers( 5, new String[] { "0", "1", "911" });

		// then
		Assertions.assertThat(result).isEqualTo(79900);
	}

	@Test
	public void test2() {
		// when
		final int result = uut.validNumbers( 6, new String[] { "1", "2", "3" });

		// then
		Assertions.assertThat(result).isEqualTo(700000);
	}

	@Test
	public void test3() {
		// when
		final int result = uut.validNumbers( 6, new String[] { "1", "23", "345" });

		// then
		Assertions.assertThat(result).isEqualTo(889000);
	}

	@Test
	public void test4() {
		// when
		final int result = uut.validNumbers( 3, new String[] {"411"});

		// then
		Assertions.assertThat(result).isEqualTo(999);
	}

}
