import org.junit.Test;
import static org.junit.Assert.*;

public class RelativeHeightsTest {
	
	@Test(timeout=2000)
	public void test0() {
		int[] h = new int[] {1,3,6,10,15,21};
		assertEquals(1, new RelativeHeights().countWays(h));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int[] h = new int[] {4,2,1,3};
		assertEquals(3, new RelativeHeights().countWays(h));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int[] h = new int[] {6,2,352,43,5,44};
		assertEquals(6, new RelativeHeights().countWays(h));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int[] h = new int[] {4,5,6,1,2,3};
		assertEquals(2, new RelativeHeights().countWays(h));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int[] h = new int[] {10,9,7,5,3,1,8,6,4,2};
		assertEquals(9, new RelativeHeights().countWays(h));
	}
}
