import org.junit.Test;
import static org.junit.Assert.*;

public class LongMansionDiv2Test {
	
	@Test(timeout=2000)
	public void test0() {
		int M = 3;
		int[] t = new int[] {1, 2, 1};
		assertEquals(6L, new LongMansionDiv2().minimalTime(M, t));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int M = 4;
		int[] t = new int[] {3, 2, 4, 2};
		assertEquals(17L, new LongMansionDiv2().minimalTime(M, t));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int M = 5;
		int[] t = new int[] {3, 2, 5, 4, 2, 8};
		assertEquals(32L, new LongMansionDiv2().minimalTime(M, t));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int M = 1000000000;
		int[] t = new int[] {1000};
		assertEquals(1000000000000L, new LongMansionDiv2().minimalTime(M, t));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int M = 1;
		int[] t = new int[] {1};
		assertEquals(1L, new LongMansionDiv2().minimalTime(M, t));
	}
}
