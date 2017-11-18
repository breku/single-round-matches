

import com.brekol.srm722.HillClimber;
import org.fest.assertions.Assertions;
import org.junit.Test;

public class HillClimberTest {

	private HillClimber uut = new HillClimber();

	@Test
	public void test0() {
		// when
		final int result = uut.longest( new int[] { 1, 2, 3, 2, 2 });

		// then
		Assertions.assertThat(result).isEqualTo(2);
	}

	@Test
	public void test1() {
		// when
		final int result = uut.longest( new int[] { 1, 2, 2, 3 });

		// then
		Assertions.assertThat(result).isEqualTo(1);
	}

	@Test
	public void test2() {
		// when
		final int result = uut.longest( new int[] { 1, 8, 9, 12 });

		// then
		Assertions.assertThat(result).isEqualTo(3);
	}

	@Test
	public void test3() {
		// when
		final int result = uut.longest( new int[] { 10, 4, 4, 2 });

		// then
		Assertions.assertThat(result).isEqualTo(0);
	}

	@Test
	public void test4() {
		// when
		final int result = uut.longest( new int[] { 10, 8, 4, 9, 11, 14, 15, 3, 7, 8, 10, 6 });

		// then
		Assertions.assertThat(result).isEqualTo(4);
	}

}
