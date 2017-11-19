

package com.brekol.srm723.div2;
import org.fest.assertions.Assertions;
import org.junit.Test;

public class BuffaloBuffaloTest {

	private BuffaloBuffalo uut = new BuffaloBuffalo();

	@Test
	public void test0() {
		// when
		final String result = uut.check( "buffalo buffalo");

		// then
		Assertions.assertThat(result).isEqualTo("Good");
	}

	@Test
	public void test1() {
		// when
		final String result = uut.check( "buffalobuffalo");

		// then
		Assertions.assertThat(result).isEqualTo("Not good");
	}

	@Test
	public void test2() {
		// when
		final String result = uut.check( "buffalo buffalo buffalo");

		// then
		Assertions.assertThat(result).isEqualTo("Good");
	}

	@Test
	public void test3() {
		// when
		final String result = uut.check( "buf falo buffalo");

		// then
		Assertions.assertThat(result).isEqualTo("Not good");
	}

	@Test
	public void test4() {
		// when
		final String result = uut.check( "cow");

		// then
		Assertions.assertThat(result).isEqualTo("Not good");
	}

	@Test
	public void test5() {
		// when
		final String result = uut.check( "buffalo  buffalo");

		// then
		Assertions.assertThat(result).isEqualTo("Not good");
	}

}
