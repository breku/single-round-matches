import org.junit.Test;
import static org.junit.Assert.*;

public class InterleavingParenthesisDiv2Test {
	
//	@Test(timeout=2000)
	@Test
	public void test0() {
		String s1 = "123";
		String s2 = "456";
		assertEquals(19, new InterleavingParenthesisDiv2().countWays(s1, s2));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String s1 = ")";
		String s2 = "(";
		assertEquals(1, new InterleavingParenthesisDiv2().countWays(s1, s2));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String s1 = "(((((";
		String s2 = ")))))";
		assertEquals(42, new InterleavingParenthesisDiv2().countWays(s1, s2));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String s1 = "()(()";
		String s2 = "))((())";
		assertEquals(10, new InterleavingParenthesisDiv2().countWays(s1, s2));
	}
	
	@Test(timeout=2000)
	public void test4() {
		String s1 = "()()()()()()()()()()()()()()()";
		String s2 = "()()()()()()()()";
		assertEquals(493841617, new InterleavingParenthesisDiv2().countWays(s1, s2));
	}
	
	@Test(timeout=2000)
	public void test5() {
		String s1 = "())())))";
		String s2 = "))((((";
		assertEquals(0, new InterleavingParenthesisDiv2().countWays(s1, s2));
	}
}
