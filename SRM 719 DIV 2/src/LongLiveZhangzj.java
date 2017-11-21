import java.util.*;
import java.math.*;
import static java.lang.Math.*;

public class LongLiveZhangzj {
	
	public int donate(String[] speech, String[] words) {
		int result = 0;
		for (String word : words) {
			final List<String> speechWords = Arrays.asList(speech);
			final long count = speechWords.stream().filter(x -> x.equals(word)).count();
			result+=count;
		}
		return result;
	}
}
