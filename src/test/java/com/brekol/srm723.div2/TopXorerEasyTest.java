

package com.brekol.srm723.div2;
import org.fest.assertions.Assertions;
import org.junit.Test;

public class TopXorerEasyTest {

	private TopXorerEasy uut = new TopXorerEasy();

	@Test
	public void test0() {
		// when
		final int result = uut.maximalRating( 2, 1, 0);

		// then
		Assertions.assertThat(result).isEqualTo(3);
	}

	@Test
	public void test1() {
		// when
		final int result = uut.maximalRating( 1, 2, 4);

		// then
		Assertions.assertThat(result).isEqualTo(7);
	}

	@Test
	public void test2() {
		// when
		final int result = uut.maximalRating( 3, 4, 5);

		// then
		Assertions.assertThat(result).isEqualTo(7);
	}

	@Test
	public void test3() {
		// when
		final int result = uut.maximalRating( 1, 100, 10000);

		// then
		Assertions.assertThat(result).isEqualTo(10101);
	}

	@Test
	public void test4() {
		// when
		final int result = uut.maximalRating( 1000000000, 1000000000, 1000000000);

		// then
		Assertions.assertThat(result).isEqualTo(1073741823);
	}

	@Test
	public void test5() {
		// when
		final int result = uut.maximalRating( 0, 0, 0);

		// then
		Assertions.assertThat(result).isEqualTo(0);
	}

}
