import org.junit.Test;
import static org.junit.Assert.*;

public class LongLiveZhangzjTest {
	
	@Test(timeout=2000)
	public void test0() {
		String[] speech = new String[] {"make", "topcoder", "great", "again"};
		String[] words = new String[] {"make", "america", "great", "again"};
		assertEquals(3, new LongLiveZhangzj().donate(speech, words));
	}
	
	@Test(timeout=2000)
	public void test1() {
		String[] speech = new String[] {"toads"};
		String[] words = new String[] {"toad"};
		assertEquals(0, new LongLiveZhangzj().donate(speech, words));
	}
	
	@Test(timeout=2000)
	public void test2() {
		String[] speech = new String[] {"a", "a"};
		String[] words = new String[] {"a"};
		assertEquals(2, new LongLiveZhangzj().donate(speech, words));
	}
	
	@Test(timeout=2000)
	public void test3() {
		String[] speech = new String[] {"je", "le", "ai", "deja", "vu", "et", "je", "le", "veux", "encore"};
		String[] words = new String[] {"i", "am", "having", "deja", "vu", "please", "stop", "the", "encore"};
		assertEquals(3, new LongLiveZhangzj().donate(speech, words));
	}
}
