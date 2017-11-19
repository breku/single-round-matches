import org.junit.Test;
import static org.junit.Assert.*;

public class DistinctGridEasyTest {
	
	@Test(timeout=2000)
	public void test0() {
		int n = 3;
		int k = 3;
		int[] grid = new int[] {
0,1,2,
1,2,0,
2,0,1
};
		assertEquals("Good", new DistinctGridEasy().checkGrid(n, k, grid));
	}
	
	@Test(timeout=2000)
	public void test1() {
		int n = 3;
		int k = 3;
		int[] grid = new int[] {
0,1,2,
1,2,0,
2,0,0
};
		assertEquals("Bad", new DistinctGridEasy().checkGrid(n, k, grid));
	}
	
	@Test(timeout=2000)
	public void test2() {
		int n = 5;
		int k = 2;
		int[] grid = new int[] {
0,0,0,0,1,
0,1,0,0,0,
0,0,1,0,0,
1,0,0,0,0,
0,0,0,1,0
};
		assertEquals("Good", new DistinctGridEasy().checkGrid(n, k, grid));
	}
	
	@Test(timeout=2000)
	public void test3() {
		int n = 5;
		int k = 3;
		int[] grid = new int[] {
2,2,0,0,1,
0,1,2,2,0,
0,2,1,0,0,
1,0,0,0,2,
0,0,2,1,0
};
		assertEquals("Good", new DistinctGridEasy().checkGrid(n, k, grid));
	}
	
	@Test(timeout=2000)
	public void test4() {
		int n = 7;
		int k = 4;
		int[] grid = new int[] {
3,2,1,0,3,2,1,
3,2,1,3,2,1,2,
2,0,3,1,1,0,3,
1,3,0,2,0,3,0,
0,3,1,2,3,2,1,
1,1,1,2,1,0,3,
3,1,2,0,3,2,3
};
		assertEquals("Bad", new DistinctGridEasy().checkGrid(n, k, grid));
	}
}
